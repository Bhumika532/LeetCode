class Solution {
    public int lengthOfLastWord(String s) {
        String word="";
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                word+=ch;
            }
            else{
                if(word!=""){
                    return word.length();
                }
            }
        }
        return word.length();
    }
}