package Lec2;

import java.util.Scanner;

public class Pattern_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ankit = new Scanner(System.in);
		int n = ankit.nextInt();
		int row = 1;
		int star = n;
		int space = 0;
		while(row<=n) {
			//space
			int i = 1;
			while(i<=space){
				System.out.print("  ");
				i++;
			}
			
			//star
			int j = 1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			
			//next row prep
			row++;
			System.out.println();
			space++;
			star--;
		}
	}

}
