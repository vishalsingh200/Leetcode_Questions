class Solution {
    public void sortColors(int[] nums) {
         int n = nums.length;
        int low = 0, mid = 0, high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                swaps(nums,low,mid);
                low++;
                mid++;
            }
            else if (nums[mid]==1){
                    mid++;
            }
            else{
                    swaps(nums,mid,high);
                    high--;
            }
                
            
        }
        
    }
    private void swaps(int [] nums, int left, int right){
        int temp = nums [left];
        nums [left] = nums[right];
        nums[right] = temp;
    }
}