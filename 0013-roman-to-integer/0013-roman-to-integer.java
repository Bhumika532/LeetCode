class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int num=0;
        for(int i=0;i<s.length()-1;i++){
            int c1=map.get(s.charAt(i));
            int c2=map.get(s.charAt(i+1));
            if(c1>=c2){
                num+=c1;
            }
            else{
                num-=c1;
            }
        }
        num+=map.get(s.charAt(s.length()-1));
        return num;
    }
}