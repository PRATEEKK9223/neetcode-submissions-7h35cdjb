class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int j=0;
        for(int i=1;i<nums.length;i++,j++){
            if(nums[j]==nums[i]){
                return true;
            }
        }
        return false;
    }
}