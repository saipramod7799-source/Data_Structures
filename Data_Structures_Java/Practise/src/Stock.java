import java.util.ArrayList;

/*
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
* */
public class Stock {

    public static int maxProfit(int[] prices) {

        ArrayList<Integer> prices1 = new ArrayList<>();

        for (int price : prices) {
            prices1.add(price);
        }

        int buy = prices1.get(0);
        int profit = 0;

        for(int i=1; i<prices1.size(); i++){
            if(prices1.get(i) < buy){
                buy = prices1.get(i);
            }
            else if((prices1.get(i)-buy) > profit){
                profit = prices1.get(i) - buy;
            }
        }

        return profit;
    }
    public static void main(String[] args){

        int[] prices = {7,1,5,3,6,4};

        int output = maxProfit(prices);
        System.out.println(output);
    }
}
