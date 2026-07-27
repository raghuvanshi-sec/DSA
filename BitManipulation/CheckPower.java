package BitManipulation;

public class CheckPower {
    public static boolean IsPowerOf2(int n){
        return (n & (n-1)) == 0;
    }
    
}

class check {
    public static void main(String args[]){
        System.out.println(CheckPower.IsPowerOf2(4));
    }
}