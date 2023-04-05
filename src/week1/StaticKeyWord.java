package week1;

public class StaticKeyWord {
    public static void main(String[] args) throws Exception {
        CarName car1 = new CarName("Honda");
        //calling static method
        CarName.displayHp();
        //calling object car1
        car1.getCar();
        //calling static method
        CarName.displayHp();
    }
}

class CarName {
    String name;
    
    static int hp = 200;                  //hp is static variable

    CarName(String name){
        this.name = name;
    }

    public void getCar(){
        System.out.println("Car Name : "+name);
        hp = 300;
        System.out.println("Car hp : "+hp);
    }

    static void displayHp()               //static method
    { 
      System.out.println(hp); 
    }
    
}
