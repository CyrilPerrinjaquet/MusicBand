package MusicBand;

public class Singer extends Musician {
    public Singer(String name, int age, String experiences, Styles[] styles) {
        super(name, age, experiences, styles);
    }

    public void prep() {
        String prep = " is prepairing hes voice before the show";
        System.out.println(prep);

    }
    public String play() {
    prep();
        return "";
    }

    @Override
    public String toString() {
        return "The Singer : \n" + super.toString();
    }
}
