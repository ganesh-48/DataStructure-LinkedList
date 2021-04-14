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

    public INode pop() {
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    /*pop the last element in the linked list
     *The linked list of sequence 56->30
     */
    public INode popLast() {
        INode tempNode = head;
        while (!tempNode.getNext().equals((tail))) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
    }

    /*Search a element in the linked list
     *find the node 30 in the linked list
     */
    public boolean searchElement(INode serchNode) {
        INode tempNode = this.head;
        while (tempNode != null) {
            if (tempNode.getKey().equals(serchNode.getKey())) {
                return true;
            }
            tempNode = tempNode.getNext();
        }
        return false;
    }

    public Integer size() {
        Integer size = 0;
        INode tempNode = this.head;
        while (tempNode != null) {
            size++;
            tempNode = tempNode.getNext();
        }
        return size;
    }

    /*Search the element in linked list of enter element after which node
     *After search insert a node into the linked list
     */
    public boolean searchAndInsertElement(INode searchNode, INode insertNode) {
        INode tempNode = this.head;
        while (tempNode != null) {
            if (tempNode.getKey().equals(searchNode.getKey())) {
                insert(tempNode, insertNode);
                return true;
            }
            tempNode = tempNode.getNext();
        }
        return false;
    }

    public void searchAndDelete(INode searchNode) {
        if (searchElement(searchNode)) {
            System.out.println("Linked List size before deleting element : " + size());
            INode nextNode = searchNode.getNext();
            INode tempNode = nextNode.getNext();
            if (nextNode != tail) {
                searchNode.setNext(tempNode);
                System.out.println("Linked List size after deleting element : " + size());
            }
        }
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


