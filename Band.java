package MusicBand;


import java.text.NumberFormat;

public class Band  {
    protected BassPlayer bassplayer;

    protected Guitarist guitarist;
    protected Drummer drummer;

    protected Singer singer;
    protected Dancer dancer;

    public Band(Dancer dancer, Guitarist guitarist) {
        this.dancer  = dancer;
        this.singer = new Singer("Freddie Mercury", 35, "One of the best singer and played piano/guitar too",  new MembersBand.Styles[MembersBand.Styles.ROCK.ordinal()]);
        this.guitarist = guitarist;
        this.bassplayer = new BassPlayer();
        this.drummer = new Drummer();
    }


    @Override
    public String toString() {
        // TODO a implémenter
    }

}