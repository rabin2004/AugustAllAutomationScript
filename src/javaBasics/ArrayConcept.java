package javaBasics;

public class ArrayConcept {
	// Array -> [] - store values like in a table with single column with multiple row defined

	public static void main(String[] args) {
//		int a = 1;
//		int b = 2;
//		int c = 3;
//		int d = 4;
//		int e = 5;
		
		// One Dimensional array - 1D array
//		int[] x = new int[5];
//		x[0]=1;
//		x[1]=2;
//		x[2]=3;
//		x[3]=4;
//		x[4]=5;
//				
//		System.out.println("Number in 3rd row = "+x[2]);
//		System.out.println("Number in 5th row = "+x[4]);
//		System.out.println("Size of array = "+x.length);
//		
//		for(int i=0; i<x.length; i++) {
//			System.out.println("Number in "+i+"th position = "+x[i]);
//		}
		
//		String names[] = new String[4];
//		names[0] = "Tom";
//		names[1] = "Harry";
//		names[2] = "Joe";
//		names[3] = "John";
////		names[4] = "Jack"; // ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
//		
//		System.out.println(names.length);
////		System.out.println(names[2]);
//		for(int i=names.length-1; i>=0; i--) {
//			System.out.println(names[i]);
//		}
		
		String names[] = {"Tom", "Harry", "Joe", "John", "Jack", "David"};
		System.out.println(names.length);
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i]+" ");
		}
		
		
	}
	// Improvement in past assignment:
//		1. Login functionality - create array for Input username/password & Database username/password
//		2. get input username & password compare with Database username & password 
//		3. then provide conditions

}
