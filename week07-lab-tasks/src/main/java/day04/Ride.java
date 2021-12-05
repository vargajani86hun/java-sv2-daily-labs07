package day04;

public class Ride {
    private DayOfWeek dayOfWeek;
    private int occasion;
    private double distance;

    public Ride(DayOfWeek dayOfWeek, int occasion, double distance) {
        this.dayOfWeek = dayOfWeek;
        this.occasion = occasion;
        this.distance = distance;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public int getOccasion() {
        return occasion;
    }

    public double getDistance() {
        return distance;
    }
}
