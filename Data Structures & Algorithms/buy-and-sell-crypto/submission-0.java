class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if (prices.length > 1){
            int l = 0;
            int r = 1;
            

            while (r < prices.length){
                if (prices[r] < prices[l]){
                    l = r;
                    r++;
                    continue;
                }
                int profit = prices[r] - prices[l];
                maxProfit = Math.max(maxProfit, profit);
                r++;
            }
        }

        return maxProfit;
    }
}
