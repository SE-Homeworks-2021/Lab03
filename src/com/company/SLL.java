package com.company;

public class SLL {
    // ----------------------- Node --------------------
    private class Node {
        private int element;
        private Node next;

        // constructor
        public Node(int data) {
            element = data;
            next = null;
        }

        // link a new node to this node
        public void link(Node newNode) {
            next = newNode;
        }

        // return next node
        public Node getNextNode() {
            return next;
        }

        // return element of this node
        public int getElement() {
            return element;
        }
    }
    // --------------------- End Node --------------------

    // SLL properties and methods
    private Node head = null;
    private Node tail = null;
    private int size = 0; // SLL's size

    public void addLast(int data) {
        // create new node
        Node newNode = new Node(data);
        if (size == 0) {
            head = newNode;
//            tail = newNode;
//            size++;
        }
        else {
            tail.link(newNode);
            //    tail = newNode;
            //    size++;

        }
        tail = newNode;
        size++;
    }

    public void addFirst(int data) {

        Node newNode = new Node(data);

        if (size == 0)
        {
            tail = newNode;
//            head = newNode;
//            size++;
        }

        else
        {
            newNode.link(head);
        }
        head=newNode;
        size++;



    }

    public void removeFirst() {

//        if(size == 0)
//        {
//
//        }

        if(size == 1)
        {
            head = null;
            tail = null;

        }

        else
        {
            head=head.getNextNode();
        }

        size--;

    }

    public void removeLast() {

        if(size == 1)
        {
            head = null;
            tail = null;
            size--;
        }

        else if(size > 1)
        {
            Node pointer = head;

            while (pointer.getNextNode() != tail)
            {
                pointer = pointer.getNextNode();
            }

            tail = pointer;
            tail.link(null);
            size--;
        }



    }

    public void print() {
        if (size == 0) {
            System.out.println("Empty linked list");
        } else {
            for (Node pointer = head; pointer != null; pointer = pointer.getNextNode()) {
                System.out.print(pointer.getElement() + "->");
            }
            System.out.println("null");
        }
    }

    public int getSize()
    {
        return size;

    }

    public boolean isEmpty()
    {
        if (size == 0)
        {
            return true;

        }

        else
        {
            return false;

        }

    }

    public int get(int index)
    {
        int value = -999;

        if (size > 0 && index < size)
        {
            Node pointer = head;

            for (int i = 0; i < index; i++)
            {
                pointer = pointer.getNextNode();
            }
        }

        else
        {
            System.out.println("Error, index is out of bound!");
        }
        return value;
    }

    void clear()
    {
        head = null;
        tail = null;
        size = 0;
    }
}
