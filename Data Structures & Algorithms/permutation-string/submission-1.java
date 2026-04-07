class Solution {

    private boolean isEqual(int[] freq_s1,int[] freq_s2){
        for(int i=0;i<26;i++){
            if(freq_s1[i]!=freq_s2[i]){
                return false;
            }
        }

        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int[] freq_s1=new int[26];
        int[] freq_s2=new int[26];
        for(int i=0;i<s1.length();i++){
            freq_s1[s1.charAt(i)-'a']++;
        }

        for(int i=0;i<=s2.length()-s1.length();i++){
            int j=0;
            int index=i;
            while(j<s1.length()){
                freq_s2[s2.charAt(index)-'a']++;
                j++;
                index++;
            }

            if(isEqual(freq_s1,freq_s2)){
                return true;
            }

            Arrays.fill(freq_s2,0);

           
        }
        return false;
        

    }
}
