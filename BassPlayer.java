package MusicBand;

public class BassPlayer extends Musician {
    public BassPlayer(String name, int age, String experiences, Styles[] styles) {
        super(name, age, experiences, styles);
    }

    @Override
    public String toString() {
        return "The Bassplayer : \n" + super.toString();
    }
}
