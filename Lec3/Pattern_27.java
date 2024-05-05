package Lec3;
import java.util.*;
public class Pattern_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			int val = 1;
			while(j<=star) {
				System.out.print(val + " ");
				if(j <= star/2) {
				val++;
				} else {
					val--;
				}
				j++;
			}
			row++;
			System.out.println();
			star+=2;
			space--;
		}
	}

}
