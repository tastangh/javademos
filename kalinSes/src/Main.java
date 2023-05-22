
public class Main {
    public static void main(String[] args) {
        String mesaj = "Ali ata baktın da mı göremedin kanka ben anlamadım ki uçağa mı baktın ovaya mı ?";
        char[] kalinSes = new char[]{'a','ı','o','u'};
        int kalinSesSayici= 0;
        mesaj = mesaj.toLowerCase();
        for (int i=0; i<mesaj.length() ; i++ ){
            for (int j=0 ;j<kalinSes.length; j++){
             if(mesaj.charAt(i) == kalinSes[j]){
                 kalinSesSayici++;
             }
            }
        }
        System.out.println("\nMesajınızda " + kalinSesSayici + " adet kalın ünlü harf vardır.");
    }
}