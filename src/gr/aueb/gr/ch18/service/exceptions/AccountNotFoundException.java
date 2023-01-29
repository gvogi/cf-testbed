package gr.aueb.gr.ch18.service.exceptions;

import gr.aueb.gr.ch18.model.Account;

public class AccountNotFoundException extends Exception {
    private final static long serialVersionUID = 1L;

    public AccountNotFoundException(Account account) {
        super("Account " + account.toString() + " was not found");
    }

    public AccountNotFoundException(String iban) {
        super("Account with iban: " + iban + " was not found");
    }

    public AccountNotFoundException(Long id) {
        super("Account with id: " + id + " was not found");
    }
}
