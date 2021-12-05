package day04;

import java.util.ArrayList;
import java.util.List;

public class Courier {
    private List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride) {
        if (isEarlier(ride)) {
            throw new IllegalArgumentException("New ride unable to be earlier than the last.");
        }
        rides.add(ride);
    }

    public List<Ride> getRides() {
        return rides;
    }

    private boolean isEarlier(Ride ride) {
        if (rides.size() == 0) {
            return false;
        }
        Ride last = rides.get(rides.size()-1);
        if (last.getDayOfWeek().compareTo(ride.getDayOfWeek()) > 0) {
            return true;
        }
        else if (last.getDayOfWeek().equals(ride.getDayOfWeek()) && last.getOccasion() >= ride.getOccasion()) {
            return true;
        }
        else {
            return false;
        }
    }
}
