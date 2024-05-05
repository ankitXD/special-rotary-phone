package Lec21;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 4;
		int n = 5;
		System.out.println(pow(x, n));
	}

	public static int pow(double x, int n) {
		if(n==0) {
			return 1;
		}
		
		int ans = pow(x, n - 1);
		return (int) (ans * x);

	}

}
