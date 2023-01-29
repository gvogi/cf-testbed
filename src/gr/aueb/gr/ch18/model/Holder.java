package gr.aueb.gr.ch18.model;

/**
 * Defines an account's holder Credentials.<br>
 *
 * @author gvogiatzis
 */
public class Holder extends AbstractEntity {
    private String firstname;
    private String lastname;
    private String ssn;

    public Holder() {
    }

    public Holder(String firstname, String lastname, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    /**
     * Checks if a given ssn, equals to holder's ssn
     * @return true if equals to holder's ssn,
     * false otherwise.
     */
//    private boolean isSsnValid(String ssn) {
//        return this.ssn.equals(ssn);
//    }

    @Override
    public String toString() {
        return "Holder{" +
                "id= " + getId() +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Holder holder = (Holder) o;

        if (getFirstname() != null ? !getFirstname().equals(holder.getFirstname()) : holder.getFirstname() != null)
            return false;
        if (getLastname() != null ? !getLastname().equals(holder.getLastname()) : holder.getLastname() != null)
            return false;
        return getSsn() != null ? getSsn().equals(holder.getSsn()) : holder.getSsn() == null;
    }

    @Override
    public int hashCode() {
        int result = getFirstname() != null ? getFirstname().hashCode() : 0;
        result = 31 * result + (getLastname() != null ? getLastname().hashCode() : 0);
        result = 31 * result + (getSsn() != null ? getSsn().hashCode() : 0);
        return result;
    }
}
