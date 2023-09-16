//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int t=sc.nextInt();
		while(t-->0)
		{
		    //taking dimensions of the matrix
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    Solution ob = new Solution();
		    //calling method NumberOfPath()
		    System.out.println(ob.NumberOfPath(a,b));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find total number of unique paths.
    public static int NumberOfPath(int a, int b) 
    {
        //Your code here
        int[][] count = new int[a][b];
        
        for(int i = 0; i < a; i++){
            count[i][0] = 1;
        }
        for (int j = 0; j < b; j++){
            count[0][j] = 1;
        }
        for(int i = 1; i < a; i++){
            for(int j = 1; j < b; j++){
                count[i][j] = count[i - 1][j] + count[i][j - 1];
            }
        }
        
        return count[a - 1][b - 1];
    }
}