class Solution {
    public int fib(int n) {
        if(n == 0 || n == 1){
            return n;
        }

        int Fibnm1 = fib(n-1);
        int Fibnm2 = fib(n-2);
        return Fibnm1+Fibnm2;
    }
}