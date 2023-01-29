package gr.aueb.gr.ch18.service.exceptions;

import gr.aueb.gr.ch18.model.Account;

public class InsufficientBalanceException extends Exception {
    private final static long serialVersionUID = 1L;

    public InsufficientBalanceException(Account account) {
        super("Insufficient balance, your current balance is " + account.getBalance() + "$");
    }
}
