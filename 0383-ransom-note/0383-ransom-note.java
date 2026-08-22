class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<ransomNote.length();i++){
            char ch1=ransomNote.charAt(i);
            int val1=ch1-'a';
            freq1[val1]++;
        }
        for(int i=0;i<magazine.length();i++){
            char ch2=magazine.charAt(i);
            int val2=ch2-'a';
            freq2[val2]++;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(freq2[i]>=freq1[i]){
                count+=freq1[i];
            }
        }
        if(count==ransomNote.length()){
            return true;
        }
        else{
            return false;
        }
    }
}