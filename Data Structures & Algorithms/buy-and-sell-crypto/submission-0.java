class Solution {
    public int maxProfit(int[] prices) {

        int max = 0;
        int minprice = prices[0];
        for(int i=0;i<prices.length;i++){
            max = Math.max(max,prices[i]-minprice);
            minprice = Math.min(minprice,prices[i]);
        }
        return max;
    }
}