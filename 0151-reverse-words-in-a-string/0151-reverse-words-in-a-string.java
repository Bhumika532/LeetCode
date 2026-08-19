class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        String word="";
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (Character.isDigit(ch))){
                word=ch+word;
            }
            else{
                if(word==""){
                    continue;
                }
                else{
                    if(sb.length()>0){
                        sb.append(" ");
                    }
                    sb.append(word);
                    word="";
                }
            }
        }
        if(sb.length()>0 && word!=""){
            sb.append(" ");
        }
        sb.append(word);
        return sb.toString();
    }
}