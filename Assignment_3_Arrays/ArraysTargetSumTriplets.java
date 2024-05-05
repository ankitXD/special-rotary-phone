package Assignment_3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTargetSumTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://hack.codingblocks.com/app/contests/4105/195/problem
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//9
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt(); //5 7 9 1 2 4 6 8 3
		}
		int t = sc.nextInt(); //10
		TargetSumTriplet(arr, t);
	}
	public static void TargetSumTriplet(int[] arr, int t) {
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				for (int k = j; k < arr.length; k++) {
					if((arr[i]+arr[j]+arr[k])==t && (arr[i]!=arr[j]) && (arr[j]!=arr[k]) && (arr[i]!=arr[k]))
                    {
                        System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
                    }
				}
			}
		}
	}
	
}
