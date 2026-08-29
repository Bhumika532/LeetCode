class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char[] arr=s.toCharArray();
        while(i<j){
            char ch1=arr[i];
            char ch2=arr[j];
            if("aeiouAEIOU".indexOf(ch1)!=-1 && "aeiouAEIOU".indexOf(ch2)!=-1){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            else if("aeiouAEIOU".indexOf(ch1)!=-1){
                j--;
            }
            else{
                i++;
            }
        }
        return new String(arr);
    }
}