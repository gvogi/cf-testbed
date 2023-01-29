package gr.aueb.gr.ch18.dao;

import gr.aueb.gr.ch18.dto.AccountDTO;
import gr.aueb.gr.ch18.model.Account;
import gr.aueb.gr.ch18.model.Holder;

import java.util.ArrayList;
import java.util.List;

public class AccountDAOImpl implements IAccountDAO {
    private static final List<Account> accounts = new ArrayList<>();

    @Override
    public Account open(Account account) {
//        if (!accountsNumExceeded(account.getHolder().getSsn())) {
            accounts.add(account);
//        }
        return account;
    }

    @Override
    public void close(String iban, String ssn) {
        accounts.removeIf((account) -> (account.getIban().equals(iban) && holderSsnExists(account, ssn) && account.getBalance() == 0));
    }

//    @Override
//    public Account get(Holder holder) {
//        return null;
//    }

    @Override
    public Account get(String iban) {
        int pos = getAccountByIban(iban);
        if (pos == -1) return null;
        return accounts.get(pos);
    }

    @Override
    public Account get(Long id) {
        int pos = getAccountById(id);
        if (pos == -1) return null;
        return accounts.get(pos);
    }

    @Override
    public void get(double balance) {

    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount, String ssn) {

    }

    @Override
    public List<Account> getAll() {
        return new ArrayList<>(accounts);
    }

    @Override
    public boolean holderSsnExists(Account account, String ssn) {
        return account.getHolder().getSsn().equals(ssn);
    }

    @Override
    public boolean accountIbanExists(String iban) {
        return getAccountByIban(iban) != -1;
    }

    @Override
    public boolean holderIdExists(Long id) {
        return getAccountById(id) != -1;
    }

    @Override
    public boolean accountsNumExceeded(String ssn) {
        int countAccounts = 0;

        for (Account account : accounts) {
            if (holderSsnExists(account, ssn) && (countAccounts <= 3)) {
                countAccounts++;
            }
        }

        return true;
    }

    private int getAccountByIban(String iban) {
        int pos = -1;

        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getIban().equals(iban)){
                pos = i;
                break;
            }
        }

        return pos;
    }

    private int getAccountById(Long id) {
        int pos = -1;

        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getId().equals(id)){
                pos = i;
                break;
            }
        }

        return pos;
    }
}