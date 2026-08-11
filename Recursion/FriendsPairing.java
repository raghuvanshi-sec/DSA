package Recursion;

public class FriendsPairing {
    public static int friendsPairing(int n){
        if(n == 1 || n == 2){
            return n;
        }

        //Single
        int fnm1 = friendsPairing(n-1);
        //pair
        int fnm2 = (n-1)*friendsPairing(n-2);

        return fnm1 + fnm2;
    }

    public static void main(String args[]){
        System.out.println(friendsPairing(3));
    }
    
}
