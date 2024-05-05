package Abcd;

import java.util.*;

public class mine_24 {
	public static void main(String[] args) {
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
				System.out.print(row+" ");
				j++;
			}
			row++;
			star+=2;
			space--;
			System.out.println();
		}
	}
}
