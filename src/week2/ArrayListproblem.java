package week2;

import java.util.ArrayList;
import java.util.Arrays;

class ArrayListproblem{
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        System.out.println(a.size());
        a.add(3);
        a.add(5);
        a.add(4);
        a.addAll(Arrays.asList(0,1,2));
        System.out.println(a.size());
        System.out.println(a);
        a.remove(0);
        

    }
}