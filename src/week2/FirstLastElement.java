//Write a Java program to get the first and last occurrence of the specified elements in a linked list

package week2;

import java.util.LinkedList;

public class FirstLastElement {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<String>();
          l_list.add("Red");
          l_list.add("Green");
          l_list.add("Black");
          l_list.add("Pink");
          l_list.add("orange");
      
        System.out.println("Original linked list:" + l_list);  
    
        Object first_element = l_list.getFirst();
        System.out.println("First Element is: "+first_element);
    
        Object last_element = l_list.getLast();
        System.out.println("Last Element is: "+last_element);


        LinkedList<Person> Person_list = new LinkedList<Person>();
        Person_list.add(new Person("Ash", 1));
        Person_list.add(new Person("Max", 2));
        Person_list.add(new Person("Brock", 3));
        Person_list.add(new Person("Natsu", 5));
        Person_list.add(new Person("Jellal", 8));
        Person_list.add(new Person("Erza", 9));

        System.out.println("First Person is: "+ Person_list.getFirst().name);
    
        System.out.println("Last Person is: "+ Person_list.getLast().name);

        System.out.println(Person_list.get(3).equals(new Person("Natsu", 5)));
        System.out.println(Person_list.get(2).equals(new Person("Natsu", 10)));
    }
}

class Person{

    String name;
    int id;
    
    Person(String n, int r)
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
          
        Person s = (Person) obj;
          
        return (s.name.equals(this.name)  && s.id == this.id);
    }
}
