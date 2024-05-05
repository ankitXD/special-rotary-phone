package Lec15;

public class mine {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {{1,4,7,11,15},{2,5,8,12,19},
						{3,6,9,16,22},{10,13,14,17,24},
						{18,21,23,26,30}};
		int x = 5;
		
		System.out.println(Search(arr, x));
	}
	
	public static boolean Search(int [][] arr,int x ) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(arr[i][j] == x) {
					return true;
				}
			}
		}
		return false;
	}
}
