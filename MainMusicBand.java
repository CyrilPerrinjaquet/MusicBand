package MusicBand;

public class MainMusicBand {
    public static void main(String[] args) {
        Guitarist elvis = new Guitarist(
                "elvis",
                49,
                "amazing elvis",
                new MembersBand.Styles[MembersBand.Styles.ROCK.ordinal()]
        );

        Band metallica = new Band(
                new Dancer(
                      "elvis",
                      49,
                      "amazing elvis",
                        new MembersBand.Styles[MembersBand.Styles.ROCK.ordinal()]
                ),
                elvis
        );



        Band redHotChilliPepper = new Band(
                new Dancer(
                        "dolly parton",
                        78,
                        "amazing dolly",
                        new MembersBand.Styles[MembersBand.Styles.ROCK.ordinal()]
                ),
                elvis

        );
        // Fonctions



        System.out.println(metallica.drummer.toString());
        System.out.println(redHotChilliPepper.guitarist.toString());
        System.out.println(metallica.singer.toString());
        System.out.println(metallica.bassplayer.toString());
        System.out.println(metallica.dancer.toString());


    }
}
