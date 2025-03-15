package model;

import java.io.InvalidClassException;
import java.util.Arrays;

public class Queue <T> {
    private T[] elements;

    private int size;
    private int length;
    private int front;
    private int rear;

    @SuppressWarnings("unchecked")
    public Queue(){
        this.size = 1;
        this.length = 0;
        this.front = 0;
        this.rear = 0;
        this.elements = (T[]) new Object[size];
    }

    @SuppressWarnings("unchecked")
    public Queue(int maxSize){
        this.size = maxSize;
        this.length = 0;
        this.front = 0;
        this.rear = 0;
        this.elements = (T[]) new Object[size];
    }

    public void enqueue(T value){
        if(isFull())
            reallocateElements(size * 2);

        this.elements[rear] = value;
        rear = (rear + 1) % size;
        length++;

    }

    public T dequeue(){
        if(isEmpty())
            throw new RuntimeException("Queue is empty.");

        T dequeuedElement = elements[front];
        elements[front] = null;
        front = (front + 1) % size;
        length--;

        return dequeuedElement;
    }

    public T at(int index){
        if (index < 0 || index >= length)
            throw new IndexOutOfBoundsException("Index out of range.");

        return this.elements[index];
    }

    private boolean isEmpty(){
        return length == 0;
    }

    private boolean isFull(){
        return length == size;
    }

    private void reallocateElements(int newSize){
        elements = Arrays.copyOf(elements, newSize);
        size = newSize;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                ", length=" + length +
                ", front=" + front +
                ", rear=" + rear +
                '}';
    }
}
