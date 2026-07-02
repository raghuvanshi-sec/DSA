class Solution {
    public int minimumSwaps(int[] nums) {
        int n = nums.length;
        int zeroCount = 0;

        // Count total zeros
        for (int x : nums) {
            if (x == 0) {
                zeroCount++;
            }
        }

        int swaps = 0;

        // Count misplaced zeros in the prefix
        for (int i = 0; i < n - zeroCount; i++) {
            if (nums[i] == 0) {
                swaps++;
            }
        }

        return swaps;
    }
}