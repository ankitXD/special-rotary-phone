package Lec1;

public class Inc_Dec {
 public static void main(String[] args) {
	int a = 9;
	System.out.println(a++); //pehle print krta h fir change krta hai fir aage bhejta hai
	System.out.println(a); //yaha pehle ka a++ aya to uski value increment hokar 10 hogai
	
//	a++;//a = a+1; -> Post Inc
//	++a;//a = a+1; -> Pre Decr

	int b = 7;
	b--;
	System.out.println(b);
	System.out.println(b--);
	System.out.println(b);
	
//	b--;//b = b-1; -> Post Decr
//	--b;//b = b-1; -> Pre Incr
	
	a=9;
	b=8;
	int c = a++ - b++ - b-- + a++ + 8 + a++ - b++;
	System.out.println(c);
	
	int x = 11;
	System.out.println(++x);
	System.out.println(x);
	
	a = 6;
	b = 5;
	c = a++ + ++a - --b + ++b - b--;
	System.out.println(c);
 }
}
