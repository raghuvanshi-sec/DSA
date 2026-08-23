class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        backtrack(0, nums , new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int start, int[] nums, List<Integer>current, List<List<Integer>> ans){
        ans.add(new ArrayList<>(current));

        for(int i = start; i<nums.length; i++){
            // skip duplicate at the same level
            if(i > start && nums[i] == nums[i-1]){
                continue;
            }

            //choice
            current.add(nums[i]);

            //Explore
            backtrack(i+1, nums, current, ans);

            //undo
            current.remove(current.size() - 1);
        }

    }
}