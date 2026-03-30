class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int i=0;
        int[] result=new int[k];
        int maxKey=0;
        while(i<k){
            int max=0;
            for(int key:map.keySet()){
                int count=map.getOrDefault(key,0);
                if(max<count){
                    max=count;
                    maxKey=key;
                }
            }

            map.remove(maxKey);
            result[i]=maxKey;
            i++;
        }

        return result;
       
    }
}
