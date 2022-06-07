import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class dragonCaveV3Test {

    dragonCaveV3 dc3;

    @BeforeEach
    void setUp() {
        dc3 = new dragonCaveV3();
    }

    @Test
    void setChoice() {
        dc3.choice = 1;
    }

    @Test
    void getChoice() {
        assertEquals(1, dc3.getChoice(), "getChoice() failed");
    }

    @Test
    void processOutcome() {
    }

    @AfterEach
    void tearDown() {
    }
}