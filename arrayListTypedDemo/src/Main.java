import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> sehirler = new ArrayList<String>();
        // hangi tipte çalışcağımızı belirtiyoruz
        sehirler.add("aydın");
        sehirler.add("izmir");
        sehirler.add("istanbul");
        sehirler.add("ankara");

        System.out.println(sehirler.get(2));
        // eleman bazlı da silme yapabiliyoruz
        sehirler.remove("istanbul");
        System.out.println(sehirler.get(2));

        Collections.sort(sehirler); //alfabetik sıraya sokuyor
        for (String sehir : sehirler) {
            System.out.println(sehir);
        }



    }
}