class Solution {
    public int[] searchRange(int[] nums, int target) {
        //Brute force
        int start = -1;
        int end = -1;
        
        for(int i = 0; i < nums.length; i++){
            if(target == nums[i]){
                if(start == -1){
                    start = i;
                }
                end = i;
            }
        }
        return new int[]{start, end};
    }
}