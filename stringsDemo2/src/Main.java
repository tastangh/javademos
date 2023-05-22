public class Main {
    public static void main(String[] args) {
        String mesaj = "Mehmet Taştan 2023 ANKARA";
        System.out.println(mesaj);

        // Mesajın içindeki karakterleri değiştirme değiştirme
        System.out.println(mesaj.replace(' ','/'));
        String Tanim = mesaj.replace(' ','_');
        System.out.println(Tanim);

        //Metnin içinden parça almak (son indexi dahil etmiyor 'e kadar mantığı var)
        System.out.println("Soyad : "+ mesaj.substring(7,13));

        //Metni parçalara ayırmak
        for (String kelime : mesaj.split((" "))){
            System.out.println(kelime);
        }

        //mesajı komple küçük-büyük harfe çevirmek
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

        //Mesajın başındaki sonundaki anlamsız boşlukları kaldırmak.
        mesaj = "              Mehmet Taştan 2023 ANKARA       ";
        System.out.println(mesaj);
        System.out.println(mesaj.trim());

    }
}