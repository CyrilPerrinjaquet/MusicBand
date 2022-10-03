package MusicBand;

public class BassPlayer extends Musician {
    public BassPlayer(String name, int age, String experiences, Styles[] styles) {
        super(name, age, experiences, styles);
    }

    public void justBeforePlaying() {
        String ready = this.name + " :" + " IM READY !";
        System.out.println(ready);
    }

    public void tuning() {
        String tune = this.name + " is tuning hes bass before the show";
        System.out.println(tune);
    }

    public String play() {
        tuning();
        super.playnotes();
        return "";
    }

    @Override
    public String toString() {
        return "The Bassplayer : \n" + super.toString();
    }
}
