// Write a program to accept two numbers as command line arguments and print the addition of those numbers.
package week1;

public class CommantLineArgument {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a + b;
        System.out.println("Sum is " + sum);
    }
}
