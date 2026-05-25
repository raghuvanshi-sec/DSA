package Arrays;

public class maxSuubarraySum3 {
    public static void kadanes(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            currSum += numbers[i];
            if (currSum < numbers[i]) { // better handling when all negative
                currSum = numbers[i];
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("max Sum: " + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(numbers);
    }

}