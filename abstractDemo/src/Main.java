public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        //yeni database eklenince aşağıyı değiştirmek yeterli olacak artık.
        customerManager.databaseManager = new SqlServerDatabaseManager();

        customerManager.getCustomers();
        // BİR SİSTEME YENİ BİR ÖZELLİK GELDİĞİNDE BAŞKA BİR YERDE KODU DEĞİŞTİRMEN GEREKİYORSA KODDA BİR SORUN VAR DEMEKTİR.

    }
}