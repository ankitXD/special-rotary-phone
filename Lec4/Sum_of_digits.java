package Lec4;
import java.util.*;
public class Sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ankit = new Scanner(System.in);
		int n = ankit.nextInt();
		int sum = 0;
		while(n>0) {
			int rem = n%10;
			sum = sum+rem;
			n=n/10;
		}
		System.out.println(sum);
	}

}
