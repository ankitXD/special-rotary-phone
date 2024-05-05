package Lec15;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4 }, // pehla row
				{ 5, 6, 7, 8 }, // dusra row
				{ 9, 10, 11, 12 }, // 3 row
				{ 13, 14, 15, 16 }, // 4
		};
		Trans(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		 
	}

	public static void Trans(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = row+1; col < arr[0].length; col++) {
				int temp = arr[row][col];
				arr[row][col] = arr[col][row];
				arr[row][col] = temp;
			}
		}
	}

}
