public class Main {
    double ucret;
    public double zamYap(double oran) {
        ucret += (ucret * oran) / 100;
        return ucret;
    }

    public double ucretAl(String sebzeismi) {
        if (sebzeismi == "domates") {
            ucret = 10.4;
        } else if (sebzeismi == "patlıcan") {
            ucret = 8.2;
        }

        return ucret;
    }

    public double indirimYap(double oran) {
        ucret -= (ucret * oran) / 100;
        return ucret;
    }

    public static  int topla(int... sayilar){
        int toplam = 0 ;
        for(int sayi:sayilar){
            toplam+=sayi;
        }
        return  toplam;
}


    public static void main(String[] args) {
        Main newobject = new Main();
        newobject.ucret = newobject.ucretAl("domates");

        System.out.println("Marketteki güncel domates fiyatı : " + newobject.ucret  + " TL");
        newobject.ucret = newobject.zamYap(38.8);
        System.out.println("Marketteki zamlanmış domates fiyatı : " + newobject.ucret  + " TL");
        newobject.ucret = newobject.indirimYap(24.6);
        System.out.println("Marketteki indirimli domates fiyatı : " + newobject.ucret  + " TL");

        int toplam = topla(1,2,3,4,5,6);
        System.out.println(toplam);


    }
}