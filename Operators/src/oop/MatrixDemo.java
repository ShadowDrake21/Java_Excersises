package oop;

public class MatrixDemo {

	public static void main(String[] args) {
		double[][] m1 = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		double[][] m2 = {
				{-1,1,3,5},
				{7,9,11,13},
				{15,17,19,21}
		};
		
		double[][] m3 = {
				{7,10},
				{11,5},
				{-1,0},
				{9,10}
		};
		
		Matrix matrix1 = new Matrix(m1, m1.length, m1[0].length);
		
		double[][] addMatrix = matrix1.addition(m2, m2.length, m2[0].length);
		double[][] multNumMatrix = matrix1.multiplyNumber(100);
		double[][] multMatMatrix = matrix1.multiplyMatrixes(m3, m3.length, m3[0].length);
		
		printMatrix(addMatrix);
		printMatrix(multNumMatrix);
		printMatrix(multMatMatrix);
		
		matrix1.printMatrix();
	}
	
	public static void printMatrix(double[][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
