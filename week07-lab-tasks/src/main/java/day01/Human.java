package day01;

import java.time.LocalDate;

public class Human {
    private String name;
    private int yearOfBirth;

    public Human(String name, int yearOfBirth) {
        NameValidator nv = new NameValidator();
        YearOfBirthValidator yobv = new YearOfBirthValidator();
        if (nv.isNameValid(name) && yobv.isYearOfBirthValid(yearOfBirth)) {
            this.name = name;
            this.yearOfBirth = yearOfBirth;
        }
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
