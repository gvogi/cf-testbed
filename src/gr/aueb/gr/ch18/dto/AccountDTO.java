package gr.aueb.gr.ch18.dto;

import gr.aueb.gr.ch18.model.Holder;

public class AccountDTO {
    private Long accountId;
    private HolderDTO holderDTO;
    private String iban;
    private double balance;

    public AccountDTO() {
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public HolderDTO getHolderDTO() {
        return holderDTO;
    }

    public void setHolder(HolderDTO holderDTO) {
        this.holderDTO = holderDTO;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
