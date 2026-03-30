class Solution {
    public boolean isPalindrome(String s) {
        int st=0;
        int end=s.length()-1;
        s=s.toLowerCase();

        while(st<end){
            if((s.charAt(st)<'a' || s.charAt(st)>'z') &&  (s.charAt(st)<'0' || s.charAt(st)>'9')){
                st++;
                continue;
            }
             if((s.charAt(end)<'a' || s.charAt(end)>'z' )&&  (s.charAt(end)<'0' || s.charAt(end)>'9')){
                end--;
                continue;
            }

            if(s.charAt(st)!=s.charAt(end)){
                return false;
            }

            st++;
            end--;
        }

        return true;
    }
}
