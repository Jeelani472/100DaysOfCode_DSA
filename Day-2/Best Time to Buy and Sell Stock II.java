class Solution {
    public int maxProfit(int[] prices) {
      int buyingprice=prices[0];
      int maxprofit=0;
for(int i=1;i<prices.length;i++){
    if(buyingprice<prices[i]){
maxprofit+=prices[i]-buyingprice;
    }
     buyingprice=prices[i];
}
return maxprofit;
    }
}
