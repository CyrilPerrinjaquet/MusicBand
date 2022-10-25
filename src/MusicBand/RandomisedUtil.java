package MusicBand;

import java.lang.reflect.Array;
import java.util.Random;

public class RandomisedUtil {

        public static <T extends Enum<T>> T[] randomised(int lengthOfArray, Class<T> type) {
            if (lengthOfArray < 0) {
                return (T[])Array.newInstance(type,0);
            }
            T[] elements = (T[])Array.newInstance(type,lengthOfArray);

//        for (int currentNotesIndex = 0; currentNotesIndex < notes.length; currentNotesIndex++) {
            int currentIndex = 0;
            while (currentIndex < lengthOfArray) {

                // tire une note au hasard
                int randomIndex = new Random().nextInt(0, type.getEnumConstants().length); /* si on fait - 1 il va pas compter la derniere note/clé*/
                // récupere la note à la valeur randomIndex
                T randomElement = type.getEnumConstants()[randomIndex];

                // Récupere la note précédente
                int previousIndex = Math.max(currentIndex - 1, 0); // récupère l'index précédent ou le premier élément
                T previousElement = elements[previousIndex]; // récuperer la note qui a l'index "previous index"

                // Ajouter la note si et seulement si elle est différente de la précédente
                if (randomElement != previousElement) {
                    elements[currentIndex] = randomElement; // sauvegarde randomNote dans le tableau note a l'index currentNoteIndex
                    currentIndex++;
                }
            }

            return elements;
    }
}
