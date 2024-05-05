package Assignment_3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Sort(arr);
	}
//	4
//	2
//	-18
//	45
//	30

	public static void Sort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			int mini = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[mini]) {
					mini=j;
				}
			}
			int temp = arr[i];
			arr[i]=arr[mini];
			arr[mini]=temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}

}
