/* 
* Program:     LinkedListStack.java
* Written by:  Richard Boyd
* Description: A stack implemented with a linked list
* Challenges:  
* Time Spent:  15 min
*                   Revision History
* Date:                   By:               Action:
* ---------------------------------------------------
* 1/5/2016              RHB                 Created
* 
*/
package Chapter01;

public class LinkedListStack<Item> {
    private Node first;
    private int N;
    
    private class Node{
        Item item;
        Node next;
    }
    
    public boolean isEmpty(){
        return first == null;
    }
    
    public int size(){
        return N;
    }
    
    public void push(Item item){
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }
    
    public Item pop(){
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }
}
