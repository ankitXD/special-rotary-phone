package Experiment;

public class kadaneDryRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(arr));
	}
	public static int maxSubArray(int[] nums) {
	        int maxSum = nums[0];
	        int currentSum = nums[0];

	        for (int i = 1; i < nums.length; i++) {
	            currentSum = Math.max(nums[i], currentSum + nums[i]);
	            maxSum = Math.max(maxSum, currentSum);
	        }

	        return maxSum;
	 }

}
