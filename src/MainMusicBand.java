import MusicBand.*;

import java.util.ArrayList;
import java.util.Arrays;

public class MainMusicBand {
    public static void main(String[] args) {
        Band metallica = createMetallica();
        Band redHotChilliPeppers = createRedHotChilliPeppers();
        Band queen = createQueen();

       MusicSchool<Singer> singerMusicSchool = new MusicSchool<>();
       MusicSchool<Guitarist> guitaristMusicSchool = new MusicSchool<>();
       MusicSchool<Musician> musicianMusicSchool = new MusicSchool<>();

        singerMusicSchool.addStudent(metallica.singer);
        singerMusicSchool.addStudent(queen.singer);
        guitaristMusicSchool.addStudent(metallica.guitarist);
        guitaristMusicSchool.addStudent(redHotChilliPeppers.guitarist);
        guitaristMusicSchool.addStudent(queen.guitarist);
        System.out.println(guitaristMusicSchool.getStudents());

        singerMusicSchool.play();
    }
    public static Band createMetallica() {
        Dancer prince = new MusicBand.Dancer(
                "Prince Rogers Nelson or 'Prince'",
                57, "The prince of pop",
                new Style[]{Style.HEAVYMETAL, Style.METAL}
        );
        Guitarist kirk = new Guitarist(
                "Kirk Hammet",
                59,
                "The guitarist of Metallica",
                new Style[]{Style.HEAVYMETAL, Style.METAL});
        Drummer lars = new Drummer(
                "Lars Ulrich",
                58,
                "The drummer of Metallica",
                new Style[]{Style.HEAVYMETAL, Style.METAL});
        Singer james = new Singer(
                "James Hetfield",
                59,
                "The singer of Metallica",
                new Style[]{Style.HEAVYMETAL, Style.METAL});
        BassPlayer robert = new BassPlayer(
                "Robert Trujillo",
                57,
                "The bassplayer of Metallica",
                new Style[]{Style.HEAVYMETAL, Style.METAL});
        return new Band(
                 "metallica",
                 prince,
                 kirk,
                 lars,
                 robert,
                 james);
    };

    public static Band createRedHotChilliPeppers() {
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
        return new Band(
                "redHotChilliPeppers",
                Mick,
                JohnFromRedHot,
                Chad,
                Flea,
                Anthony
        );
    }

    public static Band createQueen() {
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
                new Style[]{Style.ROCK}
        );
        Singer Freddie = new Singer(
                "Freddie Mercury",
                56,
                "Singer of Queen",
                new Style[]{Style.ROCK}
        );
        BassPlayer JohnFromQueen = new BassPlayer(
                "John Deacon",
                71,
                "The bassplayer Queen",
                new Style[]{Style.ROCK}
        );
        return new Band(
                "Queen",
                Elvis,
                Brian,
                Roger,
                JohnFromQueen,
                Freddie
        );
    }
}
