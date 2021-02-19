import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MonthDayGenderUtility {
    private final int MOD_MALE = 0;
    private final int MOD_FEMALE = 500;
    private final char CODE_MALE = 'M';
    private final char CODE_FEMALE = 'F';

    public int encodeMonthDayGender(int year, int month, int day, char genderCode)
            throws UnknownGenderCodeException, InvalidBirthdayException {

        List<Integer> months = new ArrayList<>();
        months.add(1);
        months.add(3);
        months.add(5);
        months.add(7);
        months.add(8);
        months.add(10);
        months.add(12);

        int code = 0;

        if (month == 2) {
            if (day < 1 | day > 28)
                throw new InvalidBirthdayException(year, month, day);
        }
        else if (!months.contains(month) && month > 0 && month < 12) {
            if (day < 1 | day > 30)
                throw new InvalidBirthdayException(year, month, day);
        }
        else if (months.contains(month)) {
            if (day < 1 | day > 31)
                throw new InvalidBirthdayException(year, month, day);
        }
        else
            throw new InvalidBirthdayException(year, month, day);


        code = (month - 1) * 40 + day;

        if (genderCode == CODE_MALE);
        else if (genderCode == CODE_FEMALE)
            code += MOD_FEMALE;
        else
            throw new UnknownGenderCodeException(genderCode);

        return code;
    }

}
