package ar.itba.edu.TP5.P5;

public class AccessStack<E> extends ArrayStack<E> implements AccessNumber<E> {
    public int timesPop;

    public int getPush(){
        return timesPop+size;
    }
    public int getPop(){
        return timesPop;
    }

    @Override
    public E pop() {
        timesPop++;
        return super.pop();
    }
}
