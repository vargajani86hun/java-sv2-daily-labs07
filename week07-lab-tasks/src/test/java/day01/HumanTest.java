package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void testCreate() {
        Human human = new Human("Kiss István", 1983);
        assertEquals("Kiss István", human.getName());
        assertEquals(1983, human.getYearOfBirth());
    }

    @Test
    void testCreateWithWrongName() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Human("Madonna", 1953));
        assertEquals("Name should be two words at least Madonna", iae.getMessage());
    }

    @Test
    void testCreateWithNullName() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Human(null, 1953));
        assertEquals("Name should not be null", iae.getMessage());
    }

    @Test
    void testCreateWithWrongAge() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Human("Kiss István", 1821));
        assertEquals("Invalid year of birth: 1821", iae.getMessage());
    }

}