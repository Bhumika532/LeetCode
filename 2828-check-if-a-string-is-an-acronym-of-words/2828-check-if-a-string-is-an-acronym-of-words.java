class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String match="";
        for(int i=0;i<words.size();i++){
            String word=words.get(i);
            char ch=word.charAt(0);
            match+=ch;
        }
        if(match.equals(s)){
            return true;
        }
        return false;
    }
}