package com.data;

import com.data.interfaces.Stack;

public class LinkedStack<E> implements Stack<E> {

    private SinglyLinkedList<E> stack = new SinglyLinkedList<>();

    public LinkedStack(){ }
    public int size(){ return stack.size(); }
    public boolean isEmpty(){ return stack.isEmpty(); }
    public void push(E element){ stack.addFirst(element); }
    public E top(){ return stack.first(); }
    public E pop(){ return stack.removeFirst(); }
    public void traverse(){ stack.traverse(); }
    public void removeAll(){
        if (isEmpty()) return;
        stack.removeFirst();
        removeAll();
    }
    public void transfer(LinkedStack<E> stack){
        while(!stack.isEmpty()) this.push(stack.pop());
    }

}
