class Solution {
    public String removeTrailingZeros(String num) {
        for(int i=num.length()-1;i>=0;i--){
            char ch=num.charAt(i);
            if(ch!='0'){
                return num.substring(0,i+1);
            }
        }
        return num;
    }
}