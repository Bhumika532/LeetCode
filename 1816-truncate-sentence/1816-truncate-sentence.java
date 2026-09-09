class Solution {
    public String truncateSentence(String s, int k) {
        String word="";
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                word+=ch;
            }
            else{
                count++;
                if(count==k){
                    return word;
                }
                word+=ch;
            }
        }
        return word;
    }
}