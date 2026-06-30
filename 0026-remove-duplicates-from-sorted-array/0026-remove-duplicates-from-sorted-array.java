class Solution {
    public int removeDuplicates(int[] nums) {
        int slow=0;
        int fast=1;
        int count=0;
        while(fast<nums.length){
            if(nums[slow]==nums[fast]){
                fast++;
            }
            else{
                nums[slow+1]=nums[fast];
                slow++;
                fast++;
            }
             count=slow+1;
        }
        if(nums.length==1){
            return 1;
        }
        else{
            return count;
        }
    }
}