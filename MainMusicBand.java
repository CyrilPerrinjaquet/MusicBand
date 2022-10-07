package MusicBand;

import java.lang.reflect.Array;
import java.util.*;

public class MainMusicBand {
    public static void main(String[] args) {
//        HashMap<String, String> planning = new HashMap<>();
//        planning.put("datesMetallica", "5.04.2023 " + "\n" + "20.04.2023 " + "\n" + "2.05.2023");
//        planning.put("datesRedHot", "10.04.2023 " + "\n" + "25.04.2023 " + "\n" + "4.05.2023");
//        planning.put("datesQueen", "2.04.2023" + "\n" + " 15.04.2023 " + "\n" + " 30.04.2023");

        ////// Metallica ici

        Dancer Prince = new Dancer(
                "Prince Rogers Nelson or 'Prince'",
                57,
                "The prince of pop",
                new Style[]{Style.HEAVYMETAL, Style.METAL}
        );

        Guitarist Kirk = new Guitarist(
                "Kirk Hammet",
                59,
                "The guitarist of Metallica",
                new Style[]{Style.HEAVYMETAL, Style.METAL}
        );
        Drummer Lars = new Drummer(
                "Lars Ulrich",
                58,
                "The drummer of Metallica",
                new Style[]{Style.HEAVYMETAL, Style.METAL}
        );
        Singer James = new Singer(
                "James Hetfield",
                59,
                "The singer of Metallica",
                new Style[]{Style.HEAVYMETAL, Style.METAL}
        );
        BassPlayer Robert = new BassPlayer(
                "Robert Trujillo",
                57,
                "The bassplayer of Metallica",
                new Style[]{Style.HEAVYMETAL, Style.METAL}
        );

//        Planning planningMetallica = new Planning(
//
//                "Metallica",
//                "5.04.2023 " + "\n" + "20.04.2023 " + "\n" + "2.05.2023",
//                "Las Vegas"
//        );

        Band metallica = new Band(
                "metallica",
//                planningMetallica,
                Prince,
                Kirk,
                Lars,
                Robert,
                James
        );


        ////// Red hot ici


        Dancer Mick = new Dancer(
                "Michael Philip Jagger",
                79,
                "Intègre petit a petit les Rolling Stones",
                new Style[]{Style.BLUES}

        );
        Guitarist JohnFromRedHot = new Guitarist(
                "John Frusciante",
                52,
                "Guitarist of the Red Hot Chilli Peppers",
                new Style[]{Style.ROCK}

        );

        Drummer Chad = new Drummer(
                "Chad Smith",
                60,
                "Drummer of the Red Hot Chilli Peppers",
                new Style[]{Style.ROCK}
        );
        Singer Anthony = new Singer(
                "Anthony Kiedis",
                59,
                "Singer of the Red Hot Chilli Peppers",
                new Style[]{Style.ROCK}
        );

        BassPlayer Flea = new BassPlayer(
                "Michael Peter Balzary",
                59,
                "The bassplayer of the Red Hot Chilli Peppers",
                new Style[]{Style.ROCK}
        );

//        Planning planningRedHot = new Planning(
//                "Red Hot Chilli Peppers",
//                "10.04.2023 " + "\n" + "25.04.2023 " + "\n" + "4.05.2023",
//                "Las Vegas"
//        );

        Band redHotChilliPeppers = new Band(
                "redHotChilliPeppers",
//                planningRedHot,
                Mick,
                JohnFromRedHot,
                Chad,
                Flea,
                Anthony
        );

        // Queen ici


        Dancer Elvis = new Dancer(
                "Elvis presley",
                29,
                "King of Rock'n'Roll",
                new Style[]{Style.ROCKNROLL, Style.ROCK}

        );
        Guitarist Brian = new Guitarist(
                "Brian May",
                62,
                "Guitarist of Queen",
                new Style[]{Style.ROCK}
        );

        Drummer Roger = new Drummer(
                "Roger Taylor",
                54,
                "Drummer of Queen",
                new Style[]{Style.ROCK}        );
        Singer Freddie = new Singer(
                "Freddie Mercury",
                56,
                "Singer of Queen",
                new Style[]{Style.ROCK}        );

        BassPlayer JohnFromQueen = new BassPlayer(
                "John Deacon",
                71,
                "The bassplayer Queen",
                new Style[]{Style.ROCK}        );

//        Planning planningQueen = new Planning(
//                "Queen",
//                "2.04.2023" + "\n" + " 15.04.2023 " + "\n" + " 30.04.2023",
//                "Las Vegas"
//
//        );

        Band queen = new Band(
                "Queen",
//                planningQueen,
                Elvis,
                Brian,
                Roger,
                JohnFromQueen,
                Freddie
        );




        // Fonction
        metallica.guitarist.play(); // structure to call the playNotes method
        System.out.println(metallica.drummer.toString());
        System.out.println(redHotChilliPeppers.guitarist.toString());
        System.out.println(metallica.singer.toString());
        System.out.println(metallica.bassplayer.toString());
        System.out.println(metallica.dancer.toString());

        // Goal for this week
        System.out.println(metallica.toString());
        System.out.println(redHotChilliPeppers.toString());


        metallica.drummer.play();

        metallica.bassplayer.play();

        // if enough time
        redHotChilliPeppers.play();
        metallica.play();

        // Dates et lieu des groupes
//        metallica.guitarist.playBand();
//        System.out.println(redHotChilliPeppers.toString());
//        System.out.println(queen.toString());

//         Check if the group can play or not
        queen.play();


        // Savoir POURQUOI je l'ai fait, savoir justifier son action et bien explique la raison de POURQUOI on l'a fait comme ca et pas autrement

    }
}
