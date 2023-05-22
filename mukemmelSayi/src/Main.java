public class Main {
    public static void main(String[] args) {

        // Sayinin mükemmel olup olmadığını bulmak
        // kendinden başka pozitif tüm bölenlerinin  sayısı kendine eşit olan sayıdır.
        // 6 ---> 1,2,3
        // 28 --> 1,2,4,7,14

        int sorgulanacakSayi1 = 8128;
        int bolenlertoplami = 0;

        for (int i = 1; i < sorgulanacakSayi1; i++) {
            if ((sorgulanacakSayi1 % i) == 0) {
                bolenlertoplami = bolenlertoplami + i;
            }
        }
        
        if (bolenlertoplami != sorgulanacakSayi1 || sorgulanacakSayi1 <1 ) {
            System.out.println("\naAAA maalesef " + sorgulanacakSayi1 + " Sayısı mükemmel değil :(");

        } else {
            System.out.println("\nVaoooovvv " + sorgulanacakSayi1 + " Sayısı ne kadar da mükemmel :) ");
        }

    }
}