package oop;

public class Matrix {
	private double[][] matrix;
	private int rows;
	private int columns;
	
	public Matrix(double[][] matrix, int rows, int columns) {
		this.matrix = matrix;
		this.rows = rows;
		this.columns = columns;
	}
	
	public double[][] addition(double[][] matrix, int rows, int columns) {
		if(this.rows != rows || this.columns != columns) {
			return null;
		}
		
		double[][] resMatrix = new double[rows][columns];
		
		for(int i = 0; i < this.rows; i++) {
			for(int j = 0; j < this.columns; j++) {
				resMatrix[i][j] = this.matrix[i][j] + matrix[i][j];
			}
		}
		
		return resMatrix;
	}
	
	public double[][] multiplyNumber(int number) {
		double[][] resMatrix = new double[rows][columns];
		
		for(int i = 0; i < this.rows; i++) {
			for(int j = 0; j < this.columns; j++) {
				resMatrix[i][j] = this.matrix[i][j] * number;
			}
		}
		
		return resMatrix;
	}
	
	public void printMatrix() {
		for(int i = 0; i < this.rows; i++) {
			for(int j = 0; j < this.columns; j++) {
				System.out.print(this.matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public double[][] multiplyMatrixes(double[][] matrix, int rows, int columns) {
		if(this.columns != rows) {
			return null;
		}
		
		double[][] resMatrix = new double[this.rows][columns];
		
		for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                for (int k = 0; k < matrix.length; k++) {
                	resMatrix[i][j] += this.matrix[i][k] * matrix[k][j]; 
                }
            }
        }
		
		return resMatrix;
	}
}
