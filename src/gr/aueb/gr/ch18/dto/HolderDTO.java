package gr.aueb.gr.ch18.dto;

public class HolderDTO {
    private Long HolderId;
    private String firstname;
    private String lastname;
    private String ssn;

    public HolderDTO() {
    }

    public Long getHolderId() {
        return HolderId;
    }

    public void setHolderId(Long holderId) {
        HolderId = holderId;
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
}
