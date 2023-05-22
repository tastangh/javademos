public class Main {
    public static void main(String[] args) {
  /*      OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        ogretmenKrediManager.Hesapla();*/

        KrediUI krediUI = new KrediUI();

        krediUI.krediHesapla(new OgretmenKrediManager());
        krediUI.krediHesapla(new AskerKrediManager());
        //Polymorphism işte tam olarak bu aslında.


    }
}