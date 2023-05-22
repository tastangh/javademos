public class DortIslem {
    public  int topla(int anasayi,int... toplanacaksayilar){
        for(int sayi:toplanacaksayilar){
            anasayi+=sayi;
        }
        return  anasayi;
    }
    public  int carp(int anasayi,int... carpilacaksayilar){
        for(int sayi:carpilacaksayilar){
            anasayi= anasayi * sayi;
        }
        return  anasayi;
    }

    public  int cikar(int anasayi,int... cikarilacaksayilar){
        for(int sayi:cikarilacaksayilar){
            anasayi -= sayi;
        }
        return  anasayi;
    }

    public  int bol(int anasayi,int... boluneceksayilar){
        for(int sayi:boluneceksayilar){
            if (sayi == 0){
                System.out.println("Sayılar 0'a bölünemez");
                return anasayi;
            }
            anasayi = anasayi/sayi;
        }
        return  anasayi;
    }

}
