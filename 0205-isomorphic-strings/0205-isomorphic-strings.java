class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mapst=new HashMap<>();
        HashMap<Character, Character> mapts=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char st=s.charAt(i);
            char ts=t.charAt(i);
            if(mapst.containsKey(st)){
                char ch1=mapst.get(st);
                if(ch1!=ts){
                    return false;
                }
            }
            if(mapts.containsKey(ts)){
                char ch2=mapts.get(ts);
                if(ch2!=st){
                    return false;
                }
            }
            else{
                mapst.put(st,ts);
                mapts.put(ts,st);
            }
        }
        return true;
    }
}