package Leetcode;

public class Remove_Duplicates_from_Sorted_Array_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
		//15-04-2024
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		System.out.println(removeDuplicates(nums));
		
		/* ISS QUESTION MEI HAMNE SABSE PEHLE CHECK KIA KI JO CURRENT ELEMENT HAI VO
		 * NEXT ELEMENT K EQUAL TO NHI HAI, AUR HAI TO USSE CONTINUE KRDO
		 * AUR NAHI HAI TO USSE SAVE KRLO AUR COUNT KO INCREASE KRDO
		 * AUR LAST MEIN RETURN COUNT
		*/
	}

	public static int removeDuplicates(int[] nums) {
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
				continue;
			} else {
				nums[count] = nums[i];
				count++;
			}
		}
		return count;
	}

}
