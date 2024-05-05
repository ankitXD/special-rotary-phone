package Lec8;

public class Array_Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,25,86,30};
		System.out.println(arr[0] + " "+ arr[1]);
		Swap(arr[0], arr[1]);
		System.out.println(arr[0] + " "+ arr[1]);
	}
	public static void Swap(int a, int b) {
		int c = a;
		a = b;
		b = c;
	}

}
