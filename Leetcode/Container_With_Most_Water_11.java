package Leetcode;

public class Container_With_Most_Water_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/container-with-most-water/
		//27-04-2024
		int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(maxArea(arr));
	}
	public static int maxArea(int[] height) {
		int left = 0;
		int right = height.length-1;
		int max = 0;
		
		while(left<right) {
			if(height[left] < height[right]) {
				max = Math.max(max, height[left] * (right-left));
				left++;
			} else {
				max = Math.max(max, height[right] * (right-left));
				right--;
			}
		}
		return max;
	}

}
