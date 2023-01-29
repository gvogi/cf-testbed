package gr.aueb.gr.ch18.service.exceptions;

import gr.aueb.gr.ch18.model.Account;

public class AccountsHoldLimitReachedException extends Exception {
    private final static long serialVersionUID = 1L;

    public AccountsHoldLimitReachedException(Account account) {
        super("Cannot Hold more than 3 accounts, action aborted");
    }
}
