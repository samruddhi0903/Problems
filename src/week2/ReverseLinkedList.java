//Write a Java program to iterate a linked list in reverse order.

package week2;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        
        linkedList.add("one");
        linkedList.add("two");
        linkedList.add("three");
        linkedList.add("four");
        linkedList.add("five");
  
        Iterator<String> iterator = linkedList.descendingIterator();
  
        while (iterator.hasNext()) 
        {
            System.out.println(iterator.next());
        }
    }
}
