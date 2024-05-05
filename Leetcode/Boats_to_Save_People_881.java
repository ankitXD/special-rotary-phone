package Leetcode;

import java.util.Arrays;

public class Boats_to_Save_People_881 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://leetcode.com/problems/boats-to-save-people/description/
		//04-05-2024
		int[] arr = { 3, 5, 3, 4 };
		int lim = 4;
		System.out.println(numRescueBoats(arr, lim));
	}

	public static int numRescueBoats(int[] people, int limit) {
		Arrays.sort(people);
		int left = 0;
		int right = people.length - 1;

		int boats = 0;
		while (left <= right) {
			if (people[left] + people[right] <= limit) {
				left++;
			}
			right--;
			boats++;
		}

		return boats++;
	}

}
