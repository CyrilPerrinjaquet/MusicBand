package MusicBand;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NoteTest {
    @Test
    void randomNotesHas10Notes() { // avantages de disperser les test c'est qu'on peut voir directement qu'est-ce qui joue pas
        Note[] notes = Note.randomNotes();

        assertEquals(10, notes.length);
    }

    @Test
    void randomNotesArrayFull() {
        Note[] notes = Note.randomNotes();

        // Check if the first, second, third etc.. have a note if not --> add a not at currenNotesIndex(the empty slot)
        for (int currentNotesIndex = 0; currentNotesIndex < 10; currentNotesIndex++) {
            Note randomNote = notes[currentNotesIndex];
            assertNotNull(randomNote);
        }
    }

    @Test
    void checkDoubleNotes() {
        // TODO à faire vendredi
    }
}
