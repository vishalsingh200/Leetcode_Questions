//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}



// } Driver Code Ends


class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
        int[] ans = new int[r - l + 1];
         // Your code here
         int left = l;
         int right = m + 1;
         int k = 0;
         while(left <= m && right <= r){
             if(arr[left] <= arr[right]){
                 ans[k] = arr[left];
                 left++;
             }
             else{
                 ans[k] = arr[right];
                 right++;
             }
             k++;
         }
         while(left <= m){
             ans[k] = arr[left];
             left++;
             k++;
         }
         while(right <= r){
             ans[k] = arr[right];
             right++;
             k++;
         }
         
         for(int i = 0; i < ans.length; i++){
             arr[l + i] = ans[i];
         }
         
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(l == r){
            return;
        }
        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }
}
