package MusicBand;

// créer une classe musician school, Arraylist d'éleve/musiciens mais que d'un type donc que des danceurs singer etc
// méthode getStudents()
// Créer une école de singer, guitarist en instanciant dans le main
// ajouter des students donc addStudents()

import java.util.ArrayList;

public class MusicSchool<T extends Musician>  {
    private ArrayList<T> students;
    public MusicSchool() {
        this.students = new ArrayList<>();
    }

    public ArrayList<T> getStudents() {
        return students;
    }

    public T getStudent(int index) {
        return students.get(index);
    }
    public void play() {
        for (int index = 0; index < students.size(); index++) {
            students.get(index).play();
        }
    }
    public void addStudent(T student) {
       students.add(student) ;
    }

}
