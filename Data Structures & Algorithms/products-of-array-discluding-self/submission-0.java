class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int mul=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    mul*=nums[j];
                }  
            }

            output[i]=mul;
        }
        return output;
    }
}  
