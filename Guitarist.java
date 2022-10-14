package MusicBand;


/**
 *  I extend musician because of the method playNotes,
 *  and the musician class extends the class memberband which contains the age experiences and all the propreties that the members have
 */
public class Guitarist extends Musician {

    public Guitarist(String name, int age, String experiences, Style[] styles) {
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
     * Make the Guitarist tune he's guitar
     * @prints the variable tune who's indicating the member is tuning his guitar
     */
    public void accord() {
        /*expemple of optimisation */ //    String separator = ", ";
        String tune = this.name /*separator*/ + " is tuning he's guitar before the show";
        System.out.println(tune);
    }

    /**
     * play() is a general method which includes the method accord() method above and the method playNotes()
     * The method is about make the guitarist play
     */
    public void play() {
        accord();
        super.playNotes();
    }

    /**
     * The toString() here is returning pointing to the musician toString which is pointing to the MemberBand toString()[which is the main toString method]
     * @return "The guitarist" + the desription in the memberband toString()
     */
    @Override
    public String toString() { //  expliquer ce que sa fait, a quoi elle sert
        return "The Guitarist : \n" + super.toString();
    }
}
