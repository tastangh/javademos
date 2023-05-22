public class Main {
    public static void main(String[] args) {

        AccountManager manager = new AccountManager();
        System.out.println("Bakiye = " +manager.getBalance());
        manager.deposit(199);
        System.out.println("Bakiye = " +manager.getBalance());
        manager.withdraw(99);
        System.out.println("Bakiye = " +manager.getBalance());
        manager.withdraw(105);
        System.out.println("Bakiye = " +manager.getBalance());

    }
}