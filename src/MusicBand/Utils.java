package MusicBand;
public class Utils {
    public static double getHypothenuse(int adj, int opp) {
        if (adj < 0 || opp < 0) {
            return 0;
        }
        double hypothenuse = Math.pow(adj, 2) + Math.pow(opp, 2);
        return Math.sqrt(hypothenuse);
    }
}
