class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        
        backtrack(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int start, int[] nums, List<Integer> current, List<List<Integer>> ans){
        // Add Current subset

        ans.add(new ArrayList<>(current));

        for(int i = start; i < nums.length; i++){

            //choice
            current.add(nums[i]);

            //Explore
            backtrack(i+1, nums,current,ans);

            //undo
            current.remove(current.size()-1);
        }
    }
}