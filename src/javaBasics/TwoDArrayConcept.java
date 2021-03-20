package javaBasics;

public class TwoDArrayConcept {

	public static void main(String[] args) {
		//1D array
//		String[] a = new String[4];
//		a[0]="";
//		a[1]="";
//		a[2]="";
//		a[3]="";
//		
//		int b[] = {10, 20, 30, 50};
//		System.out.println(b.length);
		
		// 2D array - String[][] a = new String[row][column];
		int [][] scores = new int[4][2]; 
		// 1st row
		scores[0][0] = 10;
		scores[0][1] = 20;
		//2nd row
		scores[1][0] = 100;
		scores[1][1] = 200;
		//3rd row
		scores[2][0] = 1000;
		scores[2][1] = 2000;
		//4th row
		scores[3][0] = 10000;
		scores[3][1] = 20000;
		
		int[][] scores1 = {{10,20},{100,200},{1000,2000},{10000,20000}};
		
//		System.out.println("Number of rows in scores array: "+scores.length); // .length => number of row counts
//		System.out.println("Number of rows in scores1 array: "+scores1.length); // .length => number of row counts
//		
//		System.out.println("Number of columns in scores array: "+scores[0].length);
//		System.out.println("Number of columns in scores1 array: "+scores1[0].length);
		
//		for(int i=0; i<scores.length; i++) { // first for loop is traversing into rows
//			for(int j=0; j<scores[i].length; j++) { // second for loop is traversing into columns
//				System.out.println(scores[i][j]);
//			}	
//		}
		
		for(int i=0; i<scores1.length; i++) {
			for(int j=0; j<scores1[i].length; j++) {
				System.out.print(scores1[i][j]+" ");
			}
		}
	}
	// Assignment improvement: 
//		1. input username/password = create 2-D array
//		2. Database username/password = create 2-D array		

}
