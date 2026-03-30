class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map =new HashMap<>();
        List<Integer> list=new ArrayList<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int len=nums.length;
        int n=len/3;

        for(int num:map.keySet()){
            if(map.get(num)>n){
                list.add(num);
            }
        }

        return list;

    }
}