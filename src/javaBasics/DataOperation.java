package javaBasics;

public class DataOperation {

	public static void main(String[] args) {
		// Data operation with integers (int)
		// arithmetic operations - (+,-,*,/,%)
		
		int a = 10;
		int b = 30;
		
		// addition
		int c = a+b;

		System.out.println("Addition of a & b = "+c); // + will be taken as place
		
		// substraction
//		int c = b-a; // duplicate local variable
		c = b-a; // replacing value of c
		
		System.out.println("Substraction of b & a = "+c);
		
		System.out.println("Adding: "+(a+b)); // 2nd + will be taken as addition where as 1st + will be taken as place
		System.out.println(a+b);
		
		// division
		c = a/b;
		System.out.println("Division of a to b = "+c);
		c = b/a;
		System.out.println("Divsion of b to a = "+c);
		double d = a/b;
		System.out.println("Division of a to b = "+d);
		
		double x = 10; // if output is going to be decimal - makes sure to create variables in float/double
		double y = 30;
		double z = x/y;
		System.out.println("Division of x to y = "+z);
		System.out.println(x);
		
		System.out.println(a+x);
		
		// multiplication
		z = x*y;
		System.out.println("Multiplication of x & y = "+z);
		
		int f = 40;
		int g = 80;
		int h = 80;
		
		System.out.println("g can be divided by f = "+(g%f)); // if divisible will give 0
		System.out.println("f can't be divided by g = "+(f%g)); // if not divisible can give +ve or -ve values
		
		// comparative operations - output of comparison will be either true or false
		// one = sign means assigning value but == sign means comparison
		
		// == - equals to
		System.out.println(f==g);
		System.out.println(g==h);
		boolean i = (f==h);
		System.out.println("comparing f to h: "+i);
		
		// != - not equal to
		System.out.println("****"+(f!=g)); // true
		System.out.println("####"+(g!=h)); // false
		
		// <= - less than or equal to
		System.out.println(f<=g);
		
		// >= - more than or equal to
		System.out.println(f>=g);
		
		//> or < 
		System.out.println(f>g);
		System.out.println(f<g);
		
		
	}

}
