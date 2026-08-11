package Recursion;

public class Tilling {
    public static int TillingProblem(int n){ //2xn floor size

        //base case
        if(n == 0 || n == 1){
            return 1;
        }


        //work
        //vertical choice
        int fnm1 = TillingProblem(n-1);
        //horizontal choice
        int fnm2 = TillingProblem(n-2);

        int totways = fnm1+fnm2;
        return totways;

    }

    public static void main(String args[]){
        System.out.println(TillingProblem(4));
    }

}
