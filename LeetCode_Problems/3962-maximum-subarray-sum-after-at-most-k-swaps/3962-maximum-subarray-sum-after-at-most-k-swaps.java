class Solution {
    public long maxSum(int[] nums, int k) {

        int n = nums.length;
        int positiveCount = 0;
        long maxSum = 0;
        int max = Integer.MIN_VALUE;

        for(int x:nums){
            if(x > 0){
                positiveCount++;
                maxSum += x;
            }
            max = Math.max(max, x);
        }
        
        if(positiveCount < 2) return max;
        
        int count = 0;
        for(int i = 0; i < positiveCount - 1; i++){
            if(nums[i] > 0) count++;
            
            if(count + k >= positiveCount) return maxSum;
        }

        for(int i = positiveCount - 1, j = 0; i < n; i++, j++){
            if(nums[i] > 0)  count++;
            
            if(count + k >= positiveCount) return maxSum;

            if(nums[j] > 0) count--;
        }  

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long[][] topkSum = new long[n][n + 1];

        for(int i = 0; i < n; ++i){

            pq.clear();
            long sum = 0;

            for(int j = 0; j < i; ++j){
                int x = nums[j];
                if(x > 0){
                    sum += x;
                    pq.offer(x);
                }

                if(pq.size() > k) sum -= pq.poll();      
            }

            topkSum[i][n] = sum;
            for(int j = n -1; j >= i; --j){
                int x = nums[j];
                if(x > 0){
                    sum += x;
                    pq.offer(x);
                }

                if(pq.size() > k) sum -= pq.poll(); 
                
                topkSum[i][j] = sum;
            }
        }
        
        long ans = max;
        for(int i = 0; i < n; ++i){

            pq.clear();
            long sum = 0;

            for(int j = i; j < n; ++j){
                int x = nums[j];
                if(x < 0)
                    pq.offer(-x);
                else
                    sum += x;

                if(pq.size() > k) sum -= pq.poll(); 
                
                ans = Math.max(ans, sum + topkSum[i][j + 1]);
            }
        }

        return ans;         
    }
}