class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }

    public void mergeSort(int[] nums,int st,int end){
        if(st==end){
            return;
        }

        int mid=(st+end)/2;
        mergeSort(nums,st,mid);
        mergeSort(nums,mid+1,end);

        merge(nums,st,mid,end);
    }

    public void merge(int[] nums,int st,int mid,int end){
        int[] mix=new int[end-st+1];

        int i=st;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=end){
            if(nums[i]<nums[j]){
                mix[k]=nums[i];
                i++;
            }else{
                mix[k]=nums[j];
                j++;
            }
            k++;
        }


        while(i<=mid){
            mix[k]=nums[i];
            k++;
            i++;
        }
        while(j<=end){
            mix[k]=nums[j];
            k++;
            j++;
        }

        for(int l=0;l<mix.length;l++){
            nums[l+st]=mix[l];
        }
    }
}