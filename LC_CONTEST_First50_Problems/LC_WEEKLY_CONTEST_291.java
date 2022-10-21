package LC_CONTEST_First50_Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC_WEEKLY_CONTEST_291 {
    public String removeDigit(String number, char digit) {
        List<String> digits = new ArrayList<>();
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                String stringWD = number.substring(0, i) + number.substring(i + 1);
                digits.add(stringWD);
            }
        }
        Collections.sort(digits);
        return digits.get(digits.size() - 1);
    }
}
