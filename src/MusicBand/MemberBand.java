package MusicBand;
import java.util.Calendar;

public abstract class MemberBand {
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

    /**
     * Setter to change the age of the member
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return int the age of the member
     * ex: 33 for 33 years old
     */
    public int getAge() {
        return this.age;
    }

    /**
     * function to increment the age of the member and wish him a great birthday in the console.
     */
    public void birthday() {
        this.age ++;
        System.out.println("Happy Birthday to you");
    }

    /**
     * method to get the year of birth of a member based on his age
     * @return the year of birthday of the Member
     */
    public int getBirthYear() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year - getAge();
    }

}


