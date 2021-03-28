package DataStructures;

import java.util.Scanner;

/**
 * Question: Write a class that maintains the top ten scores for a game application using a singly linked list in ascending order. */

class LinkedList<E extends Comparable<E>> {

    // Node inner class to create Node objects that consists of linked list pointer and value
    class Node<E> {
        Node<E> next;
        E data;

        public Node(E obj) {
            data = obj;
            next = null;
        }
    }

    // last element of the linked list
    private Node<E> tail;

    // first element of the linked list
    private Node<E> head;

    // Temporary node
    Node temp;

    // initial size of linked list
    private int currentSize;

    // LinkedList constructor
    public LinkedList(){
        head = null;
        currentSize = 0;
    }

    // calculate size of linked list
    public int length(){
        return currentSize;
    }

    // adding elements to the front of the linked list
    public void addFirst(E obj){
        Node<E> node = new Node<E>(obj);
        node.next = head;
        head = node;
        currentSize++;
    }

    // remove the first element in the linked list
    public E removeFirst(){
        // empty linked list condition
        if(head == null){
            return null;
        }

        // One or more element in the linked list
        E tmp = head.data;
        if(head == tail){
            head = null;
            tail = null;
        }else{
            head = head.next;
        }
        currentSize--;
        return tmp;
    }

    // sort the elements in the linked list
    public void sort(){
        Node<E> current = head;
        Node<E> tempNode = null;
        E tempData;

        // empty data structure
        if(head == null){
            return;
        }// non-empty data structure
        else{
            while(current != null){
                tempNode = current.next;
                while(tempNode != null){
                    if((current.data).compareTo(tempNode.data) > 0){
                        tempData = current.data;
                        current.data = tempNode.data;
                        tempNode.data = tempData;
                    }
                    tempNode = tempNode.next;
                }
                current = current.next;
            }
        }
    }

    public void displayData(){
        Node<E> current = head;
        if(head == null){
            System.out.println("No elements in the list");
        }
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            System.out.println("Enter next score: ");
            int num = scanner.nextInt();
            linkedList.addFirst(num);
            linkedList.sort();
            if(linkedList.length() > 10){
                linkedList.removeFirst();
            }
        }
        linkedList.displayData();
    }
}
