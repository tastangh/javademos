//built-in -> javada bu var demek

import matematik.DortIslem;
import matematik.Logaritma;
//import matematik.*; matematik paketindeki tüm classları getir demek.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ad giriniz : ");
        String isim = scanner.nextLine();
        System.out.println("Merhaba "+ isim);

        DortIslem dortIslem = new DortIslem();
        dortIslem.topla(2,3);
        Logaritma logaritma=new Logaritma();


    }
}