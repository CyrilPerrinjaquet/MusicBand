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
        return numberToTest % 2 != 0;
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
     * It will randomised an array and sort it in ascending/descending
     * @prints the index of the randomised array
     * @prints The sorted array in ascending order and descending
     */
    public static String ascendingOrder() {
        Integer[] myArray = {2, 9, 244, 924, 109, 50, 2040, 11, 40, 258, 157};

        Arrays.sort(myArray); // dans l'ordre croissant
        System.out.println(Arrays.toString(myArray));
        return Arrays.toString(myArray);
    }


    public static String descendingOrder() {
        Integer[] myArray = {2, 9, 244, 924, 109, 50, 2040, 11, 40, 258, 157};

        Arrays.sort(myArray, Collections.reverseOrder()); // dans l'ordre décroissant
        System.out.println("The descending order : " + Arrays.toString(myArray));
        return Arrays.toString(myArray);
    }
}
