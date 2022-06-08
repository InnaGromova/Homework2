package example.org;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {

    @Test
    void firstTest() {
        Assertions.assertTrue(4 > 2);
    }

    @Test
    void secondTest() {
        Assertions.assertTrue(4 > 2);
    }
}
