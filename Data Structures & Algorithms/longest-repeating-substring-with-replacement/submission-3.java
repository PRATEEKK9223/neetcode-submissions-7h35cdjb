class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int r=0;
        int l=0;
        int maxlen=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            freq[ch-'A']++;
            int window=(r-l)+1;
            int maxFrequency=Arrays.stream(freq).max().getAsInt();
            if(window-maxFrequency<=k){
                maxlen=Math.max(maxlen,window);
            }else{
               
                freq[s.charAt(l)-'A']--;
                 l++;
            }
            r++;
        }

        return maxlen;
    }
}
