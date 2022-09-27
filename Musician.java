package MusicBand;

public class Musician extends MemberBand{
    public Musician(String name, int age, String experiences, Styles[] styles) {
        super(name, age, experiences, styles);
    }

    @Override
    public String toString() {
        return "Musicians : \n" + super.toString();

    }
}


