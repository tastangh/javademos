import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(3,"mehmet","taştan"));
        customers.add(new Customer(2,"burak","deniz"));
        customers.add(new Customer(1,"yususfcan","anar"));

        for (Customer customer: customers){
            System.out.println(customer.firstName);
        }




    }
}