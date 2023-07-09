package com.snapolitano.exercises.generics;

import java.util.Objects;

public class Pair2<K, V> {
    K first;
    V second;

    public Pair2(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public void setFirst(K first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Pair2<?, ?> pair2 = (Pair2<?, ?>) o;
        return Objects.equals(first, pair2.first) && Objects.equals(second, pair2.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}
