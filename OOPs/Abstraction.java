public class Abstraction {

    public static void main(String args[]) {
        Mustang myHorse = new Mustang();
        // Animal -> Horse -> Mustang
    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor called");
        color = "brown";
    }

    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called");
    }

    void changeColor() {
        color = "white";
    }

    void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}
