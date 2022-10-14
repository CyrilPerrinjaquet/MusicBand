package MusicBand;



public abstract class Musician extends MemberBand {

    public Musician(String name, int age, String experiences, Style[] styles) {
        super(name, age, experiences, styles);
    }

    /**
     *
     * The method play() here is just saying that the method exists
     * It should be define by the child class <br />
     * The difference between the method play() and the method playNotes() it's that the method playNotes() picks a random note and prints it contrary to the method play() which is only defined by the child class and used in it
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


