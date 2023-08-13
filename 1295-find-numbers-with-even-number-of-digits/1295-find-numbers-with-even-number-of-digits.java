class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int digit = digits(num);
        return digit % 2 == 0;
    }
    static int digits(int num){
        int count = 0;
        while(num > 0){
            num = num / 10;
            count++;
        }
        return count;
    }
}