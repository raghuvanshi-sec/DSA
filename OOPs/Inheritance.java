public class Inheritance {
    public static void main(String args[]){
        Mammals dog = new Mammals();
        dog.legs = 4;
        dog.eat();
        dog.breathe();
        System.out.println(dog.legs);

    }
}


//Base Class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

//Derived Class
// class Fish extends Animal{
//     int fins;


//     void swim(){
//         System.out.println("swims in water");
//     }
// }

class Mammals extends Animal{
    int legs;
}

class Dog extends Mammals{
    String breed;
}
