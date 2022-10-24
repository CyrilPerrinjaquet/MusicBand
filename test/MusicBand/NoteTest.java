package MusicBand;

import org.junit.jupiter.api.Test;

import java.util.Random;

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
        Note[] notes = Note.randomNotes();

        // tire une note au hasard
        int randomIndex = new Random().nextInt(0, Note.values().length - 1);
        Note randomNote = Note.values()[randomIndex];

        // Récupere la note précédente
        for (int currentNotesIndex = 0; currentNotesIndex < 10; currentNotesIndex++) {
            int previousIndex = Math.max(currentNotesIndex - 1, 0); // récupère l'index précédent ou le premier élément
            Note previousNote = notes[previousIndex];
            // Check if we have two same notes in a row
            if (randomNote != previousNote) {
                notes[currentNotesIndex] = randomNote; // sauvegarde randomNote dans le tableau note a l'index currentNoteIndex
                currentNotesIndex++;
            }
        }
    }
}
