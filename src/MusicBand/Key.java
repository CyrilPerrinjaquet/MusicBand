package MusicBand;

import java.util.Random;

/**
 * It's an enum which contains the basic keys of music so (the key of G and the key of F)
 */
public enum Key {
    SOL,
    FA;

    public static Key[] randomKeys(int numberOfKeys) {
        Key[] keys = new Key[numberOfKeys];

//        for (int currentNotesIndex = 0; currentNotesIndex < notes.length; currentNotesIndex++) {
        int currentNotesIndex = 0;
        while (currentNotesIndex < numberOfKeys) {

            // tire une note au hasard
            int randomIndex = new Random().nextInt(0, Note.values().length - 1);
            // récupere la note à la valeur randomIndex
            Key randomNote = Key.values()[randomIndex];

            // Récupere la note précédente
            int previousIndex = Math.max(currentNotesIndex - 1, 0); // récupère l'index précédent ou le premier élément
            Key previouskeys = keys[previousIndex]; // récuperer la note qui a l'index "previous index"

            // Ajouter la note si et seulement si elle est différente de la précédente
            if (randomNote != previouskeys) {
                keys[currentNotesIndex] = randomNote; // sauvegarde randomNote dans le tableau note a l'index currentNoteIndex
                currentNotesIndex++;
            }
        }

        return keys;
    }






}
