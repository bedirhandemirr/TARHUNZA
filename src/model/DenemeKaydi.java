package model;

public class DenemeKaydi {
    
    private int ID;
    private String ad;
    private int kontenjan;

    public DenemeKaydi(int ID, String ad, int kontenjan) {
        this.ID = ID;
        this.ad = ad;
        this.kontenjan = kontenjan;

    }
    public int getID() {
        return ID;
    }
    public String getAd() {
        return ad;
    }
    
    public int getKontenjan() {
        return kontenjan;
    }

}
