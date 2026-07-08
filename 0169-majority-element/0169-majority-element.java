class Solution {
    public int majorityElement(int[] nums) {
        int num=nums[0];
        int win=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==num){
                win++;
            }
            else{
                win--;
                if(win==0){
                    num=nums[i];
                    win=1;
                }
            }
        }
        return num;
    }
}