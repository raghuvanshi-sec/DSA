package OOPs;
public class HybridInheritance {


    public static void main(String args[]) {
        Tuna tuna = new Tuna();
        tuna.eat();
        tuna.swim();
        tuna.breathe();

        Shark shark = new Shark();
        shark.eat();
        shark.swim();
        shark.breathe();

        Peacock peacock = new Peacock();
        peacock.eat();
        peacock.fly();
        peacock.dance();

        Dog dog = new Dog();
        dog.eat();
        dog.walk();
        dog.bark();

        Monkey monkey = new Monkey();
        monkey.eat();
        monkey.walk();
        monkey.climb();

        Human human = new Human();
        human.eat();
        human.walk();
        human.breed();
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }
}

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims in water");
    };
}

class Tuna extends Fish {
    void breathe() {
        System.out.println("breathes with gills");
    }
}

class Shark extends Fish {
    void breathe() {
        System.out.println("breathes with nostrils");
    }
}

class Birds extends Animal {
    void fly() {
        System.out.println("fly");
    }
}

class Peacock extends Birds {
    void dance() {
        System.out.println("dances");
    }
}

class Mammals extends Animal {
    int legs;

    void walk() {
        System.out.println("walks");
    }
}

class Dog extends Mammals {
    void bark() {
        System.out.println("barks");
    }
}

class Monkey extends Mammals {
    void climb() {
        System.out.println("climbs");
    }
}

class Human extends Mammals {
    void breed() {
        System.out.println("breeds");
    }
}
