package com.bridgelabz;

public class Queue <T> {
    LinkedList<T> linkedList;

    public Queue() {
        this.linkedList = new LinkedList<>();
    }

    public void enqueu(T key) {
        linkedList.add(key);
    }
    public void print() {
        linkedList.print();
    }

    public boolean isEmpty(){
        return linkedList.size() == 0;
    }

    public T peek(){
        return linkedList.peek();
    }

    public T dequeue() {
        return linkedList.pop();
    }
}
