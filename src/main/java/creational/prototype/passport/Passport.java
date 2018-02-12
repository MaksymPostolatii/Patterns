package creational.prototype.passport;

import creational.prototype.Copyable;

import java.util.Date;

import static java.lang.String.format;

public class Passport implements Copyable {
    private String id;
    private int serialNumber;
    private String issuedBy;
    private Date dateOfBirth;

    Passport(String id, int serialNumber, String issuedBy, Date dateOfBirth) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.issuedBy = issuedBy;
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Object copy() {
        return new Passport(id, serialNumber, issuedBy, dateOfBirth);
    }

    @Override
    public String toString() {
        return format("Passport: { id = '%s', serialNumber = %d, issuedBy = '%s', dateOfBirth = %s}",
                id, serialNumber, issuedBy, dateOfBirth);
    }
}
