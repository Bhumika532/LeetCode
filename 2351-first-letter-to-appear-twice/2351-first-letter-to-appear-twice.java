class Solution {
    public char repeatedCharacter(String s) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int val=ch-'a';
            freq[val]++;
             if(freq[val]>=2){
                return (char)(val+'a');
            }
        }
        return ' ';
    }
}