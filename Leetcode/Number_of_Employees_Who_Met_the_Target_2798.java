package Leetcode;

import java.util.Iterator;

public class Number_of_Employees_Who_Met_the_Target_2798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/number-of-employees-who-met-the-target/description/
		//28-04-2024
		int[] arr = { 0, 1, 2, 3, 4 };
		int target = 2;
		System.out.println(numberOfEmployeesWhoMetTarget(arr, target));
	}

	public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
		int count = 0;
		for (int i = 0; i < hours.length; i++) {
			if (hours[i] >= target) {
				count++;
			}
		}
		return count;
	}

}
