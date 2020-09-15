package ar.itba.edu.PrimerParcial.P1;

import java.util.Arrays;

public class LimitedExam extends UniqueExam{
    String[] pending;
    private final int INITIAL_DIM = 2;
    int quotas;
    private int dimPending;

    public LimitedExam(String name, int quotas) {
        super(name);
        pending = new String[INITIAL_DIM];
        this.quotas=quotas;
    }

    @Override
    public void enroll(String student) {
        if (getEnrolledCount() < quotas){
        super.enroll(student);
        }else{
            if (pending.length == dimPending){
                resize();
            }
            pending[dimPending++]=student;
        }
    }

    @Override
    public void unroll(String student) {
        super.unroll(student);
        if (dimPending > 0){
            enroll(pending[0]);
            System.arraycopy(pending, 1,pending,0,dimPending);
            dimPending--;
        }
        unrollPending(student);
    }

    private void unrollPending(String student){
        for (int i = 0; i < dimPending; i++){
            if (pending[i].equals(student)){
                System.arraycopy(pending,i+1,pending,i,dimPending-1-i);
                dimPending--;
            }
        }
    }

    private void resize(){
        pending = Arrays.copyOf(pending,pending.length+INITIAL_DIM);
    }
    public String[] getPendingStudents(){
        return Arrays.copyOf(pending, dimPending);
    }
}
