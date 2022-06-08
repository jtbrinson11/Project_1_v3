import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class dragonCaveV3Test {

    dragonCaveV3 dc3;

    @BeforeEach
    void setUp() {
        dc3 = new dragonCaveV3();
    }

    @Test
    void setChoice() {
        dc3.setChoice(1);
        assertEquals(1, dc3.choice, "setChoice() failed");
    }

    @Test
    void getChoice() {
        dc3.setChoice(2);
        int testChoice = dc3.getChoice();
        assertEquals(2, testChoice, "getChoice() failed");
    }

    @AfterEach
    void tearDown() {
    }
}