package Lec8;

public class Array_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[5];
		System.out.println(arr);
		//update
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		//print
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		//System.out.println(arr[5]);
		int[] other = arr;
		other[2]=-9;
		System.out.println(arr[2]);
	}

}
