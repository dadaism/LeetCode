public class Solution {
    public int maxProfit(int[] prices) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        int profit = 0;
        for (int i=1; i<prices.length; ++i) {
            int value = prices[i] - prices[i-1];
            if ( value>0 ) profit += value; 
        }
        return profit;
    }
}
