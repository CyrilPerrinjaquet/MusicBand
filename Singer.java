package MusicBand;

public class Singer extends MembersBand {
    public Singer(String name, int age, String experiences, Styles[] styles) {
        super(name, age, experiences, styles);
    }

    @Override
    public String toString() {
        return "The Singer : \n" + super.toString();
    }
}
