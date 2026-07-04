class Solution {
    public int largestAltitude(int[] gain) {
        for(int i=1;i<gain.length;i++){
            gain[i]+=gain[i-1];
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<gain.length;i++){
            max=Math.max(gain[i],max);
        }
        if(max<0){
            return 0;
        }
        else{
        return max;
        }
    }
}