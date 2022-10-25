package MusicBand;

/**
 * It's an enum which contains the basic keys of music so (the key of G and the key of F and ut)
 */
public enum MusicKey { // nom plus explicite
    SOL,
    FA,
    UT;

    /**
     * This method return the numbers of keys that we want, randomised
     * @return Tableau de x keys aléatoire
     * x étant donné en paramètre
     */
    public static MusicKey[] randomKeys(int numberOfKeys) {
        return RandomisedUtil.randomised(numberOfKeys, MusicKey.class);
    }

}
