package day04;

import day02.Movie;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourierTest {

    @Test
    void testCreate() {
        Courier courier = new Courier();
        assertEquals(0, courier.getRides().size());
    }

    @Test
    void testAddValidRide() {
        Courier courier = new Courier();
        courier.addRide(new Ride(DayOfWeek.MONDAY, 1, 11.2));
        courier.addRide(new Ride(DayOfWeek.MONDAY, 2, 8.2));
        assertEquals(2, courier.getRides().size());
    }

    @Test
    void testAddInvalidRide() {
        Courier courier = new Courier();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> courier.addRide(new Ride(DayOfWeek.FRIDAY, 2, 1.1)));
        assertEquals("New ride unable to be earlier than the last.", iae.getMessage());

        courier.addRide(new Ride(DayOfWeek.MONDAY, 1, 1.2));
        courier.addRide(new Ride(DayOfWeek.TUESDAY, 1, 1.2));
        iae = assertThrows(IllegalArgumentException.class,
                () -> courier.addRide(new Ride(DayOfWeek.MONDAY, 5, 1.2)));
        assertEquals("New ride unable to be earlier than the last.", iae.getMessage());

        iae = assertThrows(IllegalArgumentException.class,
                () -> courier.addRide(new Ride(DayOfWeek.WEDNESDAY, 3, 2.1)));
        assertEquals("New ride unable to be earlier than the last.", iae.getMessage());

    }
}