class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        if(prices == null || prices.length == 0)
            return result;
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        int len = prices.length;
        for(int i = 0; i < len; i++){
            minPrice = Math.min(minPrice, prices[i]);
            maxPro = Math.max(maxPro, prices[i] - minPrice);
        }
        return maxPro;
    }
}