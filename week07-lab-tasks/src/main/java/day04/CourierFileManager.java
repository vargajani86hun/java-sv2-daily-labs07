package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CourierFileManager {

    public Courier createCourierByFile(Path path) {
        try {
            Courier courier = new Courier();
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                courier.addRide(getRideFromString(line));
            }
            return courier;
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to read file! " + path, ioe);
        }
    }

    private Ride getRideFromString(String line) {
        String[] data = line.trim().split(" ");
        if (Character.isDigit(data[0].charAt(0))) {
            int day = Integer.parseInt(data[0]);
            return new Ride(convertNumber(day), Integer.parseInt(data[1]), Double.parseDouble(data[2]));
        }
        return new Ride(DayOfWeek.valueOf(data[0].toUpperCase()), Integer.parseInt(data[1]), Double.parseDouble(data[2]));
    }

    private DayOfWeek convertNumber(int day) {
        switch (day) {
            case 1:
                return DayOfWeek.MONDAY;
            case 2:
                return DayOfWeek.TUESDAY;
            case 3:
                return DayOfWeek.WEDNESDAY;
            case 4:
                return DayOfWeek.THURSDAY;
            case 5:
                return DayOfWeek.FRIDAY;
            case 6:
                return DayOfWeek.SATURDAY;
            default:
                return DayOfWeek.SUNDAY;
        }
    }
}
