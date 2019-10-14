




public class LeetCode121 {
	public static void main(String[] args) {
		int arr[] = {2, 4, 1};
		System.out.println(maxProfit(arr));
	}
	
	static int maxProfit(int[] prices) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < prices.length; i++) {
			if(prices[i] < min)
				min = prices[i];
			if( prices[i] - min >= max)
				max = prices[i] - min;
		}
		return max;
	}
}


