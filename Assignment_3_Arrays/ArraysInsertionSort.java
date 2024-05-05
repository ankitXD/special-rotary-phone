package Assignment_3_Arrays;

import java.util.Scanner;

public class ArraysInsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		Sort(arr);
	}
	public static void Sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int picked = arr[i];//hand picked
			int j = i-1;
			while(j>=0 && arr[j]>picked) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=picked;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
