class Solution {
    public int firstUniqChar(String s) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int val=ch-'a';
            freq[val]++;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int val=ch-'a';
            if(freq[val]==1){
                return i;
            }
        }
        return -1;
    }
}