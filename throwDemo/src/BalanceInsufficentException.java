public class BalanceInsufficentException extends Exception {
    String message = "YETERSİZ BAKİYE";

    public BalanceInsufficentException() {

    }

    public String getMessage() {
        return this.message;
    }


}
