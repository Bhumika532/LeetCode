class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<weights.length;i++){
            low=Math.max(weights[i],low);
            high+=weights[i];
        }
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            int d=1;
            int sum=0;
            for(int i=0;i<weights.length;i++){
                sum+=weights[i];
                if(sum>mid){
                    d++;
                    sum=weights[i];
                }
            }
            if(d<=days){
                ans=Math.min(mid,ans);
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}