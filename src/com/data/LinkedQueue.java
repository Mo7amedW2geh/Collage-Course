package com.data;

import com.data.interfaces.Queue;

public class LinkedQueue<E> implements Queue<E> {
    private SinglyLinkedList<E> queue = new SinglyLinkedList<>();
    public LinkedQueue(){ }

    public int size(){ return queue.size(); }
    public boolean isEmpty(){ return queue.isEmpty(); }
    public void enqueue(E element){ queue.addLast(element); }
    public E first(){ return queue.first(); }
    public E dequeue(){ return queue.removeFirst(); }
    public void traverse(){ queue.traverse(); }
}
