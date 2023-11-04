//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n =sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution g = new Solution();
			System.out.println(g.thirdLargest(arr,n));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    int thirdLargest(int arr[], int n)
    {
        if(n < 3){
            return -1;
        }
	    int largest = arr[0];
	    for(int i = 0; i < n; i++){
	        if(arr[i] >= largest){
	            largest = arr[i];
	        }
	    }
	    int secondL = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] >= secondL && arr[i] != largest){
                secondL = arr[i];
            }
        }
        int thirdL = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] >= thirdL && arr[i] != largest && arr[i] != secondL){
                thirdL = arr[i];
            }
        }
        return thirdL;
    }
}
