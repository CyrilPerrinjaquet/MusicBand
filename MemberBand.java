package MusicBand;

import javax.swing.*;
import javax.swing.text.Style;
import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.atomic.DoubleAccumulator;

public class MemberBand {
    private ArrayList<Notes> notes; // array list OF the enum Notes
    private int notesIndex;
    protected String name;
    protected int age;
    protected String experiences;

    protected Styles[] styles;

    public MemberBand(String name, int age, String experiences, Styles[] styles) {
        this.name = name;
        this.age = age;
        this.experiences = experiences;
        this.styles = styles;
        this.notes = new ArrayList<>();
        notes.add(Notes.DO);
        notes.add(Notes.RE);
        notes.add(Notes.MI);
        notes.add(Notes.FA);
        notes.add(Notes.SOL);
        notes.add(Notes.LA);
        notes.add(Notes.SI);
        Collections.shuffle(notes);
        this.notesIndex = 0;
    }


    public String toString() {
        String description = "Name : " + name + "\n" + "Experiences : " + experiences + "\n" + "Styles : " + "\n";
        for (Styles style : styles) {
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

    }
    public Notes randomNotes() {
        if (notesIndex >= notes.size()) {
            notesIndex = 0;
            Collections.shuffle(notes);
        }
        Notes note = notes.get(notesIndex);
        notesIndex++; // si a la fin du tableau --> on retourne a 0; sinon crash

        return note;

    }

}


