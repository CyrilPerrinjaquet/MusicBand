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

    // regrouper les musiciens ensemble -> heritage d'heritage
    // Drummer extends Musician -> Musician extends MemberBand

    // renommer la class MembersBand en MemberBand

    // musician, singer, dancer, fonction spécifique: example play for musician
    // return une string qui correspond a une note "do", re mi fa .... de maniere aleatoire

//    guitarist.play() -> fa
//    guitarist.play() -> mi


}

