class Solution {
    public boolean validPalindrome(String s) {
        int st=0;
        int end=s.length()-1;

        while(st<end){
            if(s.charAt(st)!=s.charAt(end)){
                return isPalindrom(s,st+1,end) || isPalindrom(s,st,end-1);
            }

            st++;
            end--;
        }
        return true;
    }

     boolean isPalindrom(String s,int st,int end){
            while(st<end){
                if(s.charAt(st)!=s.charAt(end)){
                    return false;
                }
                st++;
                end--;
                
            }
            return true;
        }
}