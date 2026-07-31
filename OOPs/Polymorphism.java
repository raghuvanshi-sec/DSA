public class Polymorphism {

    public static void main(String args[]) {
        Animal animal = new Animal();
        animal.eat();

        Deer deer = new Deer();
        deer.eat();

        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(1, 2));
        // System.out.println(calc.sum(1, 2, 3));
        // System.out.println(calc.sum(1.5f, 2.5f));
    }

}

class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer extends Animal {
    @Override
    void eat() {
        System.out.println("Deer eats grass");
    }
}

// class Calculator {
// int sum(int a, int b) {
// return a + b;
// }

// int sum(int a, int b, int c) {
// return a + b + c;
// }

// float sum(float a, float b) {
// return a + b;
// }
// }
