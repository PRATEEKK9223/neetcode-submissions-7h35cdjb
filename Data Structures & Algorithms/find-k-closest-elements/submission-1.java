class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> result =new ArrayList<>();
        int pos=0;
        while(pos<arr.length && arr[pos]<x){
            pos++;
        }

        int i=0;
        int left=pos-1;
        int right=pos;
        while(i<k){
            if(left<0){
                result.add(arr[right]);
                right++;
            }else if(right>=arr.length){
                result.add(arr[left]);
                left--;
            }else{
                int diff1=Math.abs(arr[left]-x);
                int diff2=Math.abs(arr[right]-x);
                if(diff1<=diff2){
                    result.add(arr[left]);
                    left--;
                }else{
                    result.add(arr[right]);
                    right++;
                }
            }
            i++;
        }

        Collections.sort(result);

        return result;
    }
}