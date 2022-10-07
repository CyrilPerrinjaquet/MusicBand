package MusicBand;

import java.util.*;

public enum Note {
    DO,
    RE,
    MI,
    FA,
    SOL,
    LA,
    SI;

    /**
     * Cette fonction retourne 10 notes
     * @return 10 notes
     */
    public static Note[] randomNotes() {
        Note[] notes = new Note[10];

//        for (int currentNotesIndex = 0; currentNotesIndex < 10; currentNotesIndex++) {
            int currentNotesIndex = 0;
            while (currentNotesIndex < 10) {
                // tire une note au hasard
                int randomIndex = new Random().nextInt(0, Note.values().length - 1);
                Note randomNote = Note.values()[randomIndex];
                // Récupere la note précédente
                int previousIndex = Math.max(currentNotesIndex - 1, 0); // récupère l'index précédent ou le premier élément
                Note previousNote = notes[previousIndex]; // récuperer la note qui a l'index "previous index"

                // Ajouter la note si et seulement si elle est différente de la précédente
                if (randomNote != previousNote) {
                    notes[currentNotesIndex] = randomNote; // sauvegarde randomNote dans le tableau note a l'index currentNoteIndex
                    currentNotesIndex++;
                }
            }

        return notes;
    }
}