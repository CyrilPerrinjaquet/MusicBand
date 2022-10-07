package MusicBand;

public class Guitarist extends Musician {

    public Guitarist(String name, int age, String experiences, Style[] styles) {
        super(name, age, experiences, styles);
    }


    /**
     * The method playBand is used for all the band which is playing
     * @return the name of the member + ready
     */
    public void playBand() {
        String ready = this.name + " :" + " IM READY !";
        System.out.println(ready);
    }

    public void accord() {
        /*expemple of optimisation */ //    String separator = ", ";
        String tune = this.name /*separator*/ + " is tuning he's guitar before the show";
        System.out.println(tune);
    }

    public void play() {
        accord();
        super.playNotes();
    }

    @Override
    public String toString() {
        return "The Guitarist : \n" + super.toString();
    }
}
