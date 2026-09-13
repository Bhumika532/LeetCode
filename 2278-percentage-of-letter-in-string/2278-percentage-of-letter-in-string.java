class Solution {
    public int percentageLetter(String s, char letter) {
        int n=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==letter){
                n++;
            }
        }
        return n*100/s.length();
    }
}