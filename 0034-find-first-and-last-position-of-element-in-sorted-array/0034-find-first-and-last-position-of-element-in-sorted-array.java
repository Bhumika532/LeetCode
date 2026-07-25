class Solution {
    public int[] searchRange(int[] nums, int target) {
       int[] arr=new int[2];
       int low=0;
       int high=nums.length-1;
       int ans=-1;
       while(low<=high){
        int mid=low+(high-low)/2;
        if(nums[mid]>target){
            high=mid-1;
        }
        else if(nums[mid]<target){
            low=mid+1;
        }
        else if(nums[mid]==target){
            ans=mid;
            high=mid-1;
        }
       }
       low=0;
       high=nums.length-1;
       int ans2=-1;
        while(low<=high){
        int mid=low+(high-low)/2;
        if(nums[mid]>target){
            high=mid-1;
        }
        else if(nums[mid]<target){
            low=mid+1;
        }
        else if(nums[mid]==target){
            ans2=mid;
            low=mid+1;
        }
       }
    for(int i=0;i<arr.length;i++){
        if(i==0){
            arr[i]=ans;
        }
        else if(i==1){
            arr[i]=ans2;
        }
    }
    return arr;
    }
}