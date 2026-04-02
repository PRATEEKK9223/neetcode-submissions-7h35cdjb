class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] array=new int[255];
        for(int i=0;i<array.length;i++){
            array[i]=-1;
        }

        int r=0;
        int l=0;
        int result=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            if(array[ch]!=-1){
                if(array[ch]>=l){
                    l=array[ch]+1;
                }
            }
            array[ch]=r;
            int len=(r-l)+1;
            result=Math.max(len,result);
            r++;
        }

        return result;


    }
}
