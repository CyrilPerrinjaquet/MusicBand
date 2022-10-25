package MusicBand;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KeyTest {
    @Test
    void checkNumbersOfKeys() {
        Key[] keys = Key.randomKeys(5);
        assertEquals(5, keys.length);
    }

    @Test
    void randomKeysSize() {
        Key[] keys = Key.randomKeys(4);
        assertEquals(4, keys.length);

        keys = Key.randomKeys(10);
        assertEquals(10, keys.length);
    }

    @Test
    void ensureNegativeValueDoesNotBreakFunction() {
        Key[] keys = Key.randomKeys(-1);
        assertEquals(0, keys.length);
    }
}
