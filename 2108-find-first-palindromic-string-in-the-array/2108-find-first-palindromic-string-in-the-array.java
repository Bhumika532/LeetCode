class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            int l=0;
            int r=words[i].length()-1;
            boolean ispalin=true;
            while(l<r){
                char ch1=words[i].charAt(l);
                char ch2=words[i].charAt(r);
                if(ch1==ch2){
                    l++;
                    r--;
                }
                else{
                    ispalin=false;
                    break;
                }
            }
            if(ispalin){
                return words[i];
            }
        }
        return "";
    }
}