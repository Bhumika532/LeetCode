class Solution {
    public int myAtoi(String s) {
        double ans=0;
        boolean flag=false;
        boolean found=false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                int digit=ch-'0';
                ans=ans*10+digit;
                found=true;
            }
            else if(ch==' ' && found==false){
                continue;
            }
            else if(ch=='-' && found==false){
                flag=true;
                found=true;
            }
            else if(ch=='+' && found==false){
                ans=ans;
                found=true;
            }
            else{
                break;
            }
        }
        if(flag){
            return (int)-ans;
        }
        if(ans>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(ans<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int)ans;
    }
}