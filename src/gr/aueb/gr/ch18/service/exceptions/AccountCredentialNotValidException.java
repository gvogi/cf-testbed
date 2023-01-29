package gr.aueb.gr.ch18.service.exceptions;

import gr.aueb.gr.ch18.model.Account;

public class AccountCredentialNotValidException extends Exception {
    private final static long serialVersionUID = 1L;

    public AccountCredentialNotValidException(Account account) {
        super("Invalid credentials action aborted");
    }
}
