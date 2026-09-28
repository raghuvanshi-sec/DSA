package OOPs;

public class Satic {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.schoolName = "JPS";

        Student s2 = new Student();
        System.out.println(s2.schoolName);
    }

    static class Student {
        String name;
        int rollNo;

        static String schoolName;

        void setName(String name){
            this.name = name;
        }

        String getName(){
            return this.name;
        }
    }
}

