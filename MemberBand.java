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
     * The name is displayed for every artist and also for the Bands
     * @return the name of the artist/Band
     */
    protected String name;
    /**
     * The age is displayed for every artist but not for the Band
     * @return the age of the artists and only THE artists
     */
    protected int age;
    /**
     * The experience is displayed for every artist but also for the Band
     * @return the experiences of the artists and only THE artists
     */
    protected String experiences;
    /**
     * The styles is displayed for every artist but not for the Band
     * @return the styles of the artists and only THE artists
     */
    protected Style[] styles;

    public MemberBand(String name, int age, String experiences, Style[] styles) {
        this.name = name;
        this.age = age;
        this.experiences = experiences;
        this.styles = styles;
    }


    /**
     * La méthode toString dans memberBand est la méthode principale, elle affiche l'expérience, les styles, le nom, et l'age
     * @return la description qui inclu : nom, age, expérience, et styles
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


