class Solution {
    public void sortColors(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();

        for(int ele:nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }

        int k=0;
        for(int i=0;i<map.size();i++){
            while(map.getOrDefault(i,0)!=0){
                nums[k]=i;
                k++;
                map.put(i,map.get(i)-1);
            }
        }
    }
}