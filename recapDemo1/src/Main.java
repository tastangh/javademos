// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int sayi1,sayi2,sayi3;
        sayi1=190;
        sayi2=180;
        sayi3=70;
        int enkucukssayi;
        String aciklama ="en küçük sayı : " ;

        if (sayi1<sayi2){
            if(sayi1<sayi3){
                enkucukssayi=sayi1;
            }
            else{
                enkucukssayi=sayi3;
            }
        }
        else {
            if (sayi2 < sayi3) {
                enkucukssayi = sayi2;
            }
            else {
                enkucukssayi =sayi3;
            }
        }
        System.out.println(aciklama+enkucukssayi);
    }
}