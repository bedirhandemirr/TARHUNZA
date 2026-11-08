package persistence;

import model.DenemeKaydi;

import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;

public class DosyaYoneticisi {
  
    private final Path veriKlasoru = Path.of("data");

    public void klasoruHazirla() throws IOException {
        Files.createDirectories(veriKlasoru);
    } 

    public void denemeDosyasiOlustur() throws IOException{
        
        Path dosya = veriKlasoru.resolve("deneme.kes");
        Files.createFile(dosya);
    }

    public void denemeKaydet() throws IOException{
        Path dosya = veriKlasoru.resolve("deneme.kes");

        try(BufferedWriter yazici = Files.newBufferedWriter(dosya))
        {
            
            yazici.write("101|Yapay Zeka Semineri|30");
            yazici.newLine();
            yazici.write("102|Kariyer Gunu|50");
            yazici.newLine();
        }
    }

    public String denemeOku() throws IOException{
        Path dosya = veriKlasoru.resolve("deneme.kes");

        try(BufferedReader okuyucu= Files.newBufferedReader(dosya))
        {
            String satir = okuyucu.readLine();
            return satir;
        }
    }

    public void tumSatirlariOku() throws IOException{
        Path dosya = veriKlasoru.resolve("deneme.kes");

        try(BufferedReader okuyucu= Files.newBufferedReader(dosya))
        {
            String satir;
            while((satir = okuyucu.readLine()) != null){
                System.out.println(satir);
                if(satir.contains("|")){
                    String[] parcalar = satir.split("\\|");

                    int etkinlikID = Integer.parseInt(parcalar[0]);
                    int kontenjan = Integer.parseInt(parcalar[2]);
                    
                    DenemeKaydi kayit = new DenemeKaydi(etkinlikID, parcalar[1], kontenjan);

                    System.out.println("Etkinlik ID: " + kayit.getID());
                    System.out.println("Etkinlik Adi: " + kayit.getAd());
                    System.out.println("Kontenjan: " + kayit.getKontenjan());
                }
            }
        }
    }

    
}
