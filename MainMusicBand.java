package MusicBand;

public class MainMusicBand {
    public static void main(String[] args) {

        // Create a guitarist to be able to re-use it
        // sera utile quand j'aurais plusieurs groupes pour l'instant j'en ai pas besoin
/*        Guitarist elvis = new Guitarist(
                "elvis",
                49,
                "amazing elvis",
                new MemberBand.Styles[MemberBand.Styles.ROCK.ordinal()]
        );*/



        // Create the band Metallica

        ////// Metallica ici

        Dancer Prince = new Dancer(
                "Prince Rogers Nelson",
                57,
                "The prince of pop",
                new MemberBand.Styles[MemberBand.Styles.HEAVYMETAL.ordinal()]
        );

        Guitarist Kirk = new Guitarist(
                "Kirk Hammet",
                59,
                "The guitarist of Metallica",
                new MemberBand.Styles[MemberBand.Styles.HEAVYMETAL.ordinal()]
        );
        Drummer Lars = new Drummer(
                "Lars Ulrich",
                58,
                "The drummer of Metallica",
                new MemberBand.Styles[MemberBand.Styles.HEAVYMETAL.ordinal()]
        );
        Singer James = new Singer(
                "James Hetfield",
                59,
                "The singer of Metallica",
                new MemberBand.Styles[MemberBand.Styles.HEAVYMETAL.ordinal()]
        );
        BassPlayer Robert = new BassPlayer(
                "Robert Trujillo",
                57,
                "The bassplayer of Metallica",
                new MemberBand.Styles[MemberBand.Styles.HEAVYMETAL.ordinal()]
        );
         Band metallica = new Band(
                Prince,
                Kirk,
                Lars,
                Robert,
                James

        );



        ////// Red hot ici

        // Create the band Red Hot Chilli Peppers

        Dancer Mick = new Dancer(
                "Michael Philip Jagger",
                79,
                "Intègre petit a petit les Rolling Stones",
                new MemberBand.Styles[MemberBand.Styles.BLUES.ordinal()]
        );
        Guitarist John = new Guitarist(
                "John Frusciante",
                52,
                "Guitarist of the Red Hot Chilli Peppers",
                new MemberBand.Styles[MemberBand.Styles.ROCK.ordinal()]
        );

        Drummer Chad = new Drummer(
                "Chad Smith",
                60,
                "Drummer of the Red Hot Chilli Peppers",
                new MemberBand.Styles[MemberBand.Styles.ROCK.ordinal()]
        );
        Singer Anthony = new Singer(
                "Anthony Kiedis",
                59,
                "Singer of the Red Hot Chilli Peppers",
                new MemberBand.Styles[MemberBand.Styles.ROCK.ordinal()]
        );
        BassPlayer Flea = new BassPlayer(
                "Michael Peter Balzary",
                59,
                "The bassplayer of the Red Hot Chilli Peppers",
                new MemberBand.Styles[MemberBand.Styles.ROCK.ordinal()]
        );

        Band redHotChilliPeppers = new Band(
                Mick,
                John,
                Chad,
                Flea,
                Anthony
        );


        // Fonctions
        System.out.println(metallica.drummer.toString());
        System.out.println(redHotChilliPeppers.guitarist.toString());
        System.out.println(metallica.singer.toString());
        System.out.println(metallica.bassplayer.toString());
        System.out.println(metallica.dancer.toString());

        // Goal for this week
        System.out.println(metallica.toString());
        System.out.println(redHotChilliPeppers.toString());


        System.out.println(metallica.drummer.play());
        System.out.println(metallica.guitarist.play());
        System.out.println(metallica.bassplayer.play());

        // if enough time
        System.out.println(metallica.play());

    }
}
