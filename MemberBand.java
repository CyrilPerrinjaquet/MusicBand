package MusicBand;

import javax.swing.*;
import javax.swing.text.Style;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.atomic.DoubleAccumulator;

public class MemberBand {
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


    public String toString() {
        String description = "Name : " + name + "\n" + "Experiences : " + experiences + "\n" + "Styles : " + "\n";
        for(Styles style : styles) {
           description = description + style.toString() + "\n";
       }
        return description;
    }


   public enum Styles { // Maybe make some sub-styles like (ex. funk rock, punk rock etc..)
        ROCK,
        ROCKNROLL,
        RandB,
        BLUES,
        METAL,
        HEAVYMETAL
    }

    public enum Notes {
        DO,
        RE,
        MI,
        FA,
        SOL,
        LA,
        SI;

        private static final Random NOTE = new Random();
        public static Notes randomNotes() {
            Notes[] notes = values();/* poser question sur values*/
            return notes[NOTE.nextInt(notes.length)];
        }
    }

}


