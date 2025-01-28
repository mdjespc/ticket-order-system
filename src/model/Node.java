package model;

import java.util.Objects;

public class Node <T> implements Cloneable{
    private long id;
    private T value;

    public Node() {
        this.id = this.hashCode();
        this.value = null;
    }

    public Node(T value) {
        this.id = this.hashCode();
        this.value = value;
    }

    public long getId() {
        return id;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Node<?> node = (Node<?>) obj;
        return Objects.equals(value, node.value);
    }

    @Override
    public String toString() {
        return this.value.toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
