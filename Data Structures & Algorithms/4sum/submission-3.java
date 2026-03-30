class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result=new ArrayList<>();
        int len=nums.length;
        HashSet<List<Integer>> triplate=new HashSet<>();
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                HashSet<Integer> set=new HashSet<>();
                for(int k=j+1;k<len;k++){
                    long temp = (long) target - nums[i] - nums[j] - nums[k];

                    if (temp >= Integer.MIN_VALUE && temp <= Integer.MAX_VALUE) {
                        int diff = (int) temp;
                    if(set.contains(diff)){
                        List list=Arrays.asList(nums[i],nums[j],nums[k],diff);
                        Collections.sort(list);
                        triplate.add(list);
                    }
                }
                    set.add(nums[k]);

                }
            }
        }

        for(List list: triplate){
            result.add(list);
        }

        return result;
    }
}