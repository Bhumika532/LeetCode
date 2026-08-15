class Solution {
    public int maxDepth(String s) {
        int ans=0;
        int depth=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                depth++;
            }
            else if(ch==')'){
                depth--;
            }
            ans=Math.max(ans,depth);
        }
        return ans;
    }
}