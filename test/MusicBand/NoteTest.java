package MusicBand;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.imageio.stream.ImageInputStream;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class NoteTest {
    @Test
    void randomNotesSize() { // avantages de disperser les test c'est qu'on peut voir directement qu'est-ce qui joue pas
        Note[] notes = Note.randomNotes(4);
        assertEquals(4, notes.length);

        notes = Note.randomNotes(10);
        assertEquals(10, notes.length);
    }

    @Test
    void ensureNegativeValueDoesNotBreakFunction() {
        Note[] notes = Note.randomNotes(-1);
        assertEquals(0, notes.length);
    }

    @Test
    void randomNotesArrayFull() {
        Note[] notes = Note.randomNotes(4);

        // Check if the first, second, third etc.. have a note if not --> add a not at currenNotesIndex(the empty slot)
        for (int currentNotesIndex = 0; currentNotesIndex < notes.length; currentNotesIndex++) {
            Note randomNote = notes[currentNotesIndex];
            assertNotNull(randomNote);
        }
    }

    @Test
    void checkDoubleNotes() {
        Note[] notes = Note.randomNotes(4);

        // tire une note au hasard
        int randomIndex = new Random().nextInt(0, Note.values().length - 1);
        Note randomNote = Note.values()[randomIndex];

        // Récupere la note précédente
        for (int currentNotesIndex = 0; currentNotesIndex < notes.length; currentNotesIndex++) {
            int previousIndex = Math.max(currentNotesIndex - 1, 0); // récupère l'index précédent ou le premier élément
            Note previousNote = notes[previousIndex];
            // Check if we have two same notes in a row
            if (randomNote != previousNote) {
                notes[currentNotesIndex] = randomNote; // sauvegarde randomNote dans le tableau note a l'index currentNoteIndex
                currentNotesIndex++;
            }
        }
    }


    Band queen;

    @BeforeEach
    void setUp() {
        Dancer elvis = new Dancer(
                "Elvis presley",
                29,
                "King of Rock'n'Roll",
                new Style[]{Style.ROCKNROLL, Style.ROCK}

        );
        Guitarist brian = new Guitarist(
                "Brian May",
                62,
                "Guitarist of Queen",
                new Style[]{Style.ROCK}
        );

        Drummer roger = new Drummer(
                "Roger Taylor",
                54,
                "Drummer of Queen",
                new Style[]{Style.ROCK}
        );
        Singer freddie = new Singer(
                "Freddie Mercury",
                56,
                "Singer of Queen",
                new Style[]{Style.ROCK}
        );

        BassPlayer johnFromQueen = new BassPlayer(
                "John Deacon",
                71,
                "The bassplayer Queen",
                new Style[]{Style.ROCK}
        );

        queen = new Band(
                "Queen",
                elvis,
                brian,
                roger,
                johnFromQueen,
                freddie
        );
    }

    @Test
    void checkNumberOfNotes() {

        assertEquals(21, playNotes(21));

    }

    // Cette méthode est quasiment la même que celle que les membres ont seulement elle retourne un type int
    public int playNotes(int numberOfNotes) {
        Note[] notes = Note.randomNotes(numberOfNotes);
        for (int notesIndex = 0; notesIndex < notes.length; notesIndex++) {
//            System.out.println(notes[notesIndex]);
        }
        return notes.length;
    }
}