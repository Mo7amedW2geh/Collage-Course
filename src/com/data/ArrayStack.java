package com.data;

import com.data.interfaces.Stack;

public class ArrayStack<E> implements Stack<E> {
    public static final int Max_Size = 1000;
    private E[] stack;
    private int top = -1;

    public ArrayStack() { this(Max_Size); }
    public ArrayStack(int capacity) {
        stack = (E[]) new Object[capacity];
    }

    public int size() { return top + 1; }
    public boolean isEmpty() { return top == -1; }

    public void push(E element) throws IllegalStateException{
        if(size() == stack.length) throw new IllegalStateException("Stack is full");
        stack[++top] = element;
    }

    public E top(){
        if(isEmpty()) return null;
        return stack[top];
    }

    public E pop(){
        if(isEmpty()) return null;
        E temp = stack[top];
        stack[top--] = null;
        return temp;
    }

    public void traverse(){
        for(int i = top; i >= 0; i--){
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public void removeAll(){
        if(isEmpty()) return;
        stack[top--] = null;
        removeAll();
    }

    public void transfer(ArrayStack<E> stack){
        while(!stack.isEmpty()) this.push(stack.pop());
    }

//    public void transfer(ArrayStack<E> from, ArrayStack<E> to){
//        while(!from.isEmpty()) to.push(from.pop());
//    }
}
