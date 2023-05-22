public class OracleCustomerDal implements ICustomerDal{
// ICustomerDal'ı implemente eden herkes onun fonkisyonlarını sağlamalı
    @Override
    public void Add() {
        System.out.println("Oracle eklendi.");
    }
}
;