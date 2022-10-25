package MusicBand;

import java.util.*;

/**
 * It's an enum which contains the basic notes
 */
public enum Note { // faire une javadocs sur les enums
    DO,
    RE,
    MI,
    FA,
    SOL,
    LA,
    SI;

    /**
     * This method return the numbers of notes that we want, randomised
     * @return Tableau de x notes aléatoire
     * x étant donné en paramètre
     */
    public static Note[] randomNotes(int numberOfNotes) {
        return RandomisedUtil.randomised(numberOfNotes, Note.class);
    }
}
