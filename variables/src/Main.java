// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("öğrenci sayısı : 9");
        // Java büyük küçük harf duyarlı bir dildir.
        // system.out.println(); yazsan çalışmaz.

        int OgrenciSayisi = 10;  // tam sayı tanımlıyoruz
        // isimlendirme ogreciSayisi gibi olur camel casing çok önemlidir.
        System.out.println("Öğrenci sayısı : "+OgrenciSayisi);

        OgrenciSayisi++;
        System.out.println("Öğrenci sayısı : "+OgrenciSayisi);


        //reausability tekrar kullanılabilirliktir kod tekrar kullanılabilir olmalıdır.
        OgrenciSayisi++;
        String mesaj = "Öğrenci Adeti  : ";
        System.out.println(mesaj + OgrenciSayisi);


     }
}