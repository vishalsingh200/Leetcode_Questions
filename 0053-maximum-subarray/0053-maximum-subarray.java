class Solution {
    public int maxSubArray(int[] nums) {
        // int n = nums.length;
        // int max = Integer.MIN_VALUE;
        // for(int i = 0; i < n; i++){
        //     int sum = 0;
        //     for(int j = i; j < n; j++){
        //         sum = sum + nums[j];
        //         max = Math.max(max, sum);
        //     }
        // }
        // return max;
        int n = nums.length;
        int sum = 0; 
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            sum = sum + nums[i];
            
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}