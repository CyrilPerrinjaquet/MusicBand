package MusicBand;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.atomic.DoubleAccumulator;

/**
 * The class is abstract here because we need to prevent problems due to the play method in the musician class
 * But we can't make the classes of the members abstract because we need the to be instantiated
 */

public abstract class MemberBand {
    /**
     * Everybody(artist) and the bands have names
     * We can specify the name like as we want (ex. full name : Brad Pitt)
     */
    protected String name;
    // précision de l'attribut
   // représenter l'age sémentiquement
    /**
     * Everybody(artist) has an age [I can also add an age to the band but for now I don't want to]
     * The age is in the years format (ex. the guitarist is 50 years old)
     * The artist can have only one age (obviously)
     */
    protected int age;
    /**
     * Everybody(artist) has experiences [Not for the band]
     * Experiences just say who he is and what he did/do
     * The artist can have several experiences
     */
    protected String experiences;
    /**
     * Everybody(artist) has styles attributed to [I can also add styles to the band but for now I don't want to]
     * The styles are Music styles so like rock, pop, blues etc..
     * Every artist can have multiple styles
     */
    protected Style[] styles;

    public MemberBand(String name, int age, String experiences, Style[] styles) {
        this.name = name;
        this.age = age;
        this.experiences = experiences;
        this.styles = styles;
    }


    /**
     * The toString method is the main method, his objective is to make a description of the band/artist
     * @return The description which includes : name, age, experience, styles
     */
    public String toString() {
        String description = "Name : " + name + "\n" + "Experiences : " + experiences + "\n" + "Styles : " + "\n";
        for (Style style : styles) {
            description = description + style.toString() + "\n";
        }
        return description;
    }

// javadocs sur toutes les méthodes et attributs

}


