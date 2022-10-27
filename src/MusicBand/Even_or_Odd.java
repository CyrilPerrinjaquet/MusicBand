package MusicBand;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Even_or_Odd {

    public boolean is_even(int number_to_test){
        return number_to_test % 2 == 0;
    }
    public boolean is_odd(int number_to_test){
        return number_to_test % 2 != 0;
    }
    /**
     * Check if a mumber is even or odd
     * @param even
     * @param odd
     * @return 0, because of the tests
     */
    public int evenAndOdd(int even, int odd) {

        if (even % 2 == 0) {
            System.out.println("This number is even : " + even);
        } else {
            System.out.println("This number is odd : " + even);
        }
        if (odd % 2 != 0) {
            System.out.println("This number is odd : " + odd);
        } else {
            System.out.println("This number isn't odd : " + odd);
        }
        return 0; // pour les tests
    }


    public int[] get_array(String number_type, int length_of_array){
        // number_type -> soit 'even' soit 'odd', soit 'both'
        int[] my_array = new int[length_of_array];
        int index = 0;

        int randomNumber = new Random().nextInt(0, 100);
        while(index < length_of_array){
            switch (number_type){
                case "even":
                    if (is_even(randomNumber)){
                        my_array[index] = randomNumber;
                        index++;
                    }
                    break;
                case "odd":
                    if (is_odd(randomNumber)){
                        my_array[index] = randomNumber;
                        index++;
                    }
                    break;
                default:
                    my_array[index] = randomNumber;
                    index++;
            }
        }
        System.out.println(Arrays.toString(my_array));
        return my_array;
    }

    /**
     * It will randomised an array and sort it in ascending/descending
     * @prints the index of the randomised array
     * @prints The sorted array in ascending order and descending
     */
    public void RandomOddAndEven() {
        Integer[] myArray = {2, 9, 244, 924, 109, 50, 2040, 11, 40, 258, 157};
        int currentIndex = 0;

        int randomIndex = new Random().nextInt(0, myArray.length);
        int randomElement = myArray[randomIndex];
        /* ------------{Random} ---------- */

        for (int elementsIndex = 0; elementsIndex < myArray.length; elementsIndex++) {
            myArray[currentIndex] = randomElement;
        }
        System.out.println(myArray[currentIndex]);
        /* ------------{Order} ---------- */

        Arrays.sort(myArray); // dans l'ordre croissant
        System.out.println("The ascending order : " + Arrays.toString(myArray));
        Arrays.sort(myArray, Collections.reverseOrder()); // dans l'ordre décroissant
        System.out.println("The descending order : " + Arrays.toString(myArray));
    }
}
