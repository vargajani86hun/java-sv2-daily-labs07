package day01;

import java.time.LocalDate;

public class YearOfBirthValidator {
    public boolean isYearOfBirthValid(int yearOfBirth) {
        int thisYear = LocalDate.now().getYear();
        if ((thisYear-yearOfBirth) > 120 || (thisYear-yearOfBirth) < 0) {
            throw new IllegalArgumentException("Invalid year of birth: " + yearOfBirth);
        }
        return true;
    }
}
