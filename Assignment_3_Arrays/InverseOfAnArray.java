package Assignment_3_Arrays;

import java.util.Scanner;

public class InverseOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		*/
		 Scanner s=new Scanner(System.in);
	        int n=s.nextInt();
	        int arr[]=new int[n];
	        int num=0;
	        for (int i = 0; i < n; i++) {
	            num=s.nextInt();
	            arr[num]=i;
	        }
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i]+" ");
	        }
		
	}
//	public static void inverseArray(int[] arr) {
//		 int num=0;
//	        for (int i = 0; i < n; i++) {
//	            System.out.print(arr[i]+" ");
//	        }
//	}

}
