package MusicBand;

import java.util.Calendar;
import java.util.*;
import java.util.Collections;

public abstract class MemberBand {
    protected String name;
    protected int age;
    protected String experiences;

    protected Style[] styles;

    public MemberBand(String name, int age, String experiences, Style[] styles) {
        this.name = name;
        this.age = age;
        this.experiences = experiences;
        this.styles = styles;
    }

    public String toString() {
        String description = "Name : " + name + "\n" + "Experiences : " + experiences + "\n" + "Styles : " + "\n";
        for (Style style : styles) {
            description = description + style.toString() + "\n";
        }
        return description;
    }

    /**
     * Setter to change the age of the member
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return int the age of the member
     * ex: 33 for 33 years old
     */
    public int getAge() {
        return this.age;
    }

    /**
     * function to increment the age of the member and wish him a great birthday in the console.
     */
    public void birthday() {
        this.age++;
        System.out.println("Happy Birthday to you");
    }

    /**
     * method to get the year of birth of a member based on his age
     * @return the year of birthday of the Member
     */
    public int getBirthYear() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year - getAge();
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

    /**
     * It will sort an array of only even numbers and in ascending order
     * It will sort myArray and if the number is even --> he will put it in myEvenArray but not removed from myArray
     * @prints myEvenArray
     */
    public void onlyEven(int even) {
        int[] myArray = {3, 2, 4, 34, 99, 14, 109, 41, 52, 35, 18};
        int n = myArray.length;
        int[] myEvenArray = new int[n];
        int index = 0;
// pour trier le tableau dans l'ordre croissant et QUE avoir des nombres pairs
        for (int currentIndex = 0; currentIndex < myArray.length; currentIndex++) {
            if (myArray[currentIndex] % 2 == 0) {
                myEvenArray[index] = myArray[currentIndex];
                Arrays.sort(myEvenArray);
            }
            System.out.println(Arrays.toString(myEvenArray));
        }
    }

    /**
     * It will sort an array of only odd numbers and in ascending order
     * It will sort myArray and if the number is odd --> he will put it in myOddArray but not removed from myArray
     * @prints myOddArray
     */
    public void onlyOdd() {
        int[] myArray = {90, 1, 24, 784, 29, 75, 1110, 91, 60, 38, 10};
        int[] myOddArray = new int[myArray.length];
        int index = 0;
// pour trier le tableau dans l'ordre croissant et QUE avoir des nombres impairs
        for (int currentIndex = 0; currentIndex < myArray.length; currentIndex++) {
            if (myArray[currentIndex] % 2 == 1) {
                myOddArray[index] = myArray[currentIndex];
                Arrays.sort(myOddArray);
            }
        }
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

        for (int elementsIndex = 0; elementsIndex < myArray.length; elementsIndex++) {
            myArray[currentIndex] = randomElement;
        }
          System.out.println(myArray[currentIndex]);
        /* ------------{Ordre} ---------- */
        Arrays.sort(myArray); // dans l'ordre croissant
        System.out.println("The ascending order : " + Arrays.toString(myArray));
        Arrays.sort(myArray, Collections.reverseOrder()); // dans l'ordre décroissant
        System.out.println("The descending order : " + Arrays.toString(myArray));
    }

}



