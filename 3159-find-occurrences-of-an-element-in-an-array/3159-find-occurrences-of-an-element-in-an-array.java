class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        //Store indexes where x occur
        ArrayList<Integer> position = new ArrayList<>();

        for(int i = 0; i<nums.length; i++){
            if(nums[i] == x){
                position.add(i);
            }
            
        }

        //Answer queries
        int[] answer = new int[queries.length];

        for(int i = 0; i < queries.length; i++){
            int occurrence = queries[i];

            if(occurrence <= position.size()){
                answer[i] = position.get(occurrence - 1);
            }else{
                answer[i] = -1;
            }
        }

        return answer;
    }
}