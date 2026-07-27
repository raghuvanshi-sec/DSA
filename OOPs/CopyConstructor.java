public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Bruce Wayne";
        s1.roll = 456;
        s1.password = "I'm Batman!";

        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        s1.marks[3] = 70;

        Student s2 = new Student(s1); // copy
        s2.password = "Men are Brave!";
        s1.marks[2] = 100;

        System.out.println("s2 marks: ");
        for (int i = 0; i < 4; i++) {
            System.out.println(s2.marks[i]);
        }
    }

    static class Student {
        String name;
        int roll;
        String password;
        int marks[];

        // Default Constructor
        Student() {
            marks = new int[4];
        }
        
        // Copy Constructor
        Student(Student s1) {
            marks = new int[4];
            this.name = s1.name;
            this.roll = s1.roll;
            this.password = s1.password;
            this.marks = s1.marks;
        }

        Student(String name) {
            marks = new int[4];
            this.name = name;
        }

        Student(int roll) {
            marks = new int[4];
            this.roll = roll;
        }
    }
}
