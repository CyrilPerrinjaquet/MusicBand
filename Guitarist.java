package MusicBand;

import java.awt.image.BaseMultiResolutionImage;

public class Guitarist extends MembersBand {

    public Guitarist(String name, int age, String experiences, Styles[] styles) {
        super(name, age, experiences, styles);
    }

    @Override
    public String toString() {
        return "The Guitarist : \n" + super.toString();
    }
}
