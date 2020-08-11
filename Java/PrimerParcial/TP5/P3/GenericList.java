package ar.itba.edu.POO.PrimerParcial.TP5.P3;

public class GenericList<T> implements LinearList<T> {
    private GenericNode<T> first;
    private GenericNode<T> last;
    private GenericNode<T> aux;
    private int dim;

    public GenericList() {
    }

    @Override
    public void add(T obj) {
        GenericNode<T> newGenericNode = new GenericNode<>(obj, null);
        if (size() == 0){
            this.first= newGenericNode;
            this.aux= newGenericNode;

        }
        else{
            last.setTail(newGenericNode);
        }
        last = newGenericNode;
        dim++;

    }

    @Override
    public GenericNode<T> get(int i) {
        this.aux= this.first;
        for (int z = 0; z < i ; z ++){
                this.aux = this.aux.getTail();
        }
        return this.aux;
    }

    @Override
    public void set(int i, T obj) {
        this.aux= this.first;
        for (int z = 0; z < i ; z ++){
            this.aux = this.aux.getTail();
        }
        this.aux.setHead(obj);
    }

    @Override
    public void remove(int i) {
        this.aux= this.first;
        for (int z = 0; z < i-1 ; z ++){
            this.aux = this.aux.getTail();
        }
        this.aux.setTail((this.aux.getTail()).getTail());
        dim --;
    }

    @Override
    public int indexOf(T obj) {
        this.aux= this.first;
        for (int counter = 0; counter < dim; counter++){
            if (this.aux.getHead().equals(obj)){
                return counter;
            }
            this.aux = this.aux.getTail();
        }
        return -1;
    }

    @Override
    public int size() {
        return dim;
    }
}
