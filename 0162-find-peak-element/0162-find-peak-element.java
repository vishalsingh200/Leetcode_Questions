class Solution {
    public int findPeakElement(int[] nums) {
        //Brute Force
//         int i ;
//         for( i = 0; i < nums.length -1 && nums[i] < nums[i+1]; i++ ){
            
//         }
//         return i;
        
        
        int start = 0;
        int end = nums.length - 1;
        
        while(start < end){
            int mid = start + (end - start) / 2;
            
            if(nums[mid] > nums[mid + 1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return end;
    }
}