package day04;

import java.util.ArrayList;
import java.util.List;

public class Courier {
    private List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride) {
        if (rides.size() != 0 && !rides.get(rides.size() - 1).isBefore(ride)) {
            throw new IllegalArgumentException("New ride unable to be earlier than the last.");
        }
        if (rides.size() == 0 && ride.getOccasion() != 1) {
            throw new IllegalArgumentException("New ride unable to be earlier than the last.");
        }
        rides.add(ride);
    }

    public List<Ride> getRides() {
        return rides;
    }
}
