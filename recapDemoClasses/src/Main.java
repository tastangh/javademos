public class Main {
    public static void main(String[] args) {

        //Hesap makinesi
        DortIslem dortIslem = new DortIslem();
        int Sayi=1999;
        Sayi = dortIslem.topla(Sayi,6,7,8,9,1453,5);
        System.out.println(Sayi);

        Sayi = dortIslem.cikar(Sayi,5,6,7,8,9,1453,-1);
        System.out.println(Sayi);

        Sayi = dortIslem.carp(Sayi,5,2);
        System.out.println(Sayi);

        Sayi = dortIslem.bol(Sayi,5,4);
        System.out.println(Sayi);

    }
}