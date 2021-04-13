package com.linkedlist;

public class MyLinkedList {
    public INode head;
    public INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    /*@Description-Created a linked list
    *Added node in a Linked list
     */
    public void add(INode myNode) {
        if (this.tail == null) {
            this.tail = myNode;
        }
        if (this.head == null) {
            this.head = myNode;
        } else {
            INode tempNode = this.head;
            this.head = myNode;
            this.head.setNext(tempNode);
        }
    }

    /*@Description-Created a linked list in sequence
    *Added a node in the appending order
    * firstly added a 56
    * then  append 30 to the 56
    * finally append 30 to 70
    * Linked list sequence:56->30->70
     */
    public void append(INode myNode) {
        if (this.tail == null) {
            this.tail = myNode;
        }
        if (this.head == null) {
            this.head = myNode;
        } else {
                this.tail.setNext(myNode);
                this.tail = myNode;
            }
    }

    //In a linked list inserted the node between the two node
    public void insert(INode myNode, INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    //printed a nodes
    public void printMyNodes() {
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
                myNodes.append(tempNode.getKey());
                if (!tempNode.equals(tail)) myNodes.append("->");
                tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
}
