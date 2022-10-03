package MusicBand;

//import static MusicBand.Dancer.playDancer;


import java.sql.DatabaseMetaData;

public class Musician extends MemberBand {
    public Musician(String name, int age, String experiences, Styles[] styles) {
        super(name, age, experiences, styles);
        this.name = name;
    }

    // methode play(), void play just to say the method exists
    public String play() {
        return "";
    }


    public void playnotes() {
        randomNotes();
        System.out.println(randomNotes());
    }

    // enum for the notes C, D, E, F, G, A, B create an array of notes
    @Override /*qu'est-ce qu'elle veut dire par écraser*/
    public String toString() {
        return super.toString();
    }
}


