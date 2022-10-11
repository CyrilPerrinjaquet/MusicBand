package MusicBand;



public abstract class Musician extends MemberBand {

    public Musician(String name, int age, String experiences, Style[] styles) {
        super(name, age, experiences, styles);

    }

    /**
     * Ca fait quoi ?
     * The method play() here is just saying that the method exists
     * Should be define by the child classes
     * AJouter la diff entre la méthode play et la playNotes
     */
    public abstract void play();


    /**
     * the playNotes() method makes the artist play some random notes
     * print 10 random notes coming from the enum Note
     */
   public void playNotes() {
       Note[] notes = Note.randomNotes();
       for (int notesIndex = 0; notesIndex < notes.length; notesIndex++) {
           System.out.println(notes[notesIndex]);
       }
   }

}


