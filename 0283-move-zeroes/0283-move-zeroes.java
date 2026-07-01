class Solution {
    public void moveZeroes(int[] nums) {
        int j = -1;
        int n = nums.length;

        // Place all non-zero elements at the beginning
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[++j] = nums[i];
            }
        }

        // Fill the remaining positions with zeros
        while (j < n - 1) {
            nums[++j] = 0;
        }
    }
}