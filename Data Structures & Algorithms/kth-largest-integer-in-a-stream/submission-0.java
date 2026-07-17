class KthLargest {
    int k;
    int[] nums;
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    public KthLargest(int k, int[] nums) {
       this.k=k;
       this.nums=nums;
        for(int ele:nums){
            pq.add(ele);
        }

        // while(pq.size()>k){
        //     pq.poll();
        // }
    }
    
    public int add(int val) {
        pq.add(val);

        while(pq.size()>k){
            pq.poll();
        }
        return pq.peek();
    }
}
