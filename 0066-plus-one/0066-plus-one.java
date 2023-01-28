class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i = digits.length - 1; i >= 0; i--){
            int j = digits[i] + carry;
            if(j > 9){
                digits[i] = j % 10;
                carry = j / 10;
                continue;
            }
            digits[i] = j;
            carry = 0;
        }
        if(carry == 0){
            return digits;
        }
        int[] ans = new int[digits.length + 1];
        for(int i = 1; i < digits.length; i++){
            ans[i] = digits[i];
        }
        ans[0] = 1;
        return ans;
    }
}