class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder output=new StringBuilder("");
        int i=0;
        int j=0;
        while(i<=word1.length()-1 && j<=word2.length()-1){
            output.append(word1.charAt(i));
            i++;
            output.append(word2.charAt(j));
            j++;
        }

        while(i<=word1.length()-1){
            output.append(word1.charAt(i));
            i++;
        }
        
        while(j<=word2.length()-1){
            output.append(word2.charAt(j));
            j++;
        }

        return output.toString();
    }
}