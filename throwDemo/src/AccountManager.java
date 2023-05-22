public class AccountManager {

    private double balance;

    public void deposit(double amount) {
        balance = getBalance() + amount;

    }

    public void withdraw(double amount) {
        try {
            if (balance >= amount) {
                balance = getBalance() - amount;
                System.out.println("Paranız veriliyor lütfen ayrılmayın.");


            } else {
                throw new BalanceInsufficentException();
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }


    }

    public double getBalance() {
        return balance;
    }
}
