package MusicBand;

public class BassPlayer extends MembersBand {
    public BassPlayer(String name, int age, String experiences, Styles[] styles) {
        this.name = "Duff McKagan";
        this.age = 45;
        this.experiences = "Never touched a bass but he was introduced to it in the 85's";
        this.styles = new Styles[] {
                Styles.ROCK
        };
    }

    @Override
    public String toString() {
        return "The Bassplayer : \n" + super.toString();
    }
}
