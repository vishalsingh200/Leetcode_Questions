class Solution {
    public int commonFactors(int a, int b) {
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        
        int common = 0;
        for(int i = 1; i <= min; i++){
            if(min % i == 0 && max % i == 0){
                common++;
            }
        }
        return common;
    }
}