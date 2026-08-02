package Recursion;

public class Fibbonacci {
    public static int Fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int Fibnm1 = Fibonacci(n-1);
        int Fibnm2 = Fibonacci(n-2); 
        return Fibnm1 + Fibnm2;
    }

    public static void main(String args[]){
        int n = 20;
        System.out.print(Fibonacci(n));
    }
    
}
