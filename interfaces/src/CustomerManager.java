public class CustomerManager {
    private ICustomerDal customerDal;// tek bu olunca programcı hata yapabiliyo

    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }

    public void add() {
        //iş kodları
//        OracleCustomerDal oracleCustomerDal = new OracleCustomerDal();
        //iş kodunda oracle yazdığın an bağımlı olmuşsun demek oluyor
        customerDal.Add();


    }

}
