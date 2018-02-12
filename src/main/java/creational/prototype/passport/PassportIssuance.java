package creational.prototype.passport;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.System.out;

public class PassportIssuance {

    private static final String ID = "OL";
    private static final int SERIAL_NUMBER = 234589;
    private static final String ISSUED_BY = "Detroit Department of Citizens Registration";
    private static final String DATE_OF_BIRTH = "1984/10/10";
    private static final String OUTPUT_TEXT = "%s\n\nPassport copy:\n%n";
    private static final String DATE_FORMAT = "yyyy/MM/dd";

    public static void main(String[] args) throws ParseException {
        Passport passport = new Passport(ID, SERIAL_NUMBER, ISSUED_BY, getDateFromString(DATE_OF_BIRTH));
        out.printf(OUTPUT_TEXT, passport);
        PassportOffice passportOffice = new PassportOffice(passport);
        Passport passportCopy = passportOffice.copyPassportData();
        out.println(passportCopy);

    }

    private static Date getDateFromString(String date) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT);
        return format.parse(date);
    }
}
