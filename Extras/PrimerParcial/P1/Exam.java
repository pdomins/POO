package ar.itba.edu.PrimerParcial.P1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exam {
    private String name;

    private String[] enrolled;
    private int dim;
    private static final int INITAL_DIM = 5;

    public Exam(String name) {
        this.name = name;
        this.enrolled = new String[INITAL_DIM];
    }
    public void enroll(String student){
        if (dim == enrolled.length){
            resize();
        }
        enrolled[dim++]=student;
        System.out.println("Enrolled " + student);
    }
    public void unroll (String student){
        for (int i = 0; i < dim; i++ ){
            if (enrolled[i].equals(student)){
                System.arraycopy(enrolled, i+1,enrolled, i, dim-1-i);
                dim--;
                System.out.println("Unrolled "+student);
            }
        }
    }
    public boolean isEnrolled(String student){
        for (int i = 0; i < dim;i++){
            if (enrolled[i].equals(student)){
                return true;
            }
        }
        return false;
    }
    public int getEnrolledCount(){
        return dim;
    }
    public String[] getEnrolledStudents(){
        return Arrays.copyOf(enrolled, dim);
    }
    private void resize(){
        enrolled = Arrays.copyOf(enrolled, enrolled.length + INITAL_DIM);
    }
}
