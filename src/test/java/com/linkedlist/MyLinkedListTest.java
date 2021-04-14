package com.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MyLinkedListTest {
    /*@Description-Created a linked list by adding 30 and 56 to 70
    *First created  node with data 70
    * Then 30 is added to 70
    * Then finally 56 is added to 30
    * created a sequence of 56->30->70
     */
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myThirdNode) &&
                         myLinkedList.head.getNext().equals(mySecondNode) &&
                         myLinkedList.tail.equals(myFirstNode);
        Assertions.assertTrue(result);
    }

    /*@Description-Created a linked list in sequence
     *Added a node in the appending order
     * firstly added a 56
     * then  append 30 to the 56
     * finally append 30 to 70
     * Linked list sequence:56->30->70
     */
    @Test
    public void given3NumbersWhenAppendingShouldBeAddedToLast() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                         myLinkedList.head.getNext().equals(mySecondNode) &&
                         myLinkedList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }

    //In a linked list inserted the node between the two node
    @Test
    public void given3NumbersWhenInsertingSecondInBetweenShouldPassedLinkedListResult() {
            MyNode<Integer> myFirstNode = new MyNode<>(56);
            MyNode<Integer> mySecondNode = new MyNode<>(30);
            MyNode<Integer> myThirdNode = new MyNode<>(70);
            MyLinkedList myLinkedList = new MyLinkedList();
            myLinkedList.add(myFirstNode);
            myLinkedList.append(myThirdNode);
            myLinkedList.insert(myFirstNode, mySecondNode);
            myLinkedList.printMyNodes();
            boolean result = myLinkedList.head.equals(myFirstNode) &&
                             myLinkedList.head.getNext().equals(mySecondNode) &&
                             myLinkedList.tail.equals(myThirdNode);
            Assertions.assertTrue(result);
    }

    @Test
    public void given3NumbersWhenDeleteFirstElementInLinkedListShouldPassLinkedList() {
            MyNode<Integer> myFirstNode = new MyNode<>(56);
            MyNode<Integer> mySecondNode = new MyNode<>(30);
            MyNode<Integer> myThirdNode = new MyNode<>(70);
            MyLinkedList myLinkedList = new MyLinkedList();
            myLinkedList.add(myFirstNode);
            myLinkedList.append(myThirdNode);
            myLinkedList.insert(myFirstNode, mySecondNode);
            myLinkedList.pop();
            myLinkedList.printMyNodes();
            boolean result = myLinkedList.head.equals(mySecondNode) &&
                             myLinkedList.tail.equals(myThirdNode);
            Assertions.assertTrue(result);
    }

    /*Delete the last element from linked list
    *The sequence of linked list is 56->30
     */
    @Test
    public void given3NumbersWhenDeleteLastElementInLinkedListShouldPassLinkedList() {
            MyNode<Integer> myFirstNode = new MyNode<>(56);
            MyNode<Integer> mySecondNode = new MyNode<>(30);
            MyNode<Integer> myThirdNode = new MyNode<>(70);
            MyLinkedList myLinkedList = new MyLinkedList();
            myLinkedList.add(myFirstNode);
            myLinkedList.append(myThirdNode);
            myLinkedList.insert(myFirstNode, mySecondNode);
            myLinkedList.popLast();
            myLinkedList.printMyNodes();
            boolean result = myLinkedList.head.equals(myFirstNode) &&
                             myLinkedList.tail.equals(mySecondNode);
            Assertions.assertTrue(result);
    }

    /*Created a linked list of sequence : 56->30->70
    * In that linked list search a element or node 
     */
    @Test
    public void givenElementWhenSearchShouldPassTest() {
            MyNode<Integer> myFirstNode = new MyNode<>(56);
            MyNode<Integer> mySecondNode = new MyNode<>(30);
            MyNode<Integer> myThirdNode = new MyNode<>(70);
            MyLinkedList myLinkedList = new MyLinkedList();
            myLinkedList.add(myFirstNode);
            myLinkedList.append(myThirdNode);
            myLinkedList.insert(myFirstNode, mySecondNode);
            myLinkedList.printMyNodes();
            boolean result = myLinkedList.searchElement(myThirdNode);
            Assertions.assertTrue(result);
    }

    /*Create a Linked list in sequence of 56->30->70
    *Search the node with in key value 30
    * Then insert the node after 30 i.e 30->40
    * The final sequence of linked list :56->30->40->70
     */
    @Test
    public void givenSearchFirstElementAndThenInsertTheElementInLinkedListShouldPassTest() {
            MyNode<Integer> myFirstNode = new MyNode<>(56);
            MyNode<Integer> mySecondNode = new MyNode<>(30);
            MyNode<Integer> myThirdNode = new MyNode<>(70);
            MyNode<Integer> myFourthNode = new MyNode<>(40);
            MyLinkedList myLinkedList = new MyLinkedList();
            myLinkedList.add(myFirstNode);
            myLinkedList.append(myThirdNode);
            myLinkedList.insert(myFirstNode, mySecondNode);
            myLinkedList.printMyNodes();
            boolean result = myLinkedList.searchAndInsertElement(mySecondNode, myFourthNode);
            myLinkedList.printMyNodes();
            Assertions.assertTrue(result);
    }

    /*Create a Linked list in sequence of 56->30->70
     *Search the node with in key value 30
     * Then insert the node after 30 i.e 30->40
     * The final sequence of linked list :56->30->40->70
     * Tend search a node element 40 and delete from linked list
     * The size of linked list will show
     * The sequence of linked list is : 56->30->70
     */
    @Test
    public void givenElementDeleteElementInLInkedListAndShowSizeAndPassTest() {
            MyNode<Integer> myFirstNode = new MyNode<>(56);
            MyNode<Integer> mySecondNode = new MyNode<>(30);
            MyNode<Integer> myThirdNode = new MyNode<>(70);
            MyNode<Integer> myFourthNode = new MyNode<>(40);
            MyLinkedList myLinkedList = new MyLinkedList();
            myLinkedList.add(myFirstNode);
            myLinkedList.append(myThirdNode);
            myLinkedList.insert(myFirstNode, mySecondNode);
            myLinkedList.insert(mySecondNode, myFourthNode);
            myLinkedList.printMyNodes();
            myLinkedList.searchAndDelete(mySecondNode);
            myLinkedList.printMyNodes();
            Integer result = myLinkedList.size();
            Assertions.assertEquals(3, result);
    }
}
