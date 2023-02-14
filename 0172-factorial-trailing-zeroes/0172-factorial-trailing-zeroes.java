class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0){    //n = 5                           n = 3                  n=
            n /= 5;       //n=5/5=1                         n=3/5=0
            count += n;   //count = count + 1= 0+1=1        count=0+0=0
        }
        return count;     //count = 1                       count = 0
    }
}