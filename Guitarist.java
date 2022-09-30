package MusicBand;

import java.awt.image.BaseMultiResolutionImage;

public class Guitarist extends Musician {

    public Guitarist(String name, int age, String experiences, Styles[] styles) {
        super(name, age, experiences, styles);
    }

    public void accord() {
        String tune = " is tuning he's guitar before the show";
        System.out.println(tune);
    }
    public String play() {
    accord();
        return "";
    }

    @Override
    public String toString() {
        return "The Guitarist : \n" + super.toString();
    }
}
