package MusicBand;


import java.text.NumberFormat;

public class Band {
    public String name;
    protected Musician musician;
    protected BassPlayer bassplayer;

    protected Guitarist guitarist;
    protected Drummer drummer;

    protected Singer singer;
    protected Dancer dancer;

    public Band(String name, Dancer dancer, Guitarist guitarist, Drummer drummer, BassPlayer bassplayer, Singer singer) {
        this.name = name;
        this.dancer  = dancer;
        this.singer = singer;
        this.guitarist = guitarist;
        this.bassplayer = bassplayer;
        this.drummer = drummer;
    }

    public String play() {
        guitarist.justBeforePlaying();
        bassplayer.justBeforePlaying();
        dancer.justBeforePlaying();
        singer.justBeforePlaying();
        drummer.justBeforePlaying();
        String yeah = "Here it comes ! " + this.name;
        System.out.println("1, 2, 3, 4 " + yeah);
        return "";

    }

    @Override
    public String toString() {
      String descriptionDancer = "The dancer of " + name + " is : " + dancer.name + " and he is " + dancer.age + "\n" + "who he is : " + dancer.experiences + "\n" + "\n";
      String descriptionSinger = "The singer is " + name + " is : " + singer.name + " and he is " + singer.age + "\n" + "who he is : " + singer.experiences + "\n" + "\n";
      String descriptionGuitarist = "The guitarist is " + name + " is : " +  guitarist.name + " and he is " + guitarist.age + "\n" + "who he is : " + guitarist.experiences + "\n" + "\n";
      String descriptionBassPlayer = "The bass player is " + name + " is : " +  bassplayer.name + " and he is " + bassplayer.age + "\n" + "who he is : " + bassplayer.experiences + "\n" + "\n";
      String descriptionDrummer = "The drummer is " + name + " is : " + drummer.name + " and he is " + drummer.age + "\n" + "who he is : " + drummer.experiences + "\n" + "\n";
        // TODO a implémenter
      return descriptionDancer + descriptionSinger + descriptionGuitarist + descriptionBassPlayer + descriptionDrummer;
    }
}