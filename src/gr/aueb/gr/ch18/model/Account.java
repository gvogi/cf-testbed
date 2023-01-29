package gr.aueb.gr.ch18.model;

public class Account extends AbstractEntity {
    private Holder holder;
    private String iban;
    private double balance;

    public Account() {
    }

    public Account(Holder holder, String iban, double balance) {
        this.holder = holder;
        this.iban = iban;
        this.balance = balance;
    }

    public Holder getHolder() {
        return holder;
    }

    public void setHolder(Holder holder) {
        this.holder = holder;
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

//    public String convertToString() {
//        return holder.convertToString() + ", " + iban + ", " + String.format("%.2f", balance);
//    }


    @Override
    public String toString() {
        return "Account{" +
                "id= " + getId() +
                "holder=" + holder +
                ", iban='" + iban + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

//        if (Double.compare(account.getBalance(), getBalance()) != 0) return false;
//        if (!getHolder().equals(account.getHolder())) return false;
//        return getIban().equals(account.getIban());

        return holder.getSsn().equals(account.holder.getSsn());
    }

    @Override
    public int hashCode() {
//        int result;
//        long temp;
//        result = getHolder().hashCode();
//        result = 31 * result + getIban().hashCode();
//        temp = Double.doubleToLongBits(getBalance());
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        return result;

        return holder.getSsn().hashCode();
    }
}
