package Leetcode;

public class Missing_Number_268 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/missing-number/description/
		//16-04-2024
		int[] nums = { 3, 0, 1 };
		System.out.println(missingNumber(nums));
		/*
		 * ISS QUESTION MEI EK MISSING NUMBER HAI TO HAM KARENGE YEH KI
		 * SABSE PEHLE PURE ARRAY KA SUM KARLENGE AUR USSE EK JAGAH STORE KARLEGE
		 * FIR EK ACTUAL SUM BANAYEGE JO KI (n(n+1))/2 WALE FORMULE SE NIKALTA
		 * FIR ACTUAL - SUM = ANS 
		 */
	}

	public static int missingNumber(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}
		int actualSum = (nums.length*(nums.length+1))/2;
		
		int ans = 0;
		ans = actualSum - sum;
		return ans;

	}

}
