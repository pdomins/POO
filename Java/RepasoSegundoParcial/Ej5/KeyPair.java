package ar.itba.edu.POO.RepasoSegundoParcial.Ej5;

import java.util.Objects;

public class KeyPair<K1, K2> {
    K1 firstKey;
    K2 secondKey;

    public KeyPair(K1 firstKey, K2 secondKey) {
        this.firstKey = firstKey;
        this.secondKey = secondKey;
    }

    public K1 getFirstKey() {
        return firstKey;
    }
    public K2 getSecondKey() {
        return secondKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof KeyPair)) return false;
        KeyPair<?, ?> keyPair = (KeyPair<?, ?>) o;
        return Objects.equals(firstKey, keyPair.firstKey) &&
                Objects.equals(secondKey, keyPair.secondKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstKey, secondKey);
    }
}
