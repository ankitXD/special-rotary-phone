package Lec17;

public class String_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		String str1 = new String("hello");
		String str2 = "hello";
		String str3 = new String("hello");
		System.out.println(str == str1);
		System.out.println(str2 == str); //yaha same address hai
		System.out.println(str2 == str1);
		System.out.println(str.equals(str2));//both content same h
		
		String s = "hellookaybyehbsdhsafhaf";
		System.out.println(s.substring(1, 5));
		System.out.println(s.substring(2));
		System.out.println(s.substring(2, 2)); //blank
		
	}

}
