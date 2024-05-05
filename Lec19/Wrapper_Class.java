package Lec19;

public class Wrapper_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		Integer a1 = 10;
		// Long l1 = 89l;
		// long l2 = 67;
		int b = 78;
		Integer b1 = 89;
		b = b1;
		System.out.println(b1);

		Integer c1 = 15;
		Integer c2 = 15;
		Integer c3 = 157;
		Integer c4 = 157;

		System.out.println(c1 == c2);
		System.out.println(c3 == c4);

		System.out.println(c3.equals(c4));
	}

}
