class Solution {
    public int missingNumber(int[] nums) {
        int arrsum=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            arrsum+=nums[i];
        }
        int orgsum=n*(n+1)/2;
        return orgsum-arrsum;
    }
}