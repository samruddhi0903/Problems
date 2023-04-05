//Write a Java program to sort a given array list
package week2;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) { 
        ArrayList<Integer> list = new ArrayList<Integer>();   
        
        list.add(5);   
        list.add(9);   
        list.add(4);   
        list.add(8);   
        list.add(0);   
        list.add(3);   
        list.add(6);  
        list.add(69);  

        System.out.println("Before Sorting: "+ list);   
        
        Collections.sort(list);   
        
        System.out.println("After Sorting: "+ list);   
    }
}
