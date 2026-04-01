class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0;
        int r=0;
        int len=0;
        while(r<s.length()){
            if(!map.containsKey(s.charAt(r))){
                map.put(s.charAt(r),r);
                r++;
            }else{
                if(map.get(s.charAt(r))>=l){
                     l=map.get(s.charAt(r))+1;
                }
               
                map.put(s.charAt(r),r);
                r++;
            }
            int tempLength=(r-l);
            len=Math.max(len,tempLength);
        }

        return len;
    }
}
