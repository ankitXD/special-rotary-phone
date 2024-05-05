package Lec1;
import java.util.*;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ankit = new Scanner(System.in);
		int n = ankit.nextInt();
		if(n>6) {
			System.out.println("Hey");
		} 
//			else {
//			System.out.println("Bye");
//		}
		if(n%2==0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

}
