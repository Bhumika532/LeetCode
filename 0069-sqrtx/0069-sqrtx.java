class Solution {
    public int mySqrt(int x) {
        long low=0;
        long high=x;
        long ans=Long.MIN_VALUE;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(mid*mid>x){
                high=mid-1;
            }
            else{
                ans=Math.max(ans,mid);
                low=mid+1;
            }
        }
        return (int)ans;
    }
}