package MusicBand;


public class Band {
    public String name;
    public MusicBand.BassPlayer bassplayer;
    public MusicBand.Guitarist guitarist;
    public MusicBand.Drummer drummer;

    public MusicBand.Singer singer;
    public MusicBand.Dancer dancer;

    public Band(String name, MusicBand.Dancer dancer, MusicBand.Guitarist guitarist, MusicBand.Drummer drummer, MusicBand.BassPlayer bassplayer, MusicBand.Singer singer) {
        this.name = name;
        this.dancer = dancer;
        this.singer = singer;
        this.guitarist = guitarist;
        this.bassplayer = bassplayer;
        this.drummer = drummer;
    }

    /**
     * Make all the band play together
     * @prints The name of the musician + the variable yeah
    */

    public void play() {
        guitarist.playBand();
        bassplayer.playBand();
        dancer.playBand();
        singer.playBand();
        drummer.playBand();
        String yeah = "Here it comes " + this.name + " ! " + "\n";
        System.out.println("1, 2, 3, 4 " + yeah);
    }


    public String toString() {
        return dancer.toString() + "\n" + singer.toString() + "\n" + guitarist.toString() + "\n" + bassplayer.toString() + "\n" + drummer.toString();
    }
}