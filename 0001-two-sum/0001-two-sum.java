class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i = 0; i<nums.length; i++){
        //     for (int j = i+1 ; j<nums.length; j++){
        //         if(nums[j]==target-nums[i]){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return null;
        int [] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if(!map.containsKey(target - nums[i])){
                map.put(nums[i],i);
            }
            else{
                ans[1] = i;
                ans[0] = map.get(target - nums[i]);
                return ans;
            }
    }
    return ans;
    }
}