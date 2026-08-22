public class PowerFun3 {
    
    public static int power3(int a, int n){
        if(n == 0){
            return 1;
        }

        int halfPower = power3(a,n/2);
        int halfPowerSq = halfPower * halfPower;

        if(n%2 != 0){
            return a* halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[]args){
        System.out.println("The value of a to the power of n is: " + power3(2,5));
    }
}
