package ar.itba.edu.POO.PrimerParcial.P1;

public class UniqueExam extends Exam {

    public UniqueExam(String name) {
      super(name);
    }

    public void enroll(String student){
        if (!isEnrolled(student)){
            super.enroll(student);
        }
    }
}
