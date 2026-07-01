public class StringBasics {
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        // char arr[] = {'a','b','c','d'};
        // String str = "abcd";
        // String str2 = new String("xyz");

        // // String in java is immutable


        // Scanner sc = new AScanner(System.in);
        // String name;
        // name= sc.next();
        // System.out.println(name);

        // String fullName ="Bruce Wayne";
        // System.out.println(fullName.length());


        //Concatination
        String firstName = "Clark";
        String lastName = "Kent";
        String fullName = firstName + " " + lastName;
        
        printLetters(fullName);
    }
}
