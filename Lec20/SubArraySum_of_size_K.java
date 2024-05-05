package Lec20;

public class SubArraySum_of_size_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, 3, 4, 5, 1, 3, 7, 8, 4, 1 };
		int k = 3;
		System.out.println(slidingWindow(arr, k));
	}
	public static int slidingWindow(int[]arr, int k) {
		//1st window ka kaam
		
		int sum = 0;
		int ans = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		ans=sum;
		
		for (int i = k; i < arr.length; i++) {
			sum += arr[i]; //GROW
			sum -= arr[i-k];//SHRINK
			ans = Math.max(ans, sum);
		}
		return ans;
		
	}

}
