package model;

import java.io.InvalidClassException;

public class Queue <T> {
    private Object[] elements;

    private int maxSize;
    private int size;
    private int length;
    private int front;
    private int rear;

    public Queue(){
        this.size = 1;
        this.length = 0;
        this.front = 0;
        this.rear = 0;
        this.elements = new Object[size];
    }

    public Queue(int maxSize){
        this.maxSize = maxSize;
        this.size = this.maxSize;
        this.length = 0;
        this.front = 0;
        this.rear = 0;
        this.elements = new Object[size];
    }

    public void enqueue(T value){
        if(isFull())
            throw new RuntimeException("Queue is full.");

        this.elements[length++] = value;
        rear = length - 1;

        if (isFull())
            reallocateElements(size + 1);

    }

    public T dequeue(){
        if(isEmpty())
            throw new RuntimeException("Queue is empty.");

        T tmpvar = (T) elements[front];
        elements[front++] = null;
        //TODO  shift remaining elements one index to the left

        return tmpvar;
    }

    public T at(int index){
        return (T) this.elements[index];

    }

    private boolean isEmpty(){
        return (length == 0 || elements[front] == null);
    }

    private boolean isFull(){
        return (length == size || rear == size - 1);
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
