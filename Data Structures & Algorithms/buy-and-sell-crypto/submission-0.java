class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        for(int i=0;i<prices.length;i++){
            int buy=prices[i];
            for(int j=i+1;j<prices.length;j++){
                int temp=prices[j]-buy;
                if(temp>profit){
                    profit=temp;
                }
            }
        }

        return profit;
    }
}
