package OOPs;

public class ClassesAndObjects {
    public static void main(String args[]) {
        Pen pen1 = new Pen();
        pen1.setColor("Blue");
        pen1.setTip(5);
        System.out.println(pen1.color);
        System.out.println(pen1.tip);

        Pen pen2 = new Pen();
        pen2.setColor("Black");
        pen2.setTip(5);
        System.out.println(pen2.color);
        System.out.println(pen2.tip);

        Student student1 = new Student();
        student1.setName("Satyajeet");
        student1.setAge(21);
        System.out.println(student1.name);
        System.out.println(student1.age);

        Student student2 = new Student();
        student2.setName("Ayushi");
        student2.setAge(20);
        System.out.println(student2.name);
        System.out.println(student2.age);
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;

    void setName(String newName) {
        name = newName;
    }

    void setAge(int newAge) {
        age = newAge;
    }
}
