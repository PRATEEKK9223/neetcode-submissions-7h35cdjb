class Solution {
    public boolean isAnagram(String s, String t) {
        int[] result=new int[26];

        for(int i=0;i<s.length();i++){
            result[s.charAt(i)-'a']+=1;
        }
        
        for(int i=0;i<t.length();i++){
            result[t.charAt(i)-'a']-=1;
        }

        for(int ele:result){
            if(ele!=0){
                return false;
            }
        }
        return true;
    }
}
