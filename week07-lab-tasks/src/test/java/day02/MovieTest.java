package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {
    @Test
    void testCreate() {
        Movie movie = new Movie("Herry Potter and the Sorcerer's Stone",
                2001, "Chris Columbus");
        assertEquals("Herry Potter and the Sorcerer's Stone", movie.getTitle());
        assertEquals(2001, movie.getYearOfRelease());
        assertEquals("Chris Columbus", movie.getDirector());
    }

}