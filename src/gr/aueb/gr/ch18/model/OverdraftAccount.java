package gr.aueb.gr.ch18.model;

/**
 * Defines an OverdraftAccount {@link OverdraftAccount}.<br>
 * Includes {@link #id}, {@link #overdraftHolder},
 * {@link #iban}, {@link #balance} <br>
 * With <i>mutator</i> methods:
 * {@link #setBalance(double)} <br>
 * And <i>accessor</i> methods:
 * {@link #getId()}, {@link #getOverdraftHolder()},
 * {@link #getIban()}, {@link #getBalance()} <br>
 * Public API methods: <br>
 * {@link #deposit(double)}, {@link #withdraw(double, Holder)},
 * {@link #getOverdraftAccBalance()}, {@link #getOverdraftAccState()} <br>
 * Validation method: <br>
 * {@link #isValidOverdraftHolder(Holder)}
 *
 * @author gvogiatzis
 */
public final class OverdraftAccount {
    private final Long id;
    private final Holder overdraftHolder;
    private final String iban;
    private double balance;

    /**
     * Initializes with default values
     */
    public OverdraftAccount() {
        id = 0L;
        overdraftHolder = new Holder();
        iban = "";
        balance = 0;
    }

    /**
     *
     * @param id Overdraft account's id
     * @param overdraftHolder Overdraft account's holder
     * @param iban Overdraft account iban
     * @param balance Overdraft account balance
     */
    public OverdraftAccount(Long id, Holder overdraftHolder, String iban, double balance) {
        this.id = id;
        this.overdraftHolder = overdraftHolder;
        this.iban = iban;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public Holder getOverdraftHolder() {
        return overdraftHolder;
    }

    public String getIban() {
        return iban;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * deposits a zero or positive amount of money
     * to Overdraft account's balance
     *
     * @param amount the amount of money to be deposited
     *
     * @throws Exception
     * if the amount is negative
     *
     */
    public void deposit(double amount) throws Exception {
        try {
            if (amount >= 0) {
                balance += amount;
            }else throw new Exception("Negative amount Exception");
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * Withdraws a certain amount of money from
     * Overdraft account's balance if the Holder is valid
     * and gives the option to make an overdraft withdrawal
     * up to a certain limit, if balance is not sufficient.
     *
     * @param amount  the amount to be withdrawn
     * @throws Exception
     * if the amount exceeds account's overdraft
     * withdrawal limit.
     */
    public void withdraw(double amount, Holder overdraftHolder) throws Exception {
        try {
            if (!isValidOverdraftHolder(overdraftHolder)) throw new Exception("Not valid Account Holder exception");
//
            if ((amount <= balance) || Math.abs(balance - amount) <= 500 ) {
                balance -= amount;
            }else {
                throw new Exception("Overdraft limit exceeded exception");
            }
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * Returns the Overdraft account's balance
     *
     * @return  the Overdraft account's balance
     */
    public double getOverdraftAccBalance() {
        return getBalance();
    }

    /**
     * The Overdraft account's State
     *
     * @return  the Overdraft account's State
     */
//    public String getOverdraftAccState() {
//        return "(" + id + ", " + overdraftHolder.convertToString() + ", " + iban + ", " + balance + ")";
//    }

    /**
     * Checks if a holder's ssn, equals to the Overdraft account's holder ssn
     *
     * @param holder the holder whose ssn we want to check
     * @return true if the ssn from the holder we are checking,
     *         belongs to  the Overdraft account's Holder,
     *         false otherwise.
     */
    private boolean isValidOverdraftHolder(Holder holder) {
        return holder.getSsn().equals(overdraftHolder.getSsn());
    }
}
