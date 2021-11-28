package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearOfBirthValidatorTest {
    @Test
    void testIsYearOfBirthValidWithRightData() {
        assertTrue(new YearOfBirthValidator().isYearOfBirthValid(1901));
    }

    @Test
    void testIsYearOfBirthValidWithWrongData() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new YearOfBirthValidator().isYearOfBirthValid(1900));
        assertEquals("Invalid year of birth: 1900", iae.getMessage());
    }

}