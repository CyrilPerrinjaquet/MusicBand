package MusicBand;

public class Drummer extends Musician {
    public Drummer(String name, int age, String experiences, Styles[] styles) {
        super(name, age, experiences, styles);
    }

    @Override
    public String toString() {
        return "The Drummer : \n" + super.toString();
    }
}
