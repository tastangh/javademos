public class Main {
    public static void main(String[] args) {

        // Arkadaş sayı
        // 220-284 en küçük bilinen
        // kendileri hariç pozitif tam bölenlerinin toplamı birbirine eşit olan sayılara denir.
        // yani a sayısının bölenleri toplamı b olacak.
        // b sayısının bölenleri toplamı a olacak.
        // böylece a ve b tam sayısı arkadaş sayı olur.

        int sorgulanacakSayi1 = 220;
        int sorgulanacakSayi2 = 284;
        int bolenlertoplami1 = 0;
        int bolenlertoplami2 = 0;
        if (sorgulanacakSayi1 == sorgulanacakSayi2) {
            System.out.println("\nZaten aynı sayıları girdin knk");
            return;
        }

        for (int i = 1; i < sorgulanacakSayi1; i++) {
            if ((sorgulanacakSayi1 % i) == 0) {

                bolenlertoplami1 = bolenlertoplami1 + i;
            }
        }
        for (int j = 1; j < sorgulanacakSayi2; j++) {
            if ((sorgulanacakSayi2 % j) == 0) {
                bolenlertoplami2 = bolenlertoplami2 + j;
            }
        }
        if (bolenlertoplami1 == sorgulanacakSayi2 && bolenlertoplami2 == sorgulanacakSayi1) {
            System.out.println("\n" + sorgulanacakSayi1 + " sayısı ve " + sorgulanacakSayi2 + " sayısı arkadaş sayıdır");
        } else {
            System.out.println("\n" + sorgulanacakSayi1 + " sayısı ve " + sorgulanacakSayi2 + " sayısı arkadaş sayı değildir");
        }

    }
}