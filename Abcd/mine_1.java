package Abcd;

import java.util.Scanner;

public class mine_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = n;
		//while loop
		while(row<=n) {
			//star
			int i = 1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			//next row prep
			row++;//row ki value update hogi ek line ke baad 
			System.out.println();//cursor next line mei aajayega star print krne
			
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

}
