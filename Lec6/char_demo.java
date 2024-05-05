package Lec6;

import java.util.Iterator;
import java.util.Scanner;

public class char_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'a';
		char ch1 = 'b';
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);//index
		
		System.out.println(ch);
		System.out.println(ch1);
		System.out.println((int)(ch));
		System.out.println((int)(ch1));
		System.out.println(ch+ch1);
		int x = 19;
		x++;//(int)(x+1)
		ch++;// ch = (char)(ch+1)
		System.out.println(ch);
	
	}

}
