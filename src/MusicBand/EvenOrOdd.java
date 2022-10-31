package MusicBand;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class EvenOrOdd {

    public enum NumberType {
        EVEN,
        ODD;
    }

    public static boolean isEven(int numberToTest){
        return numberToTest % 2 == 0;
    }
    public static boolean isOdd(int numberToTest){
       return !isEven(numberToTest);
    }


    public static int[] getArray(NumberType type, int lengthOfArray){
        int[] myArray = new int[lengthOfArray];
        int index = 0;

        while(index < lengthOfArray) {
            int randomNumber = new Random().nextInt(0, 12);
            switch (type) {
                case EVEN:
                    if (EvenOrOdd.isEven(randomNumber)) {
                        myArray[index] = randomNumber;
                        index++;
                    }
                    break;
                case ODD:
                    if (EvenOrOdd.isOdd(randomNumber)) {
                        myArray[index] = randomNumber;
                        index++;
                    }
                    break;
            }
        }
        System.out.println(Arrays.toString(myArray));
        return myArray;
    }

    /**
     * This method sort an array in an ascending order
     * @param int[] myArray
     */
    public static int[] ascendingOrder(int[] myArray) {
        Arrays.sort(myArray); // dans l'ordre croissant
        return myArray;
    }

    /**
     * This method sort an array in an descending order
     * It basically make the reversed ascending order manually
     * @param int[] myArray
     */
    public static int[] descendingOrder(int[] myArray) {
        ascendingOrder(myArray);
        int[] reverse = new int[myArray.length];

        for (int i = 0; i < myArray.length; i++) {
            int reversIndex = reverse.length - 1 - i;
                reverse[reversIndex] = myArray[i];
        }

        return reverse;
    }
}
