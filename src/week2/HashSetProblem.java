//Write a Java program to compare two hash set

package week2;

import java.util.HashSet;
import java.util.Set;

public class HashSetProblem {
    public static void main(String[] args) {
        Set<Integer> NumberList1 = new HashSet<>();

        NumberList1.add(100);
        NumberList1.add(99);
        NumberList1.add(98);
        NumberList1.add(97);
        NumberList1.add(96);

        System.out.println(" Numbeer List 1 : " + NumberList1);

        Set<Integer> NumberList2 = new HashSet<>();

        NumberList2.add(96);
        NumberList2.add(97);
        NumberList2.add(98);
        NumberList2.add(99);
        NumberList2.add(100);

        System.out.println(" Number List 2 : " + NumberList2);

        boolean anyNumberList1MatchesWithNumList2 = NumberList1.stream().anyMatch(marks -> NumberList2.contains(marks));

        boolean noNumberList1MatchesWithNumList2 = NumberList1.stream().noneMatch(marks -> NumberList2.contains(marks));

        boolean allNumberList1MatchesWithNumList2 = NumberList1.stream().allMatch(marks -> NumberList2.contains(marks));

        boolean isEquals = NumberList1.equals(NumberList2);

        System.out.println(anyNumberList1MatchesWithNumList2);

        System.out.println(noNumberList1MatchesWithNumList2);

        System.out.println(allNumberList1MatchesWithNumList2);

        System.out.println(isEquals);

    
    }
}
