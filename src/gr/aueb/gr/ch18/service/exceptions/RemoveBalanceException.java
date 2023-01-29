package gr.aueb.gr.ch18.service.exceptions;

import gr.aueb.gr.ch18.model.Account;

public class RemoveBalanceException extends Exception {
    private final static long serialVersionUID = 1L;

    public RemoveBalanceException(Account account) {
        super("Account still has balance: " + account.getBalance() + "$ withdraw before terminating the account");
    }
}
