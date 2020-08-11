package ar.itba.edu.POO.PrimerParcial.TP4.P12;

public class LinearListImp implements LinearList{
    private Node first;
    private Node last;
    private Node aux;
    private int dim;

    public LinearListImp() {
    }

    @Override
    public void add(Object obj) {
        Node newNode = new Node(obj, null);
        if (size() == 0){
            this.first= newNode;
            this.aux= newNode;

        }
        else{
            last.setTail(newNode);
        }
        last = newNode;
        dim++;

    }

    @Override
    public Object get(int i) {
        this.aux= this.first;
        for (int z = 0; z < i ; z ++){
                this.aux = this.aux.getTail();
        }
        return this.aux;
    }

    @Override
    public void set(int i, Object obj) {
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
    public int indexOf(Object obj) {
        this.aux= this.first;
        int match = -1;
        for (int counter = 0; counter < dim && match==-1 ; counter++){
            if (this.aux.getHead().equals(obj)){
                match = counter;
            }
            this.aux = this.aux.getTail();
        }
        return match;
    }

    @Override
    public int size() {
        return dim;
    }
}
