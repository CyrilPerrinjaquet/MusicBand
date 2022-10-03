package MusicBand;

import java.awt.image.BaseMultiResolutionImage;

public class Guitarist extends Musician {

    public Guitarist(String name, int age, String experiences, Styles[] styles) {
        super(name, age, experiences, styles);
    }

    public void justBeforePlaying() {
        String ready = this.name + " :" + " IM READY !";
        System.out.println(ready);
    }

    public void accord() {
        /*expemple of optimisation *///    String separator = ", ";
        String tune = this.name /*separator*/ + " is tuning he's guitar before the show";
        System.out.println(tune);
    }

    public String play() {
        accord();
        super.notes();
        return "";
    }

    @Override
    public String toString() {
        return "The Guitarist : \n" + super.toString();
    }
}
