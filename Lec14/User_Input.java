package Lec14;

import java.util.Scanner;

public class User_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ankit = new Scanner(System.in);
		int r = ankit.nextInt();
		int c = ankit.nextInt();
		int[][] arr = new int[r][c];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = ankit.nextInt();
			}
		}
		Disp(arr);
	}
	public static void Disp(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
