public class Best_Time_to_Buy_and_Sell_Stock {
    
	public static void main(String[] args) {
		int arr[]={7,1,5,3,6,4};
		int mini = arr[0];
		int profit = 0;
		for (int i = 1; i < arr.length; i++) {
			int diff = arr[i]-mini;
			profit = Math.max(diff, profit);
			mini=Math.min(mini,arr[i]);
		}
		System.out.println(profit);
	}

    
}
