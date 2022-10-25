package MusicBand;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KeyTest {
    @Test
    void checkNumbersOfKeys() {
        MusicKey[] keys = MusicKey.randomKeys(5);
        assertEquals(5, keys.length);
    }

    @Test
    void randomKeysSize() {
        MusicKey[] keys = MusicKey.randomKeys(4);
        assertEquals(4, keys.length);

        keys = MusicKey.randomKeys(10);
        assertEquals(10, keys.length);
    }

    @Test
    void ensureNegativeValueDoesNotBreakFunction() {
        MusicKey[] keys = MusicKey.randomKeys(-1);
        assertEquals(0, keys.length);

    }
}
