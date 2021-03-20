package javaBasics;

public class StringManipulationConcept {

	public static void main(String[] args) {
		String a = "java coding";
		String b = "is fun";
		
		// println vs print
		System.out.println(a);
		System.out.println(b);
		
//		System.out.print(a);
//		System.out.print(b);
		
		// String concatenation function - joining strings
		String c = a+b; // + -> concatenation operator
		System.out.println(c);
		
		c = a+" "+b;
		System.out.println(c);
		System.out.println(a+"/"+b);
		
		int x = 100;
		int y = 200;
		
		System.out.println(x+y);
		System.out.println(a+x);
		System.out.println(x+a);
		System.out.println(x+y+a); // java code execution is happening left to right
		System.out.println(a+x+y);
		System.out.println(a+(x+y));
		
		String firstString = "java coding";
		String secondString = "is fun";
		
		// concatenation with concat() method
		String concatenatedString = firstString.concat(secondString);
		System.out.println(concatenatedString);
		
		// length() - gives size of a string
		System.out.println("Size of firstString: "+firstString.length());
		System.out.println("Size of secondString: "+secondString.length());
		
		// UpperCase/LowerCase
		String upperCasedFirstString = firstString.toUpperCase();
		System.out.println(upperCasedFirstString);
		System.out.println(secondString.toUpperCase());
		String lowerCasedFirstString = upperCasedFirstString.toLowerCase();
		System.out.println(lowerCasedFirstString);
		
		// compareTo() - comparison method - output will be int - if zero output then strings are equal
		System.out.println("comparing firstString to upperCasedFirstString: "
		+firstString.compareTo(upperCasedFirstString));
		
		System.out.println("comparing firstString to lowerCasedFirstString: "
				+firstString.compareTo(lowerCasedFirstString));
		
		// compareToIgnoreCase() - not sensitive to upper/lower case
		System.out.println("comparing firstString to upperCasedFirstString despite upper/lower: "
				+firstString.compareToIgnoreCase(upperCasedFirstString));
		
		// equals() - comparison method - out will be boolean 
		boolean comparingFirstStringToUpperCased = firstString.equals(upperCasedFirstString);
		System.out.println("Comparing firstString to UpperCasedFirstString: "
		+ comparingFirstStringToUpperCased);
		System.out.println("Comparing firstString to LowerCasedFirstString: "
				+ firstString.equals(lowerCasedFirstString));
		
		// equalsIgnoreCase() - is not upper/lower case sensitive
		System.out.println("Comparing firstString to upperCasedFirstString despite upper/lower: "
		+firstString.equalsIgnoreCase(upperCasedFirstString));
		
		// location of a charater in a string or which character at a specific location
		System.out.println("character at 7th location: "+firstString.charAt(7));
		System.out.println("position of g: "+firstString.indexOf('g'));
	
		// trim() - to get rid of extra blank spaces infront/back of a String
		String customerName = "        Tom Johns         ";
		String customerAddress = "NY";
		System.out.println(customerName+" lives in "+customerAddress);
		System.out.println("Welcome "+ customerName+"!");
		
		String trimedCustomerName = customerName.trim();
		System.out.println(trimedCustomerName+" lives in "+customerAddress);
		System.out.println("Welcome "+ trimedCustomerName+"!");
		
		// contains() - check if character is present - boolean output
		System.out.println("CustomerName contains o: "+trimedCustomerName.contains("o"));
		System.out.println("CustomerName contains a: "+trimedCustomerName.contains("a"));
		System.out.println("CustomerName contains tom: "+trimedCustomerName.contains("tom"));
		
		// lastIndexOf() - last position of a character
		System.out.println("Location of o: "+trimedCustomerName.indexOf('o'));
		System.out.println("Location of last o: "+trimedCustomerName.lastIndexOf('o'));
		
		// replace() - replacing a character by new character provided
		String replacedCustomerName = trimedCustomerName.replace(' ', '-');
		System.out.println("Space replaced by - : "+replacedCustomerName);
		
		// replaceAll() - replaces all the specified condition by provided replacement
 		String name = "H a r r y";
		System.out.println(name.replaceAll(" ", ""));
		System.out.println(name.replaceAll(" ", "/"));
		
		// split() - breaking string into multiple strings
		String location = "N e w Y o r k";
		String[] splitedLocation = location.split(" "); // stored as array
		// for loop will be used to get all the values
		
	
	}
	
	// 1st Assignment: 
//	1. practice all the methods of String manipulation
//	2. create different variables - registration functions
//	3. print output - create some sense using data manipulation methods

}
