class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int depth=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                depth++;
            }
            else{
                depth--;
            }
            if(ch=='(' && depth==1){
                continue;
            }
            else if(ch==')' && depth==0){
                continue;
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}