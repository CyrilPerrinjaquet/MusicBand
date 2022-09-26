package MusicBand;

public class Drummer extends MemberBand {
    public Drummer(String name, int age, String experiences, Styles[] styles) {
        this.name = "Chad Smith";
        this.age = 52;
        this.experiences = "Drummer of Red hot since 1988";
        this.styles = new Styles[] {
                Styles.ROCK
        };
    }

    @Override
    public String toString() {
        return "The Drummer : \n" + super.toString();
    }
}
