class Solution {
    public String longestCommonPrefix(String[] strs) {

        int j = 0;
        String res = "";

        while(j < strs[0].length()){

            int i = 1;

            while(i < strs.length){

                if(j >= strs[i].length() || strs[i].charAt(j) != strs[0].charAt(j)){
                    return res;
                }

                i++;
            }

            res += strs[0].charAt(j);
            j++;
        }

        return res;
    }
}