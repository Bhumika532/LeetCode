class Solution {
    public String interpret(String command) {
        String res="";
        int a=0;
        for(int i=0;i<command.length();i++){
            char ch=command.charAt(i);
            if(ch=='G' || ch=='a' || ch=='l'){
                res+=ch;
                a=0;
            }
            else if(ch=='('){
                a=1;
            }
            else{
                if(a==1){
                    res+="o";
                }
                a=0;
            }
        }
        return res;
    }
}