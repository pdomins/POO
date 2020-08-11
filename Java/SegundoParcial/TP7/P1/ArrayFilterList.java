package ar.itba.edu.POO.SegundoParcial.TP7.P1;


import java.util.ArrayList;

public class ArrayFilterList<T> extends ArrayList<T>
        implements FilterList<T>{

    @Override
    public FilterList<T> criteria(Expression<T> exp) {
        FilterList<T> auxCol = new ArrayFilterList<>();
        for (T aux: this){
            if (exp.test(aux))
            auxCol.add(aux);
        }
        return auxCol;
    }
}
