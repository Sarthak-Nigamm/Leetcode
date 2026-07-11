class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        
        // DP variables initialization
        // Kharidne ke liye shuruwat mein infinity maan lo taaki pehla price update ho jaye
        int buy1 = Integer.MIN_VALUE; 
        int sell1 = 0;
        int buy2 = Integer.MIN_VALUE;
        int sell2 = 0;
        
        for (int price : prices) {
            // State transitions (Pichli state ka use karke nayi state calculate kar rahe hain)
            buy1 = Math.max(buy1, -price);
            sell1 = Math.max(sell1, buy1 + price);
            
            // buy2 ke time pehle ka profit (sell1) reinvest kar rahe hain
            buy2 = Math.max(buy2, sell1 - price);
            sell2 = Math.max(sell2, buy2 + price);
        }
        
        // sell2 mein final max profit store hoga do transactions ke baad
        return sell2;
    }
}