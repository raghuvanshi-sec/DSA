class Solution {
    public int nextGreaterElement(int n) {

        char[] digits = String.valueOf(n).toCharArray();

        // Step 1: Find pivot
        int i = digits.length - 2;

        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        // No greater permutation exists
        if (i < 0) {
            return -1;
        }

        // Step 2: Find the smallest digit greater than pivot
        int j = digits.length - 1;

        while (digits[j] <= digits[i]) {
            j--;
        }

        // Swap pivot and successor
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;

        // Step 3: Reverse the suffix
        int left = i + 1;
        int right = digits.length - 1;

        while (left < right) {
            temp = digits[left];
            digits[left] = digits[right];
            digits[right] = temp;

            left++;
            right--;
        }

        // Convert back to integer
        long result = Long.parseLong(new String(digits));

        if (result > Integer.MAX_VALUE) {
            return -1;
        }

        return (int) result;
    }
}