class Solution {
   public int[] searchRange(int[] nums, int target) {
        int[] arr=new int[2];
        arr[0]=findFirst(nums,target);
        arr[1]=findLast(nums,target);
        return arr;
    }

    public int findFirst(int[] arr,int target){
        int Start=0;
        int End=arr.length-1;

        int index=-1;

        while(Start<=End) {

            int mid=Start+(End-Start)/2;
            
            if(arr[mid]<target) {
                Start=mid+1;
            }   
            else if(arr[mid]>target) {
                End=mid-1;
            }
            else {
                index=mid;
                End=mid-1;
            }
        }
        return index;
        
    }
     public int findLast(int[] arr,int target){
        int Start=0;
        int End=arr.length-1;

        int index=-1;

        while(Start<=End) {

        int mid=Start+(End-Start)/2;

        if(arr[mid]<target) {
            Start=mid+1;
        }   
        else if(arr[mid]>target) {
            End=mid-1;
        } 
        else {
            index=mid;
            Start=mid+1;
        }
    }
    return index; 
     }
}