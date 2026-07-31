public class Inheritance {
    public static void main(String args[]) {
        Mammals dog = new Mammals();
        dog.walk();
        dog.eat();
        dog.breathe();

        Fish fish = new Fish();
        fish.swim();
        fish.eat();
        fish.breathe();

        Bird bird = new Bird();
        bird.fly();
        bird.eat();
        bird.breathe();
    }
}

// Base Class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}

class Mammals extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("flies");
    }
}

// Derived Class
// class Fish extends Animal{
// int fins;

// void swim(){
// System.out.println("swims in water");
// }
// }

// class Mammals extends Animal{
// void walk(){
// System.out.println("walks");
// }
// }

// class Dog extends Mammals{
// String breed;
// }
