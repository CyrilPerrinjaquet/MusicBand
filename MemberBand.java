package MusicBand;

import javax.swing.*;
import javax.swing.text.Style;
import java.util.Arrays;
import java.util.concurrent.atomic.DoubleAccumulator;

public class MemberBand  {
    protected String name;
    protected int age;
    protected String experiences;

    protected Styles[] styles;

    public MemberBand(String name, int age, String experiences, Styles[] styles) {
        this.name = name;
        this.age = age;
        this.experiences = experiences;
        this.styles = styles;
    }

    /// Fonction jouer
    public void play() {
        String count = "1, 2, 3, 4, ";
        String ready = "Ready to go !";
        System.out.println(count + ready);
    }


    public String toString() {
        String description = "Name : " + name + "\n" + "Experiences : " + experiences + "\n" + "Styles : " + "\n";
        for(Styles style : styles) {
           description = description + style.toString() + "\n";
       }
        return description;
    }


   public enum Styles { // peut-être faire des sous styles(ex. funk rock, punk rock etc)
        ROCK,
        ROCKNROLL,
        RandB,
        BLUES,
        METAL,
        HEAVYMETAL
    }

}


