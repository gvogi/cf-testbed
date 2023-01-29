package gr.aueb.gr.ch18.model;

/**
 * Defines a joint account's Credentials.<br>
 * Includes {@link #id}, {@link #jointAccHolder1},
 * {@link #jointAccHolder2}, {@link #iban}, {@link #balance} <br>
 * With <i>mutator</i> methods:
 * {@link #setBalance(double)} <br>
 * And <i>accessor</i> methods:
 * {@link #getId()}, {@link #getJointAccHolder1()},
 * {@link #getJointAccHolder2()}, {@link #getIban()}, {@link #getBalance()} <br>
 * Public API methods: <br>
 * {@link #deposit(double)}, {@link #withdraw(double, Holder)},
 * {@link #getJointAccBalance()}, {@link #getJointAccountState()} <br>
 * Validation method: <br>
 * {@link #isValidHolder(Holder)}
 *
 * @author gvogiatzis
 */
public final class JointAccount {
    private final Long id;
    private final Holder jointAccHolder1;
    private final Holder jointAccHolder2;
    private final String iban;
    private double balance;

    /**
     * Initializes with default values
     */
    public JointAccount() {
        this.id = 0L;
        this.jointAccHolder1 = new Holder();
        this.jointAccHolder2 = new Holder();
        this.iban = "";
        this.balance = 0;
    }

    /**
     * Constructs a Joint Account instance
     * @param id Joint Account's id
     * @param jointAccHolder1 Joint Account holder 1
     * @param jointAccHolder2 Joint Account holder 2
     * @param iban Joint Account's iban
     * @param balance Joint Account's balance
     */
    public JointAccount(Long id,Holder jointAccHolder1, Holder jointAccHolder2, String iban, double balance) {
        this.id = id;
        this.jointAccHolder1 = jointAccHolder1;
        this.jointAccHolder2 = jointAccHolder2;
        this.iban = iban;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public Holder getJointAccHolder1() {
        return this.jointAccHolder1;
    }

    public Holder getJointAccHolder2() {
        return jointAccHolder2;
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
     * to joint account's balance
     *
     * @param amount the amount of money to be deposited
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
     * joint account's balance if the Holder is valid.
     *
     * @param amount  the amount to be withdrawn
     * @throws Exception
     *  if the amount is greater than account's balance
     */
    public void withdraw(double amount, Holder JointAccHolder) throws Exception {
        try {
            if (!isValidHolder(JointAccHolder)) throw new Exception("Not valid Account Holder exception");
            if (amount <= balance) {
                balance -= amount;
            }else {
                throw new Exception("Insufficient balance exception");
            }
        }catch (Exception e) {
            throw e;
        }
    }

    /**
     * The joint account's balance
     *
     * @return  the joint account's balance
     */
    public double getJointAccBalance() {
        return getBalance();
    }

    /**
     * Returns the joint account's State
     *
     * @return  the joint account's State
     */
//    public String getJointAccountState() {
//        return "(" + id + ", " + jointAccHolder1.convertToString() + ", "
//                + jointAccHolder2.convertToString() + ", " + iban + ", " + balance + ")";
//    }

    /**
     * Checks if a holder, is valid as one of the joint account's Holders
     *
     * @param JointAccHolder the holder we want to check
     * @return true if all the credentials from the holder we are checking,
     *         belong to one of the joint account's Holders,
     *         false otherwise.
     */
    private boolean isValidHolder(Holder JointAccHolder) {
        return JointAccHolder == jointAccHolder1 || JointAccHolder == jointAccHolder2;
    }
}
