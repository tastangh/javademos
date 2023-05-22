public class Main {
    public static void main(String[] args) {

        String mesaj = "Mehmet Taştan 2023 ANKARA";

        //Mesaj
        System.out.println(mesaj);

        // Mesajın kelime uzunluğu eleman sayısı ( boşluklar dahil )
        System.out.println("Mesaj uzunluğu : " + mesaj.length() + " karakter");

        // n. elemanının ne olduğunu bulma
        System.out.println("8. eleman : " + mesaj.charAt(7));

        // Mesajın sonuna ekleme yapma
        System.out.println(mesaj.concat(" DSS BACKEND DEVELOPMENT"));

        //Mesajın en başındaki harfin ne olduğunu sorgulamak
        System.out.println(mesaj.startsWith("M"));
        System.out.println(mesaj.startsWith("A"));

        //Mesajın en sonundaki harfin ne olduğunu sorgulamak
        System.out.println(mesaj.endsWith("M"));
        System.out.println(mesaj.endsWith("a"));
        System.out.println(mesaj.endsWith("A"));

        // Mesajdaki karakteri almak (mesajın kaçıncı arrayden almaya başla, kaçınca arraya kadar al , nereye yaz ,
        // yazdığın yerin kaçıncı arrayinden yazmaya başla.
        char[] isim = new char[6];
        mesaj.getChars(0, 6, isim, 0);
        System.out.println(isim);

        // yazılan karakterin mesajdaki ilk yerini bulmak
        System.out.println(mesaj.indexOf('a'));
        //aramaya sondan başlanan hali
        System.out.println(mesaj.lastIndexOf('a'));

    }
}