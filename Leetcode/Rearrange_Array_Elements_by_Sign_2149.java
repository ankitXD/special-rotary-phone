package Leetcode;

public class Rearrange_Array_Elements_by_Sign_2149 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
		//20-04-2024
		int[] arr = { 3, 1, -2, -5, 2, -4 };
		int[] ans = rearrangeArray(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
		
	}
    public static int[] rearrangeArray(int[] nums) {
        int krr[] = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                krr[pos]=nums[i];
                pos+=2;
            } else {
                krr[neg]=nums[i];
                neg+=2;
            }
        }
        return krr;
    }

}
