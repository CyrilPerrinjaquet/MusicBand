package MusicBand;

// créer une classe musician school, Arraylist d'éleve/musiciens mais que d'un type donc que des danceurs singer etc
// méthode getStudents()
// Créer une école de singer, guitarist en instanciant dans le main
// ajouter des students donc addStudents()

import java.util.ArrayList;

public class MusicSchool<Type extends Musician>  {
    private ArrayList<Type> students;
    public MusicSchool() {
        this.students = new ArrayList<>();
    }

    public ArrayList<Type> getStudents() {
        return students; // ici c'est comme la méthode getStudent() sauf qu'elle retourne la liste du type précisé et pas le students en question a l'index indiquer
    }

    public Type getStudent(int index) {
        return students.get(index); // retourne le student a l'index indiquer // pour que cette méthode marche il faudrait dabord que l'on ajoute dans la liste
    }
    public void play() {
        for (int index = 0; index < students.size(); index++) {
            students.get(index).play();
        }
    }
    public void addStudent(Type student) { // ici c'est le type qui définit ce qu'on va ajouter mais il est déja défini par MusicSchool ce qui fait que l'IDE le reconnait directement
       students.add(student);// il est en relation avec le type de MusicSchool
    }

}
