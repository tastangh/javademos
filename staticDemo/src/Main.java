public class Main {
    public static void main(String[] args) {

        ProductManager manager= new ProductManager();
        Product product = new Product();
        product.price=15;
        product.name="Mouse";
        manager.add(product);

        DatabaseHelper.Connection.createConnection();




    }
}