package gr.aueb.gr.ch18.dao;

import gr.aueb.gr.ch18.model.Account;
import gr.aueb.gr.ch18.model.Holder;

import java.util.List;

public interface IAccountDAO {
    Account open(Account account);
    void close(String iban, String ssn); //Holder holder
//    Account get(Holder holder);
    Account get(String iban);
    Account get(Long id);
    void get(double balance);
    List<Account> getAll();

    void deposit(double amount);
    void withdraw(double amount, String ssn);

   boolean holderSsnExists(Account account, String ssn);

   boolean accountsNumExceeded(String ssn);

   boolean accountIbanExists(String iban);

   boolean holderIdExists(Long id);
}
