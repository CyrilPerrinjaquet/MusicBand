package MusicBand;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.security.spec.ECField;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;


public class EvenOddTest {
    @Test
    void testIfIsEven() {
        assertTrue(EvenOrOdd.isEven(2));
        assertFalse(EvenOrOdd.isEven(3));
    }

    @Test
    void testIfIsOdd() {
        assertTrue(EvenOrOdd.isOdd(9991));
        assertFalse(EvenOrOdd.isOdd(9992));
    }

    @Test
    void testIfAscendingOrder() {
        int[] myArray = {2, 9, 244, 924, 109, 50, 2040, 11, 40, 258, 157};
        int[] expected_result = {2, 9, 11, 40, 50, 109, 157, 244, 258, 924, 2040};

        assertEquals(Arrays.toString(expected_result), Arrays.toString(EvenOrOdd.ascendingOrder(myArray)));

    }

    @Test
    void testIfDescendingOrder() {
        int[] myArray = {2, 9, 244, 924, 109, 50, 2040, 11, 40, 258, 157};
        int[] expected_Array = {2040, 924, 258, 244, 157, 109, 50, 40, 11, 9, 2};

        assertEquals(Arrays.toString(expected_Array),Arrays.toString(EvenOrOdd.descendingOrder(myArray)));
    }

    @Test
    void getArrayEvenTest() {
        int[] myArray = EvenOrOdd.getArray(EvenOrOdd.NumberType.EVEN, 10);
        assertEquals(myArray.length, 10);
        for (int index = 0; index < myArray.length; index++) {
            assertTrue(EvenOrOdd.isEven(myArray[index]));
        }
    }

    @Test
    void getArrayOddTest() {
        int[] myArray = EvenOrOdd.getArray(EvenOrOdd.NumberType.ODD, 10);
        assertEquals(myArray.length, 10);
        for (int index = 0; index < myArray.length; index++) {
            assertTrue(EvenOrOdd.isOdd(myArray[index]));
        }
    }
}
