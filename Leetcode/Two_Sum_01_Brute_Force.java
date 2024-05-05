package Leetcode;

public class Two_Sum_01_Brute_Force {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://leetcode.com/problems/two-sum/
		//17-04-2024
		int[] arr= {3,2,3};
		int target = 6;
		/*
		 * NOT OPTIMIZED, IT'S BRUTE FORCE 
		 * OPTIMIZED VERSION WILL BE OF HASHMAP
		 * IS MEI HAM HAR ELEMENT PAR JAKAR FIR EK DUSRA ELEMENT LETE JO USKE AGLA HOTA
		 * AUR VO DONO COMPARE HOTE KI TARGET HAI KI NHI AUR AGAR TARGET HOTE TO 
		 * NEW ARRAY RETURN HO LETA
		 */
	}
	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
		/*
		 * int[] result = new int[2]; for(int i = 0; i < nums.length-1; i++){
		 * if(nums[i]+nums[i+1]==target){ result[0] = i; result[1] = i+1; return result;
		 * } }
		 * 
		 * return result;
		 */
    }

}
