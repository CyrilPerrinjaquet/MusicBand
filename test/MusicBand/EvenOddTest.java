package MusicBand;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;


public class EvenOddTest {
    @Test
    void testIsEven() {
        int numb = 2;
        if (numb % 2 == 0) {
        }
        assertEquals(0, numb % 2);
    }
    @Test
    void testIsOdd() {
        int numb = 9991;
        if (numb % 2 != 0) {
        }
        assertEquals(1, numb % 2);
    }

    @Test
    void testIfAscendingOrder() {
        Integer[] myArray = {2, 9, 244, 924, 109, 50, 2040, 11, 40, 258, 157};
        Arrays.sort(myArray);

        assertEquals(Arrays.toString(myArray), Even_or_Odd.ascendingOrder());
    }
    @Test
    void  testIfDescendingOrder() {
        Integer[] myArray = {2, 9, 244, 924, 109, 50, 2040, 11, 40, 258, 157};
        Arrays.sort(myArray, Collections.reverseOrder());

        assertEquals(Arrays.toString(myArray), Even_or_Odd.descendingOrder());
    }

}
