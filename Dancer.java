package MusicBand;

public class Dancer extends Musician {
    public Dancer(String name, int age, String experiences, Styles[] styles) {
        super(name, age, experiences, styles);
    }

    public void justBeforePlaying() {
        String ready = this.name + " :" + " IM READY !";
        System.out.println(ready);
    }

    public void stretch() {
        String stretch = this.name + " is stretching hes muscles before the show";
        System.out.println(stretch);
    }

    public String play() {
        stretch();
        super.playnotes();
        return "";
    }

    @Override
    public String toString() {
        return "The Dancer : \n" + super.toString();
    }
}
