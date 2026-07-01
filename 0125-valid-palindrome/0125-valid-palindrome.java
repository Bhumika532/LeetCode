class Solution {
    public boolean isPalindrome(String s) {
        if(s.charAt(0)==' ' && s.length()==1){
            return true;
        }
        if(s.length()==1){
            return true;
        }
        String low=s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<low.length();i++){
            char ch = low.charAt(i);
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