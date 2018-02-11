package creational.prototype.passport;

public class PassportOffice {
    private Passport passport;

    PassportOffice(Passport passport) {

        this.passport = passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    Passport copyPassportData() {
        return (Passport) passport.copy();
    }
}
