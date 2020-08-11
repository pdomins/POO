package ar.itba.edu.POO.PrimerParcial.P1;

import java.util.Arrays;

public class LimitedExamFirst extends UniqueExam {

    private int maxExam;
    Exam pending;

    public LimitedExamFirst(String name, int examSize) {
        super(name);
        this.maxExam=examSize;
        pending = new Exam("Pending students");
    }

    public void enroll(String student){
        if (super.getEnrolledCount() < maxExam){
            super.enroll(student);
        }else{
        System.out.print("Pending list: ");
        pending.enroll(student);
        }
    }

    public void unroll(String student){
        super.unroll(student);
        //lista de pendientes no este vacia
        if (pending.getEnrolledCount()>0 && this.getEnrolledCount() < maxExam) {
        String[] aux = pending.getEnrolledStudents();
        enroll(aux[0]);
        System.out.print("Removed from pending: ");
        pending.unroll(aux[0]);
        }
    }

    public String[] getPendingStudents(){
        return Arrays.copyOf(pending.getEnrolledStudents(), pending.getEnrolledCount());
    }
}
