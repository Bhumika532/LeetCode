class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int count=0;
        for(int c=0;c<n;c++){
            int i=c, j=c;
            while(i>=0 && j<n && s.charAt(i)==s.charAt(j)){
                i--;
                j++;
                count++;
            }
            i=c; j=c+1;
            while(i>=0 && j<n && s.charAt(i)==s.charAt(j)){
                i--;
                j++;
                count++;
            }
        }
        return count;
    }
}