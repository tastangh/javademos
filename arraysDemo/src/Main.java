// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String[] futbolTakimlari = new String[3];
        futbolTakimlari[0] = "Galatasaray";
        futbolTakimlari[1] = "Fenerbahçe" ;
        futbolTakimlari[2] = "Beşiktaş" ;

        for(int i=0;i<futbolTakimlari.length;i++){
            System.out.println(i+1 +".Şampiyonluk Adayı : " + futbolTakimlari[i]  );
        }

        System.out.println("\nLig Sıralaması");
        for (String Superlig:futbolTakimlari){
            System.out.println("--------------\n" + Superlig);
        }
        System.out.println("--------------\n");
    }
}