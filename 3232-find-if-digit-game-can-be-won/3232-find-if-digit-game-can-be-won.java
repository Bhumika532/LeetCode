class Solution {
    public boolean canAliceWin(int[] nums) {
        int sing=0;
        int doub=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>9){
                doub+=nums[i];
            }
            else{
                sing+=nums[i];
            }
        }
        if(sing==doub){
            return false;
        }
        return true;
    }
}