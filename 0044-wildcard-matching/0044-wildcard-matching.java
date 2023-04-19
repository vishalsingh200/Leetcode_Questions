class Solution {
    public int solve(int j, String p,int i,String s,int dp[][])
    {
        if(i<0&&j<0)
            return 1;
        if(i<0)
        {
            for(int k=0;k<=j;k++)
                if(p.charAt(k)!='*')
                    return 0;
            return 1;
        }
        if(j<0)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        
        if(p.charAt(j)==s.charAt(i)||p.charAt(j)=='?')
            return dp[i][j]=solve(j-1,p,i-1,s,dp);
        int ans=0;
        if(p.charAt(j)=='*')
            return dp[i][j]=solve(j,p,i-1,s,dp)|solve(j-1,p,i,s,dp);
        return dp[i][j]=0;  
    }
    public boolean isMatch(String s, String p) {
        int n=p.length();
        int m=s.length();
        int dp[][]=new int[m][n];
        for(int ar[]:dp)
            Arrays.fill(ar,-1);
       return  solve(n-1,p,m-1,s,dp)==0?false:true;
    }
}