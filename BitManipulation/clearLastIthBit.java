package BitManipulation;

public class clearLastIthBit {
    public static int cleatLastIthBit(int i , int n){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static void main(String args[]){
        System.out.println(cleatLastIthBit(15,2));
    }
    
}
