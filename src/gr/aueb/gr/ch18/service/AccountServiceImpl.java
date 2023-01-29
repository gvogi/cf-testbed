package gr.aueb.gr.ch18.service;

import gr.aueb.gr.ch18.dao.IAccountDAO;
import gr.aueb.gr.ch18.dto.AccountDTO;
import gr.aueb.gr.ch18.dto.HolderDTO;
import gr.aueb.gr.ch18.model.Account;
import gr.aueb.gr.ch18.model.Holder;
import gr.aueb.gr.ch18.service.exceptions.*;

import java.util.List;

public class AccountServiceImpl implements IAccountService {
    private final IAccountDAO dao;

    public AccountServiceImpl(IAccountDAO dao) {this.dao = dao;}

    @Override
    public Account openAccount(AccountDTO accountDTO) throws AccountExistsException, AccountsHoldLimitReachedException {
        Account account;
        try {
            account = new Account();
            mapAccount(account, accountDTO);

            if (dao.accountIbanExists(account.getIban())) {
                throw new AccountExistsException(account);
            }

            if (dao.holderIdExists(account.getId())) {
                throw new AccountExistsException(account);
            }

            if (dao.holderSsnExists(account, account.getHolder().getSsn())) {
                throw new AccountExistsException(account);
            }

            if (dao.accountsNumExceeded(account.getHolder().getSsn())) {
                throw new AccountsHoldLimitReachedException(account);
            }

            return dao.open(account);
        } catch (AccountExistsException | AccountsHoldLimitReachedException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void closeAccount(AccountDTO accountDTO) throws AccountCredentialNotValidException, RemoveBalanceException, AccountNotFoundException {
//        Account account;
//        try {
////            account = new Account();
////            mapAccount(account, accountDTO);
//
//            if (!dao.accountIbanExists(accountDTO.getIban()))
////                    |
////                    dao.holderSsnExists(account, account.getHolder().getSsn()))){
//                throw new AccountNotFoundException(accountDTO.getAccountId());
////            }
//
//            dao.close(accountDTO.getIban(), accountDTO.getHolderDTO().getSsn());
//        } catch (AccountCredentialNotValidException | RemoveBalanceException | AccountNotFoundException e1) {
//            e1.printStackTrace();
//            throw e1;
//        }
    }

    @Override
    public Account getAccount(String iban) throws AccountCredentialNotValidException, AccountNotFoundException {
        return null;
    }

    @Override
    public Account getAccount(Long id) throws AccountCredentialNotValidException, AccountNotFoundException {
        return null;
    }

    @Override
    public void getAccountBalance(double balance) throws AccountNotFoundException {

    }

    @Override
    public void depositIntoAccount(double amount) throws AccountNotFoundException {

    }

    @Override
    public void withdrawFromAccount(double amount, String ssn) throws AccountNotFoundException, InsufficientBalanceException, WithdrawLimitExceededException {

    }

    @Override
    public List<Account> getAllAccounts() {
        return null;
    }

    private void mapAccount(Account account, AccountDTO accountDTO) {
        account.setIban(accountDTO.getIban());
        account.setBalance(accountDTO.getBalance());
        Holder holder = new Holder();
        mapHolder(holder, accountDTO.getHolderDTO());
        account.setHolder(holder);
    }

    private void mapHolder(Holder holder, HolderDTO holderDTO) {
        holder.setFirstname(holderDTO.getFirstname());
        holder.setLastname(holderDTO.getLastname());
        holder.setSsn(holderDTO.getSsn());
    }
}
