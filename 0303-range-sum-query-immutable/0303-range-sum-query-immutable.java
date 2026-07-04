class NumArray {
    int[] prefix = new int[10000];

    public NumArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                nums[i] = nums[i];
                prefix[i] = nums[i];
            } else {
                nums[i] += nums[i - 1];
                prefix[i] = nums[i];
            }
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return prefix[right];
        } 
        else if(left == right){
            return prefix[right]-prefix[right-1];
        }
        else {
            return prefix[right] - prefix[left - 1];
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */