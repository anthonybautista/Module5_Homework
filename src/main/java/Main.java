import java.util.Scanner;

public class Main {

    private static Object MissingNameException;
    private static Object InvalidBirthdayException;
    private static Object UnknownGenderCodeException;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FirstNameUtility fnu = new FirstNameUtility();
        LastNameUtility lnu = new LastNameUtility();
        MonthDayGenderUtility mdgu = new MonthDayGenderUtility();
        FloridaFormatter ff = new FloridaFormatter();
        WisconsinFormatter wf = new WisconsinFormatter();

        String lastName, firstName, middleInitial;
        int year, month, day;
        char genderCode;

        System.out.print("Enter Last Name >> ");
        lastName = input.nextLine().toUpperCase();
        System.out.print("Enter First Name >> ");
        firstName = input.nextLine().toUpperCase();
        System.out.print("Enter Middle Initial >> ");
        middleInitial = input.nextLine().toUpperCase();
        System.out.print("Enter Birth Month (1-12) >> ");
        month = input.nextInt();
        System.out.print("Enter Birth Day (1-31) >> ");
        day = input.nextInt();
        System.out.print("Enter Birth Year >> ");
        year = input.nextInt();
        System.out.print("Enter Gender (M/F) >> ");
        genderCode = input.next().toUpperCase().charAt(0);

        try {
            DriversLicense driversLicense = new DriversLicense();
            driversLicense.setFirstNameMiddleInitial(fnu.encodeFirstName(firstName, middleInitial));
            driversLicense.setSoundexCode(lnu.encodeLastName(lastName));
            driversLicense.setBirthMonthDayGender(mdgu.encodeMonthDayGender(year, month, day, genderCode));
            driversLicense.setBirthYear(year);
            driversLicense.setOverflow(0);

            System.out.println("Florida: "+ff.formatLicenseNumber(driversLicense));
            System.out.println("Wisconsin: "+wf.formatLicenseNumber(driversLicense));
        } catch (InvalidBirthdayException | MissingNameException | UnknownGenderCodeException e) {
            System.out.println(e.getMessage());
        }

    }
}
