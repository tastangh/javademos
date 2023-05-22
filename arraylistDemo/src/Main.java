import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList sayilar = new ArrayList();
        System.out.println(sayilar.size());
        sayilar.add(1);
        sayilar.add(10);
        System.out.println(sayilar.size());
        sayilar.add("MEHMET");
        System.out.println(sayilar.size());

        System.out.println(sayilar.get(0));
        System.out.println(sayilar.get(2));
        ///varolan indexlerin içeriğini değiştirmek
        sayilar.set(0, 999);
        System.out.println(sayilar.get(0));

//        //indexi silmek
//        sayilar.remove(0);
//        // index silinince artık index 1 index 0 'a kayıyor.
//        System.out.println(sayilar.get(0));

        //array list'in tüm elemanlarını silmek
//        sayilar.clear();
        //tüm elemanlar silindiği için artık hata vercek
//        System.out.println(sayilar.get(0));
//for int değil objcet olmalı çünkü sayılar obje
        for (Object i:sayilar) {
            System.out.println(i);
        }


    }
}