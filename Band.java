package MusicBand;


import java.text.NumberFormat;

public class Band  {
    protected Musician musician;
    protected BassPlayer bassplayer;

    protected Guitarist guitarist;
    protected Drummer drummer;

    protected Singer singer;
    protected Dancer dancer;

    public Band(Dancer dancer, Guitarist guitarist, Drummer drummer, BassPlayer bassplayer, Singer singer) {
        this.dancer  = dancer;
        this.singer = singer;
        this.guitarist = guitarist;
        this.bassplayer = bassplayer;
        this.drummer = drummer;
    }


    @Override
    public String toString() {
        // TODO a implémenter
    }
}