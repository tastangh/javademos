public class BaseKrediManager {

    public double hesapla(double tutar) {
        // public final double hesapla (double tutar) yaparsan override edilemez yaparsın
        // ogrenci kredimanagerdeki hesapla() hata verir.
        return tutar * 1.18;

    }
}
