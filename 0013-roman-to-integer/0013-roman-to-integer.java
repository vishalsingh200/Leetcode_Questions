class Solution {
    int value(char c){
        if (c=='I'){
            return 1;
        }
        if (c=='V'){
            return 5;
        }
        if  (c=='X'){
            return 10;
        }
        if (c=='L'){
            return 50;
        }
        if (c=='C'){
            return 100;
        }
        if (c=='D'){
            return 500;
        }
        if (c=='M'){
            return 1000;
        }
        return -1;
    }
    public int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++){
            int sum1 = value(s.charAt(i));
            if (i+1 < s.length()){
                int sum2 = value(s.charAt(i+1));
                if (sum1 >= sum2){
                    sum = sum + sum1;
                }
                else{
                    sum = sum -sum1;
                }
            }
            else{
                sum = sum + sum1;
            }
        }
        return sum;
    }
}