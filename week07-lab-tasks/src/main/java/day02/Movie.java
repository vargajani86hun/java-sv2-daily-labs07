package day02;

public class Movie {
    private String title;
    private int yearOfRelease;
    private String director;

    public Movie(String title, int yearOfRelease, String director) {
        this.title = title;
        this.yearOfRelease = yearOfRelease;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getDirector() {
        return director;
    }
}
