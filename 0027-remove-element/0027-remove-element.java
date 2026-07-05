class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        int s=0;
        int f=0;
        while(f<nums.length){
            if(nums[f]==val){
                f++;
            }
            else if(nums[f]!=val){
                nums[s]=nums[f];
                count++;
                s++;
                f++;
            }
        }
        return count;
    }
}