public class Main {
    public static void main(String[] args) {

        //Örnek
        int number = 43;
        //kalan operatörü
        int remainder = number % 5;
        System.out.println(number + " sayısının 5 ile bölümünden kalan : " + remainder);

        //Asal Sayı olup olmadığını bulmak.
        int sorgulanacakSayi1 = 900;
        String asallik = "Asal Değil";
        int bolensayisi = 0;
        for (int i = 2; i < sorgulanacakSayi1; i++) {
            if ((sorgulanacakSayi1 % i) == 0) {
                bolensayisi++;
            }
        }
        if (bolensayisi!=0 || sorgulanacakSayi1==1 || sorgulanacakSayi1<1){
            asallik = "Asal Değil";
            if (bolensayisi !=0){
                System.out.println(sorgulanacakSayi1 +" sayısı , " + bolensayisi + " tane ayrı sayıya bölünebilir." );
            }
        }
        else
        {
            asallik="Asal";
        }
        System.out.println(sorgulanacakSayi1 +"  sayısı  "+asallik +".");

}
}