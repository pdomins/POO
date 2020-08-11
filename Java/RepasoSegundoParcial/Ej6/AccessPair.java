package ar.itba.edu.POO.RepasoSegundoParcial.Ej6;

public class AccessPair {
    Integer put, get;

    public AccessPair(Integer put, Integer get) {
        this.put = put;
        this.get = get;
    }

    public Integer getPut() {
        return put;
    }

    public Integer getGet() {
        return get;
    }
    public void reducePut(){
        put--;
    }
    public void reduceGet(){
        get--;
    }
}
