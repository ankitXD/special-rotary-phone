package Abcd;

import java.util.Scanner;

public class mine_8 {
	public static void main(String[] args) {
		Scanner ankit = new Scanner(System.in);
		int n = ankit.nextInt();
		int row = 1;
		int space1 = 0;
		int space2 = n-2;
		while(row<=n) {
			System.out.print("* ");
			int i = 1;
			while(i<=space2) {
				System.out.print("  ");
				i++;
			}
			System.out.print("* ");
			int j = 1;
			while(j<=space1) {
				System.out.print("  ");
				j++;
			}
			row++;
			space2-=2;
			System.out.println();
		}
	}
}
