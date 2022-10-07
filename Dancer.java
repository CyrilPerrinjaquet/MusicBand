package MusicBand;

public class Dancer extends Musician {
    public Dancer(String name, int age, String experiences, Style[] styles) {
        super(name, age, experiences, styles);
    }

    public void playBand() {
        String ready = this.name + " :" + " IM READY !";
        System.out.println(ready);
    }

    public void stretch() {
        String stretch = this.name + " is stretching hes muscles before the show";
        System.out.println(stretch);
    }
    public void play() {
        stretch();
        super.playNotes();
    }

    @Override
    public String toString() {
        return "The Dancer : \n" + super.toString();
    }
}
