class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            //int sum=nums[i];
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum>=target){
                    minLength=Math.min(minLength,j-i+1);
                }
            }
        }
        if(minLength==Integer.MAX_VALUE){
            return 0;
        }else{
            return minLength;
        }
       
    }
}