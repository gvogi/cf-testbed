package gr.aueb.gr.ch18.service.exceptions;

import gr.aueb.gr.ch18.model.Account;

public class AccountExistsException extends Exception {
    private final static long serialVersionUID = 1L;

    public AccountExistsException(Account account) {
        super("Account " + account.toString() + " already exists");
    }

    public AccountExistsException(String iban) {
        super("Account with iban: " + iban + " already exists");
    }

    public AccountExistsException(Long id) {
        super("Account with id: " + id + " already exists");
    }
}
