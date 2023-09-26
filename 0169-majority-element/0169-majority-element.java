class Solution {
    public int majorityElement(int[] nums) {
//         int match = nums[0];
//         int count = 0;
//         for(int i = 1; i < nums.length - 1; i++){
//             if(nums[i] == match){
//                 count++;
//             }
//             else{
//                 count--;
//             }
//             if(count == 0){
//                 match = nums[i];
                
//             }
//         }
//         return match;
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > nums.length / 2){
                return nums[i];
            }
        }
        return -1;
    }
}