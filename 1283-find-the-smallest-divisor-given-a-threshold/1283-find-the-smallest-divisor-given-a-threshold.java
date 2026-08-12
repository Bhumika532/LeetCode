class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            high=Math.max(nums[i],high);
        }
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            long sum=0;
            for(int i=0;i<nums.length;i++){
                sum+=(nums[i]+mid-1)/mid;
            }
            if(sum<=threshold){
                ans=Math.min(ans,mid);
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}