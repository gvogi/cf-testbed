package gr.aueb.gr.ch18.service.exceptions;

public class WithdrawLimitExceededException extends Exception {
    private final static long serialVersionUID = 1L;

    public WithdrawLimitExceededException(double amount) {
        super("Withdrawal limit exceeded: " + amount + "$" + " daily limit is 500$");
    }
}
