public class Main {
    public static void main(String[] args) {

        Product product = new Product(
                1,
                "Laptop",
                "15.6 inc İ7 processor RTX3060Ti 32GB Ram 1TB SSD",
                26000,
                100,
                "yeşil"
        );
        //product.setName("Laptop");
        //product.setId(1);
        // product.setDescription("15.6 inc İ7 processor RTX3060Ti 32GB Ram 1TB SSD");
        //product.setPrice(26000);
        //product.setStockAmount(3);
        Product product2 = new Product();
        product2.setName("Telefon");
        product2.setId(2);
        product2.setStockAmount(100);
        product2.setPrice(10000);

        ProductManager productManager=new ProductManager();
        productManager.Add(product);
        productManager.Add(product2);
        System.out.println(product.getKod());
        System.out.println(product2.getKod());





    }
}