package MusicBand;

public class Drummer extends Musician {
    public Drummer(String name, int age, String experiences, Styles[] styles) {
        super(name, age, experiences, styles);
        this.name = name;
    }

    public void justBeforePlaying() {
        String ready = this.name + " :" + " IM READY !";
        System.out.println(ready);
    }
    public void repair() {
        String repair = this.name + " is repairing hes drums before the show";
        System.out.println(repair);
    }
    public String play() {
        repair();
        return "";
    }
    @Override
    public String toString() {
        return "The Drummer : \n" + super.toString();
    }
}
