class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int i=0;
        int j=n-1;
        int[] arr=new int[2];
        int k=0;
        while(i<j){
            if(numbers[i]+numbers[j]==target){
                arr[k]=i+1;
                arr[k+1]=j+1;
                break;
            }
            else if(numbers[i]+numbers[j]<target){
                i++;
            }
            else{
                j--;
            }
        }
        return arr;
    }
}