package Backracking;

public class FindPermtn {
    public static void findPermtn(String str, String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //recursive step
        //TC = (n*n!)
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            //"abcde" => "ab" + "de" = "abde"
            // "abcde" => "c" + "de" + "ab" = "cdeab"
            String newstr = str.substring(0, i) + str.substring(i+1);
            findPermtn(newstr, ans+curr);
        }
    }
    
    public static void main(String args[]){
        String str = "abc";
        findPermtn(str, " ");
    }
}
