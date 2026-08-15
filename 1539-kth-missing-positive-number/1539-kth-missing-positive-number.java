class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = arr[mid] - (mid + 1);
            if (count < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if(high==-1){
            return k;
        }
        int gap=arr[high]-(high+1);
        int diff=k-gap;
        int ans=arr[high]+diff;
        return ans;
    }
}