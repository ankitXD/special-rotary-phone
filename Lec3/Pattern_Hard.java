package Lec3;

import java.util.Scanner;

public class Pattern_Hard {
public static void main(String[] args) {
	Scanner ankit = new Scanner(System.in);
	int n = ankit.nextInt();
	int row = 1;
	int star = 1;
	int space = n-1;
	int val = 1;
	while(row<=2*n-1) {
		//space
		int i = 1;
		while(i<=space) {
			System.out.print("  ");
			i++;
		}
		//star
		int j = 1;
		int p = val;
		while(j<=star) {
			System.out.print(p+ " ");
			if(j<=star/2) {
				p++;
			} else {
				p--;
			}
			j++;
		}
		//next row prep
		//mirror
		if(row<n) {
			star+=2;
			space--;
			val++;
		} else {
			star-=2;
			space++;
			val--;
		}
		row++;
		System.out.println();
	}
}
}
