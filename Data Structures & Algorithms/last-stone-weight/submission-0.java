class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:stones){
            pq.add(ele);
        }

        while(pq.size()>1){
            int x=pq.poll();
            int y=pq.poll();

            if(x==y){
                continue;
            }
            if(x<y){
                pq.add(y-x);
            }else{
                pq.add(x-y);
            }
        }

        return  pq.size()==0?0:pq.peek();
    }
}
