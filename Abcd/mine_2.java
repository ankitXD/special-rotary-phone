package Abcd;

import java.util.Scanner;

public class mine_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		while(row<=n) {
			int i = 1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			star++;
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
