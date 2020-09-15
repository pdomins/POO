package ar.itba.edu.TP5.P5;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<E> implements Stack<E> {
    private static int INITIAL_DIM = 5;
    E[] Stack;
    int size;

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        Stack = ((E[]) new Object[INITIAL_DIM]);
    }

    @Override
    public void push(E elem) {
        if (size == Stack.length){
            resize();
        }
        Stack[size++]=elem;
    }
    @SuppressWarnings("unchecked")
    private void resize() {
        E[] aux = ((E[]) new Object[INITIAL_DIM+size]);
        System.arraycopy(Stack,0,aux,0,size);
        Stack = aux;
    }

    @Override
    public E pop() {
        if (Stack.length == 0)
            throw new EmptyStackException();
        return Stack[--size]; //dado que el primer elemento esta en la posicion 0 del array
    }

    @Override
    public E peek() {
        return Stack[size-1];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder stack = new StringBuilder("[");
        for (int i = 0; i < Stack.length; i++){
            stack.append(Stack[i]).append(",");
        }
        stack.setCharAt(stack.length()-1, ']');
        return stack.toString();
    }
}
