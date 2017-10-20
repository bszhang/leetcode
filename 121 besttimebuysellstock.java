class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length==0 || prices==null ) return 0;
        int min=prices[0];
        int current_distance=0;
        for(int i=1;i<prices.length;i++){
        if (prices[i]<min) min = prices[i];
        if (prices[i]-min> current_distance) current_distance = prices[i]-min;
        }
        return current_distance;
    }
}
