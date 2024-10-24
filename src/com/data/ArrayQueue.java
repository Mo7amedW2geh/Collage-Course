package com.data;

import com.data.interfaces.Queue;

public class ArrayQueue<E> implements Queue<E> {
    public static final int Max_Size = 1000;
    private E[] queue;
    private int first = 0;
    private int size = 0;

    public ArrayQueue(){ this(Max_Size); }
    public ArrayQueue(int capacity){
        queue = (E[]) new Object[capacity];
    }

    public int size(){ return size; }
    public boolean isEmpty(){ return size == 0; }

    public void enqueue(E element) throws IllegalStateException{
        if(size() == queue.length) throw new IllegalStateException("Queue is full");
        int rear = (first + size) % queue.length;
        queue[rear] = element;
        size++;
    }

    public E first(){
        if(isEmpty()) return null;
        return queue[first];
    }

    public E dequeue(){
        if(isEmpty()) return null;
        E temp = queue[first];
        queue[first] = null;
        first = (first + 1) % queue.length;
        size--;
        return temp;
    }

    public void traverse(){
        for(int i = first; i != first + size; i++){
            System.out.print(queue[i % queue.length] + " ");
        }
        System.out.println();
    }

}
