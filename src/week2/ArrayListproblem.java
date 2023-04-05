//Program to add, retrieve & remove element from ArrayList

package week2;

import java.util.ArrayList;
import java.util.Arrays;

class ArrayListproblem{
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        System.out.println(a.size());
        a.add(3);
        a.add(5);                    // add elements
        a.add(4);
        System.out.println(a);
        a.addAll(Arrays.asList(0,1,2));      // adding another arraylist to existing
        System.out.println(a.size());             // getting size of array list
        System.out.println(a);
        System.out.println(a.get(2));       //retriving an element
        a.remove(0);                        //removing an elemrnt
        System.out.println(a);

        ArrayList<Student> students = new ArrayList<Student>();
        System.out.println(students.size());
        students.add(new Student("max", 1));
        students.add(new Student("tom", 2));                    // add elements
        students.add(new Student("ash", 3));
        System.out.println(students.size());
        System.out.println(students.get(2).name);       
        students.addAll(Arrays.asList(new Student("brock", 4),new Student("gary", 5),new Student("jack", 6)));      // adding another arraylist to existing
        System.out.println(students.size());             // getting size of array list
        for (Student student : students) {
            System.out.print(student.name+ ", " );
        }
        students.remove(0);                       //removing an element
        System.out.println();
        for (Student student : students) {
            System.out.print(student.name+ ", " );
        }
        System.out.println();
        Student s = new Student("ash", 3);
        System.out.println(students.get(1).equals(s));

    }
}

class Student{

    String name;
    int id;
    
    Student(String n, int r)
    {
        this.name = n;
        this.id = r;
    }

    @Override
    public boolean equals(Object obj)
    {
    if(this == obj)
            return true;

        if(obj == null || obj.getClass()!= this.getClass())
            return false;
          
        Student s = (Student) obj;
          
        return (s.name.equals(this.name)  && s.id == this.id);
    }
}