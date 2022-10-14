package MusicBand;

public class Dancer extends Musician {
    public Dancer(String name, int age, String experiences, Style[] styles) {
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
     * Make the Dancer dance
     * @prints The variable stretch who's indicating the member is stretching hes muscles
     */
    public void stretching() {
        String stretch = this.name + " is stretching hes muscles before the show";
        System.out.println(stretch);
    }

    /**
     * play() is a general method which includes the method stretching() method above and the method playNotes()
     *  The method is about make the Dancer play
     */
    public void play() {
        stretching();
        super.playNotes();
    }

    /**
     * The toString() is pointing to the MemberBand toString()[which is the main toString method]
     * @return "The Dancer" + the desription in the memberband toString()
     */
    @Override
    public String toString() {// expliquer ce que sa fait
        return "The Dancer : \n" + super.toString();
    }
}
