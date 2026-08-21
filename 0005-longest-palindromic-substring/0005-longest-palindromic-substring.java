class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String best="";
        for(int c=0;c<n;c++){
            int i=c, j=c;
            while(i>=0 && j<n && s.charAt(i)==s.charAt(j)){
                i--;
                j++;
            }
            String odd=s.substring(i+1,j);
            if(odd.length()>best.length()) best=odd;

            i=c; j=c+1;
            while(i>=0 && j<n && s.charAt(i)==s.charAt(j)){
                i--;
                j++;
            }
            String even=s.substring(i+1,j);
            if(even.length()>best.length()) best=even;
        }
        return best;
    }
}