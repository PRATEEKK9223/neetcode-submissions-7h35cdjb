class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        int len=nums.length;
        HashSet<List<Integer>> set =new HashSet<>();
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                for(int k=j+1;k<len;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List list=Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(list);
                        set.add(list);
                    }
                }
            }
        }
        for(List list : set){
            result.add(list);
        }

        return result;
    }
}
