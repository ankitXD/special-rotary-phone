package Assignment_3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTargetSumPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//7
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt(); //5 1 3 4 2 5 5
		}
		int t = sc.nextInt(); //5
		TargetSumTriplet(arr, t);
	}

	public static void TargetSumTriplet(int[] arr, int t) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if((arr[i] + arr[j]) == t && (arr[i]!=arr[j]))
				{
					System.out.println(arr[i]+" and "+arr[j]);
				}
			}
		}
	}
}
