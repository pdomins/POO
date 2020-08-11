package ar.itba.edu.POO.PrimerParcial.P1;

import java.util.Arrays;

public class LimitedExam extends UniqueExam {

    private int maxExam;
    private int INITIAL_LENGHT = 5;
    String[] pendingAl;
    int pendingDim;

    public LimitedExam(String name, int maxExam) {
        super(name);
        this.maxExam = maxExam;
        pendingAl = new String[INITIAL_LENGHT];
    }

    @Override
    public void enroll(String student) {
        if (this.getEnrolledCount() < maxExam) {
            super.enroll(student);
        }else{
            if (pendingDim == pendingAl.length){
                resize();
            }
            pendingAl[pendingDim++]=student;
        }
    }
    private void resize(){
        pendingAl= Arrays.copyOf(pendingAl,pendingAl.length +INITIAL_LENGHT);

    }

    @Override
    public void unroll(String student) {
        super.unroll(student);
        if (pendingDim > 0){
            for (int i = 0 ; i < pendingDim;i++){
                if (pendingAl[i].equals(student)){
                    System.arraycopy(pendingAl,i+1,pendingAl,i,pendingDim-1-i);
                    pendingDim--;
                }
            }
            enroll(pendingAl[0]);
            System.arraycopy(pendingAl,1,pendingAl,0,--pendingDim);
        }
    }

    public String[] getPendingStudents(){
        return Arrays.copyOf(pendingAl,pendingDim);
    }
}
