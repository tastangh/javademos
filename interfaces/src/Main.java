public class Main {
    public static void main(String[] args) {


        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        //oracle'dan sql e geçince direkt aşağıdaki gibi yazabiliyon artık
        //CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();



    }
}