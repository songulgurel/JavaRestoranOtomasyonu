package Restoran;
public class Urun {
    private String ad;
    private double fiyat;
    
    // Yapıcı (Constructor)
    public Urun(String ad, double fiyat) {
        this.ad = ad;
        this.fiyat = fiyat;
    }
    
    // Getterlar
    public String getAd() {
        return ad;
    }
    
    public double getFiyat() {
        return fiyat;
    }

    // toString metodu (Bu metodu kullanarak ürünlerin yazdırılmasını sağlarız)
    @Override
    public String toString() {
        return ad + " - " + fiyat + " TL";
    }
}
