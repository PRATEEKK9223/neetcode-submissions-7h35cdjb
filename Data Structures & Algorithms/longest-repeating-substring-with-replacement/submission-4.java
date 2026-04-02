class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int r=0;
        int l=0;
        int maxlen=0;
        int maxFreq=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            freq[ch-'A']++;
            int window=(r-l)+1;
            maxFreq=Math.max(maxFreq,freq[ch-'A']);
            //int maxFrequency=Arrays.stream(freq).max().getAsInt();
            if(window-maxFreq<=k){
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
