package com.data;

public class SinglyLinkedList<E> {

    private static class Node<E> {
        private E element;
        private Node<E> next;
        public Node(E element, Node<E> next){
            this.element = element;
            this.next = next;
        }
        public E getElement() { return element; }
        public Node<E> getNext() { return next; }
        public void setNext(Node<E> next) { this.next = next; }
    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size;
    public SinglyLinkedList() {}

    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }

    public E first(){
        if(isEmpty()) return null;
        return head.getElement();
    }

    public E last(){
        if(isEmpty()) return null;
        return tail.getElement();
    }

    public void addFirst(E element){
        head = new Node<>(element, head);
        if (isEmpty()) tail = head;
        size++;
    }

    public void addLast(E element){
        Node<E> newest = new Node<>(element, null);
        if (isEmpty()) head = newest;
        else tail.setNext(newest);
        tail = newest;
        size++;
    }

    public E removeFirst(){
        if(isEmpty()) return null;
        E temp = head.getElement();
        head = head.getNext();
        size--;
        if(isEmpty()) tail = null;
        return temp;
    }

    public void traverse(){
        Node<E> current = head;
        while(current != null){
            System.out.print(current.getElement() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public int getCount(){
        if(isEmpty()) return 0;
        int count = 0;
        Node<E> current = head;
        while(current != null){
            current = current.getNext();
            count++;
        }
        return count;
    }
    public E getSecondFromLast(){
        if(isEmpty() || head.getNext() == null) return null;
        Node<E> current = head;
        while(true) {
            if (current.getNext().getNext() == null) {
                return current.getElement();
            }
            current = current.getNext();
        }
    }

    @Override
    public SinglyLinkedList<E> clone() {
        SinglyLinkedList<E> clone = new SinglyLinkedList<>();
        if(head == null) return clone;

        Node<E> current = head;
        while(current != null){
            clone.addLast(current.getElement());
            current = current.getNext();
        }

        return clone;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        SinglyLinkedList<E> other = (SinglyLinkedList<E>) obj;

        Node<E> current1 = head;
        Node<E> current2 = other.head;

        while(current1 != null && current2 != null){
            if(!current1.getElement().equals(current2.getElement())) return false;

            current1 = current1.getNext();
            current2 = current2.getNext();
        }

        return current1 == null && current2 == null;
    }
}
