package gr.aueb.gr.ch18.service;

import gr.aueb.gr.ch18.dto.AccountDTO;
import gr.aueb.gr.ch18.model.Account;
import gr.aueb.gr.ch18.service.exceptions.*;
import java.util.List;

public interface IAccountService {

    Account openAccount(AccountDTO accountDTO) throws AccountExistsException, AccountsHoldLimitReachedException;

    void closeAccount(AccountDTO accountDTO) throws AccountCredentialNotValidException, RemoveBalanceException, AccountNotFoundException;

    Account getAccount(String iban) throws AccountCredentialNotValidException, AccountNotFoundException;

    Account getAccount(Long id) throws AccountCredentialNotValidException, AccountNotFoundException;

    void getAccountBalance(double balance) throws AccountNotFoundException;

    void depositIntoAccount(double amount) throws AccountNotFoundException;

    void withdrawFromAccount(double amount, String ssn) throws AccountNotFoundException, InsufficientBalanceException, WithdrawLimitExceededException;

    List<Account> getAllAccounts();
}


