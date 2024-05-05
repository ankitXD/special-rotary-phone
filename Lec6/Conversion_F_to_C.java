package Lec6;

import java.util.*;

public class Conversion_F_to_C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ankit = new Scanner(System.in);
		int minf = ankit.nextInt();
		int maxf = ankit.nextInt();
		int steps = ankit.nextInt();
		
		for (int i = minf; i <= maxf ; i=i+steps) {
			int c = (int) ((5.0/9)*(i-32));
			System.out.println(i+"\t"+c);
		}
	}

}
