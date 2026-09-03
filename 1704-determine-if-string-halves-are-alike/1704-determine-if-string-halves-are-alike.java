class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int i=0;
        int j=s.length()-1;
        int count1=0;
        int count2=0;
        while(i<j){
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);
            if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u'){
                count1++;
            }
            if(ch2=='a' || ch2=='e' || ch2=='i' || ch2=='o' || ch2=='u'){
                count2++;
            }
            i++;
            j--;
        }
        if(count1==count2){
            return true;
        }
        else{
            return false;
        }
    }
}