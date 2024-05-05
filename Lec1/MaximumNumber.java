package Lec1;
import java.util.*;
public class MaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ankit = new Scanner(System.in);
		int a = ankit.nextInt();
		int b = ankit.nextInt();
		int c = ankit.nextInt();
		if(a>b && a>c) {
			System.out.println(a);
		} else if(b>a && b>c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}

}
