//	Write a program to convert String to enum.

package week1;

public class StringToEnum {

    public static void main(String[] args) {
        String day = "SUNDAY";

        Day dayEnum = Day.valueOf(day);    
        System.out.println(dayEnum);

    }
}
 
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
    THURSDAY, FRIDAY, SATURDAY
}
