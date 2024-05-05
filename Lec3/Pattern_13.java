package Lec3;
import java.util.*;
public class Pattern_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ankit = new Scanner(System.in);
		int n = ankit.nextInt();
		int row = 1;
		int star = 1;
		while(row<=2*n-1) {
			//star
			int i = 1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			
			//next row prep
			//mirror concept
			if(row<n) {
				star++;
			} else {
				star--;
			}
			
			row++;
			System.out.println();
		}
	}

}
