package MusicBand;

public class MainMusicBand {
    public static void main(String[] args) {

        // Create a guitarist to be able to reuse it
        Guitarist elvis = new Guitarist(
                "elvis",
                49,
                "amazing elvis",
                new MemberBand.Styles[MemberBand.Styles.ROCK.ordinal()]
        );

        // Create the band Metallica
        Band metallica = new Band(
                new Dancer(
                      "elvis",
                      49,
                      "amazing elvis",
                        new MemberBand.Styles[MemberBand.Styles.ROCK.ordinal()]
                ),
                elvis
        );



        // Create the band Red Hot Chilli Peppers
        Band redHotChilliPeppers = new Band(
                new Dancer(
                        "dolly parton",
                        78,
                        "amazing dolly",
                        new MemberBand.Styles[MemberBand.Styles.ROCK.ordinal()]
                ),
                elvis

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
