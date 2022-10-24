package MusicBand;

public class Singer extends Musician {
    public Singer(String name, int age, String experiences, Style[] styles) {
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
     * Make the Singer to prepare his voice
     * @prints The variable prep who's indicating the member is prepairing he's voice
     */
    public void preparation() {
        String prep = this.name + " is prepairing hes voice before the show";
        System.out.println(prep);

    }

    /**
     * play() is general method which includes the method preparation() method above and the method playNotes()
     * The method is about make the Singer sing
     */
    public void play() {
        preparation();
        super.playNotes();
    }

    /**
     * The toString() is pointing to the MusicBand.MemberBand toString()[which is the main toString method]
     * @return "The Singer" + the desription in the memberband toString()
     */
    @Override
    public String toString() {// expliquer ce que sa fait
        return "The Singer : \n" + super.toString();
    }
}
