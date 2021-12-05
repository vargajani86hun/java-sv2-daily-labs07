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

    public boolean isBefore(Ride ride) {
        if (this.dayOfWeek.compareTo(ride.dayOfWeek) < 0) {
            return ride.occasion == 1;
        }
        else if (this.dayOfWeek.equals(ride.dayOfWeek) &&
                this.occasion < ride.occasion) {
            return true;
        }
        else {
            return false;
        }
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
