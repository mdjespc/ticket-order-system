package model;

public class Queue <T> {
    private Object[] elements;

    private int maxSize;
    private int size;
    private int length;

    public Queue(){
        this.size = 1;
        this.length = 0;
        this.elements = new Object[size];
    }

    public void enqueue(T value){
        this.elements[length++] = value;

        if (length == size)
            reallocateElements(size + 1);

    }

    public T at(int index){
        return (T) this.elements[index];
    }

    private void reallocateElements(int size){
        if (size <= this.size) return;

        this.elements = copyOfArray(size);
        this.size = this.elements.length;
    }

    private Object[] copyOfArray(int size){
        if (size <= this.size) return null;

        var copy = new Object[size];

        for (int i = 0; i < elements.length; i++){
            copy[i] = elements[i];
        }

        return copy;
    }

}
