package MusicBand;


import java.text.NumberFormat;
import java.util.Objects;
import java.util.HashMap;

public class Band {
    public String name;
    protected BassPlayer bassplayer;
    protected Guitarist guitarist;
    protected Drummer drummer;

    protected Singer singer;
    protected Dancer dancer;

    public Band(String name, Dancer dancer, Guitarist guitarist, Drummer drummer, BassPlayer bassplayer, Singer singer) {
        this.name = name;
        this.dancer = dancer;
        this.singer = singer;
        this.guitarist = guitarist;
        this.bassplayer = bassplayer;
        this.drummer = drummer;
    }

    /**
     * The method play() here is making play
     *
     * @return return play for all group
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
        String descriptionDancer = "The dancer of " + name + " is : " + dancer.name + " and he is " + dancer.age + "\n" + "who he is : " + dancer.experiences + "\n" + "\n";
        String descriptionSinger = "The singer is " + name + " is : " + singer.name + " and he is " + singer.age + "\n" + "who he is : " + singer.experiences + "\n" + "\n";
        String descriptionGuitarist = "The guitarist is " + name + " is : " + guitarist.name + " and he is " + guitarist.age + "\n" + "who he is : " + guitarist.experiences + "\n" + "\n";
        String descriptionBassPlayer = "The bass player is " + name + " is : " + bassplayer.name + " and he is " + bassplayer.age + "\n" + "who he is : " + bassplayer.experiences + "\n" + "\n";
        String descriptionDrummer = "The drummer is " + name + " is : " + drummer.name + " and he is " + drummer.age + "\n" + "who he is : " + drummer.experiences + "\n" + "\n";
        
        return descriptionDancer + descriptionSinger + descriptionGuitarist + descriptionBassPlayer + descriptionDrummer;
    }
}