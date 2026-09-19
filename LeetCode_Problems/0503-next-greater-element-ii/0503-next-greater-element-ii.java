class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        // Initially no greater element found
        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }

        int[] stack = new int[n];
        int top = -1;

        // Traverse array twice
        for (int i = 0; i < 2 * n; i++) {

            int index = i % n;

            while (top >= 0 && nums[stack[top]] < nums[index]) {
                result[stack[top--]] = nums[index];
            }

            // Only push during first traversal
            if (i < n) {
                stack[++top] = index;
            }
        }

        return result;
    }
}