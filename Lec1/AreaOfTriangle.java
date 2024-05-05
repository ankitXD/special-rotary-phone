package Lec1;
import java.util.*;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ankit = new Scanner(System.in);
		int a = ankit.nextInt();
		int b = ankit.nextInt();
		int c = ankit.nextInt();
		int s = (a+b+c)/2;
		double d = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of Triangle is " + d);
	}

}
