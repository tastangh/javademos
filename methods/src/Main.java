public class Main {
    public  static  void sayiBulmaca(int sorgulanacak){ //camel casing func ismi
        int[] sayilar = new int[]{1, 2, 5, 6, 7, 9, 0, 7, 10, 8, 9, 0, 46, 7, 5, 4, 3, 2, 1, 0, 4, 5, 3};
        int kactane = 0;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] == sorgulanacak) {
                kactane++;
            }
        }
        if (kactane==0){
            System.out.println("Dizinizde hiç " +sorgulanacak + " sayısı yoktur :(");
        }
        else {
            System.out.println("dizinizde " +kactane + " adet " + sorgulanacak + " sayisi vardir.");
        }
    }
    public static void main(String[] args)
    {
        sayiBulmaca(7);
    }
}