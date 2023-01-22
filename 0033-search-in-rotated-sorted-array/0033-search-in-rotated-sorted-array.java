class Solution {
    public int search(int[] nums, int target) {
        if(nums[nums.length-1]<target && nums[0]>target)
            return -1;
        if(nums[nums.length-1]<target){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==target)
                    return i;
            }
        }
        else{
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]==target)
                    return i;
            }
        }
        return -1;
    }
}