import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String,String> sozluk = new HashMap<String,String>();
        sozluk.put("book","kitap");
        sozluk.put("table","masa");
        sozluk.put("computer","bilgisayar");

        System.out.println(sozluk);
        System.out.println(sozluk.get("table"));


        for (String item : sozluk.keySet()){
            System.out.println("Eleman -> " +item +"\t Değer -> "+sozluk.get(item));
        }


        sozluk.remove("table");
        System.out.println(sozluk.get("table"));









    }
}