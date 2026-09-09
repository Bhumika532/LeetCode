class Solution {
    public int arraySign(int[] nums) {
        double sol=1;
        for(int i=0;i<nums.length;i++){
            sol*=nums[i];
        }
        if(sol<0){
            return -1;
        }
        else if(sol>0){
            return 1;
        }
        else{
            return 0;
        }
    }
}