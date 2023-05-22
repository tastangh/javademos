public class Main {
    public static void main(String[] args) {

        try {
            int[] sayilar = new int[]{1, 2, 3};
            System.out.println(sayilar[5]);
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println("hata varr : StringIndexOutOfBoundsException");
            System.out.println(exception);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("hata varr : ArrayIndexOutOfBoundsException");
            System.out.println(exception);
        } catch (Exception exception) {
            System.out.println("farklı bir hata var araştırılmalı");
        } finally {
            System.out.println("try'a da catch'e de girse çalışan blok");
        }
        


    }
}