package Lec3;

import java.util.Scanner;

public class Pattern_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ankit = new Scanner(System.in);
		int n = ankit.nextInt();
		int row = 1;
		int space1 = n/2;
		int space2 = -1;
		while(row<=n) {
			//space1
			int i = 1;
			while(i<=space1) {
				System.out.print("  ");
				i++;
			}
			//star
			System.out.print("* ");
			//space2
			int j = 1;
			while(j<=space2) {
				System.out.print("  ");
				j++;
			}
			//star
			if(row !=1 && row !=n ) {
				System.out.print("* ");
			}
			
			//next row prep
			//mirror
			if(row<=n/2) {
				space1--;
				space2+=2;
			} else {
				space1++;
				space2-=2;
			}
			row++;
			System.out.println();
		}
	}

}
