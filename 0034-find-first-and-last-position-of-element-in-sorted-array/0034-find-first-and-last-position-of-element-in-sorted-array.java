class Solution{
    public int[] searchRange(int[] nums, int target){
        int[] ans = {-1, -1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        
        ans[0] = start;
        ans[1] = end;
        
        return ans;
    }
    static int search(int[] nums, int target, boolean indexFound){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        
        while(end >= start){
            int mid = start + (end - start) / 2;
            
            if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else {
                ans = mid;
                if(indexFound){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}


//Brute force

// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int start = -1;
//         int end = -1;
        
//         for(int i = 0; i < nums.length; i++){
//             if(target == nums[i]){
//                 if(start == -1){
//                     start = i;
//                 }
//                 end = i;
//             }
//         }
//         return new int[]{start, end};
//     }
// }