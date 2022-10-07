package MusicBand;

public class Drummer extends Musician {
    public Drummer(String name, int age, String experiences, Style[] styles) {
        super(name, age, experiences, styles);
    }

    public void playBand() { // for the band
        String ready = this.name + " :" + " IM READY !";
        System.out.println(ready);
    }

    public void repair() { // component of the method play
        String repair = this.name + " is repairing hes drums before the show";
        System.out.println(repair);
    }


    public void play() { // the principal method of the guitarist
        repair();
        super.playNotes();
    }

    @Override
    public String toString() {
        return "The Drummer : \n" + super.toString();
    }
}
