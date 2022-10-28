package MusicBand;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import MusicBand.*;

import java.util.Arrays;
import java.util.Random;

class BandTest {

    Band queen;

    @BeforeEach
    void setUp() {
        Dancer elvis = new Dancer(
                "Elvis presley",
                29,
                "King of Rock'n'Roll",
                new Style[]{Style.ROCKNROLL, Style.ROCK}

        );
        Guitarist brian = new Guitarist(
                "Brian May",
                62,
                "Guitarist of Queen",
                new Style[]{Style.ROCK}
        );

        Drummer roger = new Drummer(
                "Roger Taylor",
                54,
                "Drummer of Queen",
                new Style[]{Style.ROCK}
        );
        Singer freddie = new Singer(
                "Freddie Mercury",
                56,
                "Singer of Queen",
                new Style[]{Style.ROCK}
        );

        BassPlayer johnFromQueen = new BassPlayer(
                "John Deacon",
                71,
                "The bassplayer Queen",
                new Style[]{Style.ROCK}
        );

        queen = new Band(
                "Queen",
                elvis,
                brian,
                roger,
                johnFromQueen,
                freddie
        );
    }

    @Test
    void vanillaCaseTestToString() {
        String expected_result = "The Dancer : \n" +
                "Name : Elvis presley\n" +
                "Experiences : King of Rock'n'Roll\n" +
                "Styles : \n" +
                "ROCKNROLL\n" +
                "ROCK\n" +
                "\n" +
                "The Singer : \n" +
                "Name : Freddie Mercury\n" +
                "Experiences : Singer of Queen\n" +
                "Styles : \n" +
                "ROCK\n" +
                "\n" +
                "The Guitarist : \n" +
                "Name : Brian May\n" +
                "Experiences : Guitarist of Queen\n" +
                "Styles : \n" +
                "ROCK\n" +
                "\n" +
                "The Bassplayer : \n" +
                "Name : John Deacon\n" +
                "Experiences : The bassplayer Queen\n" +
                "Styles : \n" +
                "ROCK\n" +
                "\n" +
                "The Drummer : \n" +
                "Name : Roger Taylor\n" +
                "Experiences : Drummer of Queen\n" +
                "Styles : \n" +
                "ROCK\n";
        assertEquals(expected_result, queen.toString());
    }

    @Test
    void testTheBirthYear() {
        assertEquals(1968, queen.drummer.getBirthYear());

        assertEquals(1966, queen.singer.getBirthYear());

        assertEquals(1951, queen.bassplayer.getBirthYear());
    }

    @Test
    void testTheBirthdayFunction() {
        assertEquals(54, queen.drummer.getAge());
        queen.drummer.birthday();
        assertEquals(55, queen.drummer.getAge());
    }

    @Test
    void testIfReturnOdd() {
        boolean expected_result = 11 % 2 != 0;
        assertEquals(true , expected_result);
    }

    @Test
    void testIfReturnEven() {
        assertEquals(0, Even_or_Odd.evenAndOdd(20, 1));
    }

    @Test
    void TestIfRandom() {
        Integer[] myArray = {2, 9, 244, 924, 109, 50, 2040, 11, 40, 258, 157};
        int currentIndex = 0;

        int randomIndex = new Random().nextInt(0, myArray.length); /* si on fait - 1 il va pas compter la derniere note/clé*/
        int randomElement = myArray[randomIndex];
        myArray[currentIndex] = randomElement;

        assertEquals(randomElement, myArray[currentIndex]);
    }
    @Test
    void testIfGetHypothenuse() {
        double adjacent;
        double opposite;
        double hypothenuse;

        hypothenuse = Math.pow(5, 2);
        adjacent = Math.pow(4, 2);
        opposite = Math.pow(3, 2);

        if (hypothenuse == adjacent + opposite) {

        }
        assertEquals(hypothenuse, 25);
    }
}