package com.data.interfaces;

public interface Queue<E> {
    public int size();
    public boolean isEmpty();
    public void enqueue(E element);
    public E first();
    public E dequeue();
    public void traverse();
}
