// public her yerden erişilebilir demek.
public class Product {
    // ürünlerin özelliklerini barındırır
    // her classs bir özellilikler barındırır.
    //attribute | field
    //private int id; // özel demek sadece tanımlandığı blokta geçerlidir demek oluyor main'de kullanamazsın sadece
    // sadece product class'ındaki metotlarda kullanılır.

    public Product(int id , String name , String description, double price,int stockAmount ,String renk){
        //Yukardaki constructor parantezinin içine yazılan parametrelerle ben productın özelliklerinin tümünü verirsen sana öyle kullandırırım demiş oluyon.
        this.id= id;
        this.name=name;
        this.description=description;
        this.price=price;
        this.stockAmount=stockAmount;
        this.renk=renk;

        System.out.println("Yapıcı blok çalıştı.");
    }
 // OVERLOADING isteyen istediğini kullansın diye
    public Product(){

    }
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;


    //getters
    public int getId() {
        return id;
    }

    //setter
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1) + id;
    }

}
