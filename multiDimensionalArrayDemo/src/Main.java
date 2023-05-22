// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[][] takimlar = new String[][]{{"GS", "FB", "BJK"}, {"ARS", "MC", "MU"}, {"MIL", "INT", "JUV"}};
        String[] ligler = new String[]{"Süperlig  ","PremierLig", "Serie A   "};
        for (int i= 0 ; i<=2 ;i++){
            System.out.print(ligler[i] + "  : ");
            for (int j=0; j<=2; j++){
                System.out.print(takimlar[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}