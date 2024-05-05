package Abcd;

import java.util.Scanner;

public class mine_7 {
	public static void main(String[] args) {
		Scanner ankit = new Scanner(System.in);
		int n = ankit.nextInt();
		int row = 1;
		int star = n;
		int space = n-2;
		while(row<=n) {
			if(row==1 || row==n) {
			int i = 1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
           }
			else {
				System.out.print("* ");
				int j = 1;
				while(j<=space) {
					System.out.print("  ");
					j++;
				}
				System.out.print("* ");
			}
			row++;
			System.out.println();
		}
	/* Step 1 - Check no of rows
	 * Step 2 - to make independent variable for tasks(star,space)
	 * Step 3 - one loop for row then if star then loop for star and if 
	            space then loop for space
	 * Step 4 - exit the loop
	 * Step 5 - Increment row by one
	 * Step 6 - make the cursor goes to next line by syso
	*/
	}
}
