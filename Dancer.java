package MusicBand;

public class Dancer extends Musician {
    public Dancer(String name, int age, String experiences, Styles[] styles) {
        super(name, age, experiences, styles);
    }

    @Override
    public String toString() {
        return "The Dancer : \n" + super.toString();
    }
}
