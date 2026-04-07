class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] arr=s1.toCharArray();
        Arrays.sort(arr);
        String s=new String(arr);
        for(int i=0;i<=s2.length()-s1.length();i++){
            int j=0;
            StringBuilder sb=new StringBuilder();
            int indx=i;
            while(j<s1.length()){
                sb.append(s2.charAt(indx));
                indx++;
                j++;
            }
            String ss=sb.toString();
            char[] str=ss.toCharArray();
            Arrays.sort(str);
            String temp=new String(str);
            if(s.equals(temp)){
                return true;
            }

        }

        return false;
    }
}
