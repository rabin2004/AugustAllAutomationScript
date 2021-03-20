package javaBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		// problems Array - dataType restriction/size restriction/less number of defined methods
		// Why ArrayList ? - no dataType restriction/size restriction/lot of defined methods
		
		ArrayList a = new ArrayList(); // warning -> do parametrized arraylist
		a.add("Java"); // add() => to insert value
		a.add(100);
		a.add(true);
		a.add('x');
		
//		System.out.println(a.get(2)); // get() => to get the value out
//		System.out.println(a.get(0));
//		System.out.println(a.size()); // size() => number of rows
		
//		for(int i=0; i<a.size(); i++) { // option 1 to traverse
//			System.out.print(a.get(i)+" ");
//		}
		
		ArrayList<String> b = new ArrayList<String>(); // parametrized arrayList
		b.add("Tom");
		b.add("John");
		b.add("Eva");
		
//		System.out.println(b.contains("Tommy")); // contains() = checking if present or not
//		System.out.println(b.contains("tom")); // sensitive to upper/lower case
		
		ArrayList<String> c = new ArrayList<String>(); // parametrized arrayList
		c.add("Tom");
		c.add("john");
		c.add("Eva");
		
//		System.out.println(b.equals("Eva")); // equals() => compares the array itself
//		System.out.println(b.equals(c)); // equals() => comparing 2 arrays - size/contents/position/upper-lowerCase
//		
//		System.out.println("Position of John is "+b.indexOf("John")); // indexOf()=> position of a value
		
		b.add("Jacky");
		b.add("Tom"); // duplicate can be added
		
//		for(String x: b) { // for each loop
//			System.out.print(x+" ");
//		}
//		
//		b.remove(4); // remove() => remove the value in the specific index
//		System.out.println("");
//		
//		for(String x: b) { // 2nd option to traverse
//			System.out.print(x+" ");
//		}
		
//		System.out.println(c.size());
//		c.removeAll(c); // removeAll() => removes all the value from the desired arrayList
//		System.out.println(c.size());
		
		//3rd option to traverse
		Iterator<String> it = b.iterator(); // traversing with the use of iterator
		System.out.println(it.next());
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
