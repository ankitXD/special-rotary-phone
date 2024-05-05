package Leetcode;

import java.util.Iterator;

public class Best_Time_to_Buy_and_Sell_Stock_121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
		//19-04-2024
		int[] arr = { 7, 6, 4, 3, 1 };
		System.out.println(maxProfit(arr));
	}

	public static int maxProfit(int[] prices) {
		int buy_price = prices[0];

		int profit = 0;

		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < buy_price) {
				buy_price = prices[i];
			} else {
				int current_profit = prices[i] - buy_price;
				profit = Math.max(current_profit, profit);
			}
		}
		return profit;
	}

}
