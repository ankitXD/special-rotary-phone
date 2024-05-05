package Lec2;

import java.util.Scanner;

public class Pattern_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ankit = new Scanner(System.in);
		int n = ankit.nextInt();
		int row = 1;
		int star = 0;
		int space = n;
		while(row<=n) {
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			
			int j =1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			row++;
			space -=2;
			star++;
		}
	}

}
