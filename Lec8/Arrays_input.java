package Lec8;

import java.util.*;

public class Arrays_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ankit = new Scanner(System.in);
		int n = ankit.nextInt();
		int []arr = new int [n];
		for (int i = 0; i < n; i++) {
			arr[i] = ankit.nextInt();
		}
		Display(arr);
	} 
	public static void Display(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
