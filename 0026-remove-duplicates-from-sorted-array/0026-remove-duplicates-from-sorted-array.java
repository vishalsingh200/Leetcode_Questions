class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        int k = 0;
        while(index < nums.length && k < nums.length){
            if(nums[k] != nums[index]){
                nums[++k] = nums[index];
            }
            index++;
        }
    
        return k+1; 
    }
}