package day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MovieService {
    private List<Movie> moviesList = new ArrayList<>();

    public MovieService(Path path) {
        this.moviesList = readMoviesFromFile(path);
    }

    private List<Movie> readMoviesFromFile(Path path) {
        List<Movie> result = new ArrayList<>();
        try {
            List<String> movieList = Files.readAllLines(path);
            for (String movieLine : movieList) {
                result.add(createMovieFromLine(movieLine));
            }
            return result;
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable ot read file!", ioe);
        }
    }

    private Movie createMovieFromLine (String line) {
        String[] elements = line.split(";");

        return new Movie(elements[0], Integer.parseInt(elements[1]), elements[2]);
    }

    public List<Movie> getMoviesList() {
        return new ArrayList<>(moviesList);
    }
}
