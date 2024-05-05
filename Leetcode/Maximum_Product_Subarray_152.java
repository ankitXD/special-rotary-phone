package Leetcode;

public class Maximum_Product_Subarray_152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/maximum-product-subarray/description/
		//25-04-2024
		int[] arr = { 2, 3, -2, -5, 6, -1, 4 };
		System.out.println(maxProduct(arr));
		/*
		 * ISS QUESTION MEI HAME MAXIMUM PRODUCT KA SUBARRAY CHAIYE TO HAM ISSE
		 * LEFT AUR RIGHT DONO SE SHURU KRENGE OR DONO MEI SE JO MAX HOGA USSE PRINT KRLENGE
		 * AGAR ZERO AAYA TO HAM USSE 1 CONSIDER KARENGE
		 */
	}

	public static int maxProduct(int[] nums) {
		int n = nums.length;
		int leftProduct = 1;
		int rightProduct = 1;
		int ans = nums[0];

		 for (int i = 0; i < n; i++) {

		      //if any of leftProduct or rightProduct become 0 then update it to 1
		      leftProduct = leftProduct == 0 ? 1 : leftProduct;
		      rightProduct = rightProduct == 0 ? 1 : rightProduct;

		      //prefix product
		      leftProduct *= nums[i];

		      //suffix product
		      rightProduct *= nums[n - 1 - i];

		      ans = Math.max(ans, Math.max(leftProduct, rightProduct));
		    }
		 
		return ans;

	}

}
