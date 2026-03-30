class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> map =new HashMap<>();
       for(int i=0;i<strs.length;i++){
            int[] freq=new int[26];
            for(char ch:strs[i].toCharArray()){
                freq[ch-'a']++;
            }
            StringBuilder sb =new StringBuilder();
            for(int count:freq){
                sb.append(count).append('#');
            }

            String key=sb.toString();

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            List<String> list=map.get(key);
            list.add(strs[i]);
            map.put(key,list);
       }

       List<List<String>> result=new ArrayList<>();

       for(List list:map.values()){
            result.add(list);
       }
       return result;


    }
}
