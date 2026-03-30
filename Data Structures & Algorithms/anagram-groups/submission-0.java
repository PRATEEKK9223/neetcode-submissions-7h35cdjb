class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> map =new HashMap<>();
       for(int i=0;i<strs.length;i++){
            char[] arr=strs[i].toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);

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
