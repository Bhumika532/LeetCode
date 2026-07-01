class Solution {
    public boolean isPalindrome(String s) {
        if(s.charAt(0)==' ' && s.length()==1){
            return true;
        }
        if(s.length()==1){
            return true;
        }
        s=s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || ch>='0' && ch<='9'){
                sb.append(ch);
            }
        }
        if(sb.length()==1){
            return true;
        }
        int i=0;
        int j=sb.length()-1;
        while(i<j){
           if(sb.charAt(i)!=sb.charAt(j)){
            return false;
           } 
           i++;
           j--;
        }
        return true;
    }
}