package Lec1;
import java.util.*;
public class GradeCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ankit = new Scanner(System.in);
		int num = ankit.nextInt();
		if(num>=75) {
			System.out.println("A");
		} else if(num>= 65 && num< 75) {
			System.out.println("B");
		} else if(num>=45 && num<65) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}

	}

}
