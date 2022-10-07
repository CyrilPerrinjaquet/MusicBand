package MusicBand;

public class Singer extends Musician {
    public Singer(String name, int age, String experiences, Style[] styles) {
        super(name, age, experiences, styles);
    }

    public void playBand() {
        String ready = this.name + " :" + " IM READY !";
        System.out.println(ready);
    }

    public void prep() {
        String prep = this.name + " is prepairing hes voice before the show";
        System.out.println(prep);

    }

    public void play() {
        prep();
        super.playNotes();
    }

    @Override
    public String toString() {
        return "The Singer : \n" + super.toString();
    }
}
