//uitlity
//ürünü kaydederken ürünün kurallara uygun olup olmadığıbı bulmak için
public class ProductValidator {
    //araç amacıyla kullanılan yapılarda statik kullanıyoz genelde utiltiylerde kullanıyo çok fazla kullanılmıyor.
    //  statikler new (yenileme) gerektirmiyor
    //
    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }


    }
//public static class BaskaBirClass {
//    public static void Sil() {
//
//    }
//}
//inner class

}
