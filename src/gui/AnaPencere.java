package gui;

import javax.swing.*; // JFrame, JPanel, JLabel ve JButton için gerekli
import java.awt.*; // BorderLayout ve GridLayout için gerekli

public class AnaPencere extends JFrame { // AnaPencere sınıfımızı oluşturduk

    private JLabel bilgiYazisi; // Butonlara bastığımız zaman değişecek yazı.

    public AnaPencere() { // AnaPencerenin kurulum işlemleri...
    
        // PENCERE AYARLARI

        setTitle("Kampüs Etkinlik Yönetim Sistemi"); // Pencere başlığı
        setSize(700, 400); // Pencerenin genişliği ve yüksekliği
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Pencereyi kapatınca programı bitir.
        setLocationRelativeTo(null); // Pencereyi ekranın ortasına aç
        setLayout(new BorderLayout()); // Pencerenin yerleşim düzenini belirle

        // BAŞLIK BÖLÜMÜ

        JPanel baslikPaneli = new JPanel(); // Başlık için bir panel oluştur
        JLabel baslik = new JLabel("KAMPÜS ETKİNLİK YÖNETİM SİSTEMİ"); // Başlık
        baslikPaneli.add(baslik); // Başlığı panele ekle
        add(baslikPaneli, BorderLayout.NORTH); // Başlığı penerenin üstüne yerleştirdik

        // MENÜ BÖLÜMÜ

        JPanel menuPaneli = new JPanel(); // Menü için Panel oluşturur
        menuPaneli.setLayout(new GridLayout(3, 1)); // 3 butonumuz alt alta dizildi

        JButton etkinlikButonu = new JButton("Etkinlikler"); // Etkinlikler butonu
        JButton katilimciButonu = new JButton("Katılımcılar"); // Etkinlikler butonu
        JButton basvuruButonu = new JButton("Başvurular"); // Etkinlikler butonu

        menuPaneli.add(etkinlikButonu); // Etkinlik Butonunu panele ekleriz
        menuPaneli.add(katilimciButonu); // Katılımcı Butonunu panele ekleriz
        menuPaneli.add(basvuruButonu); // Basvuru Butonunu panele ekleriz

        add(menuPaneli, BorderLayout.WEST); // Menü panelini penceremizin sonuna yerleştiririz.

        // İÇERİK BÖLÜMÜ

        JPanel icerikPaneli = new JPanel(); // İçerik paneli oluşturduk
        bilgiYazisi = new JLabel("Lütfen bir bölüm seçiniz."); // Başlangıçta gösterilecek yazı
        icerikPaneli.add(bilgiYazisi); // Yazıyı içerik paneline ekler
        add(icerikPaneli, BorderLayout.CENTER); // içerik panelini penceremizin merkezine yerleştiririz.
        
        // BUTON İŞLEMLERİ 

        // Butona basıldığında ilgili yazının gösterlilmesi için ActionListener ekliyoruz.
        etkinlikButonu.addActionListener(e ->
            bilgiYazisi.setText("Etkinlikler Bölümü Seçildi.")
        );

        katilimciButonu.addActionListener(e ->
            bilgiYazisi.setText("Katılımcılar Bölümü Seçildi.")
        );

        basvuruButonu.addActionListener(e ->
            bilgiYazisi.setText("Başvurular Bölümü Seçildi.")
        );
 }

       // PROGRAMIN BAŞLANGIÇ NOKTASI
     
       public static void main(String[] args) {

        // Swing Arayüzünün doğru bir şekilde başlatılmasını sağlar
        SwingUtilities.invokeLater(() -> {

            AnaPencere pencere = new AnaPencere(); // AnaPencere sınıfından bir nesne oluşturur
            pencere.setVisible(true); // Pencereyi görünür hale getirir.
        });
       }
    }