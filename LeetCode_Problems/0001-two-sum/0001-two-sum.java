class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap stores: number -> index
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if complement exists in map
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            
            // Store current number and index for future lookups
            map.put(nums[i], i);
        }
        
        // Should never reach here based on problem constraints
        return new int[]{};
    }
}