class Solution {
    public int[] getConcatenation(int[] nums) {
        if (nums.length < 1){
            return nums;
        }
        int result[] = new int[nums.length * 2];
        for (int i = 0; i < nums.length * 2; i++){
            if (nums.length > i){
                result[i] = nums[i];
            }
            else{
                result[i] = nums[i - nums.length];
            }
        }
        return result;
    }
}