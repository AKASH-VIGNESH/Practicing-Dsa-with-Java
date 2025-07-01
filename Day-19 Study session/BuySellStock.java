public class BuySellStock {
    public static void main(String[] args) {
        int price [] = {7,1,5,3,6,4};
        int mini = price[0];
        int maxProfit = 0;
        int n = price.length;
        for(int i=0;i<n;i++){
            int cost = price[i]-mini;
            maxProfit = Math.max(maxProfit, cost);
            mini = Math.min(mini, price[i]);
        }
        System.out.println(maxProfit);
    }
}
