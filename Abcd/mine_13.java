package Abcd;

import java.util.Scanner;

public class mine_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		while(row<=2*n-1) {
			int i = 1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			//mirror concept - if else loop for stars 
			if(row<n) {
				star++;
			} else {
				star--;
			}
			//first mirror concept then only row line
			row++;
			System.out.println();
		}
	}

}
