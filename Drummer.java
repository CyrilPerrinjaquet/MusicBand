package MusicBand;

public class Drummer extends Musician {
    public Drummer(String name, int age, String experiences, Style[] styles) {
        super(name, age, experiences, styles);
    }

    /**
     * The method is used when we make the entire group play
     * @prints the name of the member + ready
     */
    public void playBand() { // for the band
        String ready = this.name + " :" + " IM READY !";
        System.out.println(ready);
    }

    /**
     * Make the Drummer repair he's drums
     * @prints The variable repair who's indicating the member is repairing he's drums
     */
    public void repairing() { // component of the method play
        String repair = this.name + " is repairing he's drums before the show";
        System.out.println(repair);
    }


    /**
     * play() is a general method which includes the method stretching() method above and the method playNotes()
     *  The method is about make the Drummer play
     */
    public void play() { // the principal method of the drummer
        repairing();
        super.playNotes();
    }

    /**
     * The toString() is pointing to the MemberBand toString()[which is the main toString method]
     * @return "The Drummer" + the desription in the memberband toString()
     */

    @Override
    public String toString() {
        return "The Drummer : \n" + super.toString();
    }
}
