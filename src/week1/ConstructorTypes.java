package week1;

public class ConstructorTypes {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Swift Dzier");
        Car car3 = new Car("Suzuki", 300, "Honda");

        car1.display();
        car2.display();
        car3.display();
    }
}

class Car {
    String name;
    int hp;
    String brand;
    Car()
    {
        System.out.println("Default Constructor");
    }

    Car(String name){
        this.name = name;
    }

    Car(String name, int hp, String brand)
    {
        this.name = name;
        this.hp = hp;
        this.brand = brand; 
    }

    void display()
    {
        System.out.println("Name : " + name + ", Hp : " + hp + ", Brand : " + brand);
    }
}
