package day04;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class CourierFileManagerTest {

    @Test
    void testCreateCourierByFile() {
        CourierFileManager cfm = new CourierFileManager();
        Courier courier = cfm.createCourierByFile(Paths.get("src/test/resources/courier01.txt"));
        assertEquals(6, courier.getRides().size());

        Courier courier1 = cfm.createCourierByFile(Paths.get("src/test/resources/courier02.txt"));
        assertEquals(11, courier1.getRides().size());
    }

}