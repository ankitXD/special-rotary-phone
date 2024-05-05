package Lec4;
import java.util.*;
public class check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ankit = new Scanner(System.in);
		int n = ankit.nextInt();
		int count = 0;
		for (int i = 2; i < n; i++) {
			if(n%i == 0) {
				count++;
			} 
		}
		if(count>=1) {
			System.out.println("Not Prime");
		} else {
			System.out.println("Prime");
		}
	}

}
