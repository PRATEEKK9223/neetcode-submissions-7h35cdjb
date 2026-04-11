class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result=new int[nums.length-k+1];
        int indx=0;
        for(int i=0;i<=nums.length-k;i++){
            int j=0;
            int tempIndx=i;
            int max=Integer.MIN_VALUE;
            while(j<k){
                if(nums[tempIndx]>max){
                    max=nums[tempIndx];
                    
                }
                tempIndx++;
                j++;
            }
            result[indx++]=max;
        }
        return result;
    }
}
