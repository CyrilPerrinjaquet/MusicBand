package MusicBand;

public class BassPlayer extends Musician {
    public BassPlayer(String name, int age, String experiences, Style[] styles) {
        super(name, age, experiences, styles);
    }

    /**
     * The method is used when we make the entire group play
     * @prints the name of the member + ready
     */
    public void playBand() {
        String ready = this.name + " :" + " IM READY !";
        System.out.println(ready);
    }

    /**
     * Make the Bassplayer tune he's bass
     * @prints The variable tune who's indicating the member is tuning he's bass
     */
    public void tuning() {
        String tune = this.name + " is tuning he's bass before the show";
        System.out.println(tune);
    }

    /**
     * play() is a general method which includes the method stretching() method above and the method playNotes()
     *  The method is about make the Bassplayer play
     */
    public void play() {
        tuning();
        super.playNotes();
    }

    /**
     * The toString() is pointing to the MemberBand toString()[which is the main toString method]
     * @return "The Bassplayer" + the desription in the memberband toString()
     */
    @Override
    public String toString() {
        return "The Bassplayer : \n" + super.toString();
    }
}
