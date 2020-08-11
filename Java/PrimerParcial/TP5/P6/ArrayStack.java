package ar.itba.edu.POO.PrimerParcial.TP5.P6;


import java.util.EmptyStackException;

public class ArrayStack<E> implements Stack<E> {

    private E[] elements;
    private static final int INITIAL_DIM = 10;
    protected int dim;

    @SuppressWarnings("unchecked")
    public ArrayStack(){
        elements = ((E[]) new Object[INITIAL_DIM]);
    }

    @Override
    public void push(E elem) {
        if (dim == elements.length)
            resize();
        elements[dim++] = elem;


    }

    @SuppressWarnings("unchecked")
    private void resize() {
        E[] aux = (E[]) new Object[INITIAL_DIM+elements.length];
        System.arraycopy(elements,0,aux,0,dim);
        elements=aux;
    }

    @Override
    public E pop(){
        if (isEmpty())
            throw new EmptyStackException();
        E aux = elements[dim-1];
        dim--;
        return aux;

    }

    @Override
    public E peek() {
        if (isEmpty())
            throw new EmptyStackException();
        return elements[dim-1];

    }

    @Override
    public boolean isEmpty() {
        return dim == 0;
    }

    @Override
    public String toString() {
        StringBuilder auxString = new StringBuilder();
        auxString.append("[");
        for (int i = dim-1 ; i >= 0; i--){
            auxString.append(elements[i]).append(",");
        }

        return auxString.substring(0,auxString.length()-1) + "]";
    }
}
