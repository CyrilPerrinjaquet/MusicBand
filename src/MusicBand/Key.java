package MusicBand;

import java.util.Random;

/**
 * It's an enum which contains the basic keys of music so (the key of G and the key of F and ut)
 */
public enum Key {
    SOL,
    FA,
    UT;

    public static Key[] randomKeys(int numberOfKeys) {
        if (numberOfKeys < 0) {
            return new Key[0];
        }
        Key[] keys = new Key[numberOfKeys];

//        for (int currentKeyIndex = 0; currentKeyIndex < keys.length; currentKeyIndex++) {
        int currentKeyIndex = 0;
        while (currentKeyIndex < numberOfKeys) {

            // tire une key au hasard
            int randomIndex = new Random().nextInt(0, Key.values().length);
            // récupere la key à la valeur randomIndex
            Key randomKey = Key.values()[randomIndex];

            // Récupere la key précédente
            int previousIndex = Math.max(currentKeyIndex - 1, 0); // récupère l'index précédent ou le premier élément
            Key previouskeys = keys[previousIndex]; // récuperer la key qui a l'index "previous index"

            // Ajouter la key si et seulement si elle est différente de la précédente
            if (randomKey != previouskeys) {
                keys[currentKeyIndex] = randomKey; // sauvegarde randomKey dans le tableau Key a l'index currentKeyIndex
                currentKeyIndex++;
            }
        }
        return keys;
    }
}
