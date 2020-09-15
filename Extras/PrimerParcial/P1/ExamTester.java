package ar.itba.edu.PrimerParcial.P1;

import java.util.Arrays;

public class ExamTester {
    public static void main(String[] args){
        Exam exam = new Exam("Primer Parcial PI");
        exam.enroll("Matias");
        exam.enroll("Matias");
        exam.enroll("Natalia");
        System.out.println("Enrolled Students "+ Arrays.toString(exam.getEnrolledStudents()));
        exam.unroll("Matias");
        System.out.println("Enrolled Students "+ Arrays.toString(exam.getEnrolledStudents()));
        System.out.println("-----------------------");
        UniqueExam uniqueExam = new UniqueExam("Primer Parcial de POO");
        uniqueExam.enroll("Matias");
        uniqueExam.enroll("Matias");
        uniqueExam.enroll("Natalia");
        System.out.println("Enrolled Students "+ Arrays.toString(uniqueExam.getEnrolledStudents()));
        uniqueExam.unroll("Matias");
        System.out.println("Enrolled Students "+ Arrays.toString(uniqueExam.getEnrolledStudents()));
        System.out.println("-----------------------");
        LimitedExam limitedExam = new LimitedExam("TPE POD",2);
        limitedExam.enroll("Matias");
        limitedExam.enroll("Matias");
        limitedExam.enroll("Natalia");
        limitedExam.enroll("Solange");
        limitedExam.enroll("Jose");
        limitedExam.enroll("Micaela");
        System.out.println("Enrolled Students "+ Arrays.toString(limitedExam.getEnrolledStudents()));
        System.out.println("Enrolled Students "+ Arrays.toString(limitedExam.getPendingStudents()));
        limitedExam.unroll("Matias");
        System.out.println("Enrolled Students "+ Arrays.toString(limitedExam.getEnrolledStudents()));
        System.out.println("Enrolled Students "+ Arrays.toString(limitedExam.getPendingStudents()));
        limitedExam.unroll("Jose");
        limitedExam.unroll("Natalia");
        System.out.println("Enrolled Students "+ Arrays.toString(limitedExam.getEnrolledStudents()));
        System.out.println("Enrolled Students "+ Arrays.toString(limitedExam.getPendingStudents()));


    }
}
