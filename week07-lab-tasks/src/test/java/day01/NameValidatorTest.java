package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameValidatorTest {
    @Test
    void testIsNameValidWithRightData() {
        assertTrue(new NameValidator().isNameValid("Tóth Kálmán"));
    }

    @Test
    void testIsNameValidWithWrongData() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new NameValidator().isNameValid("Bono"));
        assertEquals("Name should be two words at least Bono", iae.getMessage());
    }

    @Test
    void testIsNameValidWithNull() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new NameValidator().isNameValid(null));
        assertEquals("Name should not be null", iae.getMessage());
    }
}