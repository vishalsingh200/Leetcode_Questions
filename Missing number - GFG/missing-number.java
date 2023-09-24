//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n+5];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n-1; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Compute obj = new Compute();
            System.out.println(obj.missingNumber(a, n));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public static int missingNumber(int arr[], int n)
    {
    //     int i = 0;
    //     while (i < n) {
    //         int correctpos = arr[i] - 1;
    //         if (arr[i] < n && arr[i] != arr[correctpos]) {
    //               swap(arr, i, correctpos);
    //         }
    //         else {
    //             i++;
    //         }
    //     }
    //       for (int index = 0; index < arr.length; index++) {
    //         if (arr[index] != index + 1) {
    //             return index + 1;
    //         }
    //     }
    //     return arr.length;
    // }
    // public static void swap(int[] arr, int i, int j){
    //         int temp = arr[i];
    //         arr[i] = arr[j];
    //         arr[j] = temp;
    
    for(int i = 1; i <= n; i++){
        int temp = 0;
        for(int j = 0; j < n - 1; j++){
            if(arr[j] == i){
                temp = 1;
                break;
            }
        }
        if(temp == 0){
        return i;
    }
    }
    return -1;
    
    }
}