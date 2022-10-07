package MusicBand;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.atomic.DoubleAccumulator;

public abstract class MemberBand {
    private int notesIndex;
    protected String name;
    protected int age;
    protected String experiences;

    protected Style[] styles;

    public MemberBand(String name, int age, String experiences, Style[] styles) {
        this.name = name;
        this.age = age;
        this.experiences = experiences;
        this.styles = styles;
    }


    public String toString() {
        String description = "Name : " + name + "\n" + "Experiences : " + experiences + "\n" + "Styles : " + "\n";
        for (Style style : styles) {
            description = description + style.toString() + "\n";
        }
        return description;
    }



}


