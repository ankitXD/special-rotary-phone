package Abcd;

import java.util.Scanner;

public class mine_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = n;
		int space = 0;
		while(row<=2*n-1) {
			int j = 1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int i = 1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			if(row<n) {
				space+=2;
				star-=1;
			} else {
				space-=2;
				star+=1;
			}
			row++;
			System.out.println();
		}
	}

}
