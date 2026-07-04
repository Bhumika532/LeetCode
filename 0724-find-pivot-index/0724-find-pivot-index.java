class Solution {
    public int pivotIndex(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        int pivot = -1;
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if(i==0){
                if(nums[n-1]-nums[0]==0){
                    pivot=0;
                    break;
                }
            }
            else if (nums[i - 1] == (nums[n - 1] - nums[i])) {
                pivot = i;
                break;
            }
        }
        if (pivot == -1) {
            return -1;
        } else {
            return pivot;
        }
    }
}