package model;

public class Basvuru {
    private int etkinlikId;
    private int katilimciId;
    private BasvuruDurumu durum;

    public Basvuru(int ektinlikId, int katilimciId, BasvuruDurumu durum){
        this.etkinlikId = etkinlikId;
        this.katilimciId = katilimciId;
        this.durum = durum;
    }
     public int getEtkinlikId() {
        return etkinlikId;
    }

    public int getKatilimciId() {
        return katilimciId;
    }

    public BasvuruDurumu getDurum() {
        return durum;
    }

    public void setDurum(BasvuruDurumu durum) {
        this.durum = durum;
    }

    public void bilgileriGoster() {
        System.out.println("Etkinlik ID: " + etkinlikId);
        System.out.println("Katilimci ID: " + katilimciId);
        System.out.println("Durum: " + durum);
    }

}
