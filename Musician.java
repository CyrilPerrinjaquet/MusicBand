package MusicBand;

//import static MusicBand.Dancer.playDancer;


import java.util.Arrays;

public abstract class Musician extends MemberBand {

    public Musician(String name, int age, String experiences, Style[] styles) {
        super(name, age, experiences, styles);

    }

    // methode play(), void play just to say the method exists
    public abstract void play();


    /**
     * the playnotes() method makes the artist play some random notes
     * @return random notes between {DO, RE, MI, FA, SOL, LA, SI}
     */
   public void playNotes() {
       Note[] notes = Note.randomNotes();
       for (int notesIndex = 0; notesIndex < notes.length; notesIndex++) {
           System.out.println(notes[notesIndex]);
       }
   }

    // enum for the notes C, D, E, F, G, A, B create an array of notes
    @Override
    public String toString() {
        return super.toString();
    }
}


