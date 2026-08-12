class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            high=Math.max(piles[i],high);
        }
        int ans=Integer.MAX_VALUE;
        while(low<=high){
           int mid=low+(high-low)/2;
           long totalhours=0;
           for(int i=0;i<piles.length;i++){
            totalhours+=(piles[i]+mid-1)/mid;
           }
           if(totalhours<=h){
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