package Abcd;

import java.util.Scanner;

public class mine_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ankit = new Scanner(System.in);
		int n = ankit.nextInt();
		int row = 1;
		int star = 1;
		int space = n-1;
		while(row<=n) {
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while(j<=star) {
				System.out.print("1 ");
				j++;
			}
			row++;
			star+=2;
			space--;
			System.out.println();
		}
	}

}
