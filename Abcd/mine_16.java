package Abcd;

import java.util.Scanner;

public class mine_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = n;
		int space = n-1;
		while(row<=2*n-1) {
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			if(row<n) {
				star--;
				space-=1;
			} else {
				star++;
				space+=1;
			}
			row++;
			System.out.println();
		}
	}

}
