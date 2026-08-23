class Solution {
    public int beautySum(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int[] freq=new int[26];
            for(int j=i;j<s.length();j++){
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                int beauty=0;
                char ch=s.charAt(j);
                int val=ch-'a';
                freq[val]++;
                for(int k=0;k<26;k++){
                    max=Math.max(max,freq[k]);
                    if(freq[k]>0){
                        min=Math.min(min,freq[k]);
                    }
                }
                beauty=max-min;
                ans+=beauty;
            }
        }
        return ans;
    }
}