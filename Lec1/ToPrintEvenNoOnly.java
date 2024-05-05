package Lec1;

public class ToPrintEvenNoOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3467;
		if(n!=0) {
			int rem = n%10; 
			 if(rem % 2 ==0) {
				System.out.println(rem);
			} else {
				n = n/10;
			}
		} else {
			System.out.println("N");
		}
	}

}
