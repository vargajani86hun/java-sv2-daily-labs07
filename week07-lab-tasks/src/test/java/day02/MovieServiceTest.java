package day02;

import org.junit.jupiter.api.Test;

import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {
    @Test
    void testCreateFromFile() {
        MovieService movieService = new MovieService(Paths.get("src/test/resources/movies.csv"));
        assertEquals(5, movieService.getMoviesList().size());
    }

    @Test
    void testCreateFromInvalidFile() {
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                () -> new MovieService(Paths.get("src/test/resources/movies_.csv")));
        assertEquals("Unable ot read file!", ise.getMessage());
        assertEquals(NoSuchFileException.class, ise.getCause().getClass());
    }

}