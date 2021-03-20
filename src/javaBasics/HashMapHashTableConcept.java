package javaBasics;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapHashTableConcept {

	public static void main(String[] args) {
		// HashMap - keeps data in key & value pair
		// one null key and multiple null value allowed
		// duplicate values are also allowed
		
//		Hashmap vs Hashtable
//		1. HashMap is non synchronized. It is not-thread safe and can’t be shared between many threads without proper synchronization code whereas Hashtable is synchronized. It is thread-safe and can be shared with many threads.
//		2. HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.
//		3. HashMap is generally preferred over HashTable if thread synchronization is not needed
//
//		Why HashTable doesn’t allow null and HashMap does?
//		To successfully store and retrieve objects from a HashTable, the objects used as keys must implement the hashCode method and the equals method. Since null is not an object, it can’t implement these methods. HashMap is an advanced version and improvement on the Hashtable. HashMap was created later.

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "java"); // put() - inserting key & values
		hm.put(5, "selenium");
		hm.put(3, "testNg");
		hm.put(9, "cucumber"); // values gets inserted according to hashCode of key
		
//		System.out.println("Size of hashMap: "+hm.size());
//		System.out.println("Value pointed by key-3: "+hm.get(3)); // 3 is not an index but a key
		
//		System.out.println("Entry set of hashMap: "+hm.entrySet()); // entrySet() - return key-value stored in hashMap
//		System.out.println("KeySet of hashMap: "+hm.keySet()); // keySet() - returning keys available in hashMap
		
		hm.put(null, "Maven");
//		System.out.println("Entry set of hashMap: "+hm.entrySet());
//		System.out.println(hm.get(null));
		hm.put(null, "Appium"); // same key doesn't matter null if repeated will replace value
//		System.out.println("Entry set of hashMap: "+hm.entrySet());
		hm.put(9, "Jira");
//		System.out.println("Entry set of hashMap: "+hm.entrySet());
		
		hm.put(null, null);
		hm.put(10, null);
		hm.put(11, null); // duplicate value is acceptable doesn't matter that is null
//		System.out.println(hm.size());
//		System.out.println("Entry set of hashMap: "+hm.entrySet());
		
//		System.out.println("If null key present: "+hm.containsKey(null)); // containsKey - checking if key is present or not
//		System.out.println("If java is present: "+hm.containsValue("Java")); // containsValue - checking value present or not - upper/lower case sensitive
//		
//		System.out.println(hm.hashCode());
		hm.remove(null); // remove() - will remove value pointed by that specific key
//		System.out.println("Entry set of hashMap: "+hm.entrySet());
		hm.replace(10, "HP-ALM"); // replace() - will replace value from the specific key provided
//		System.out.println("Entry set of hashMap: "+hm.entrySet());
//		
//		System.out.println("All values in hashMap: "+hm.values()); // values() - wil return all the values only
		
		//option 1 to traverse through hashMap
//		Iterator<Integer> it = hm.keySet().iterator();
//		while(it.hasNext()) {
//			int key = it.next();
//			String value = hm.get(key);
//			System.out.print(value+" || ");
//		}
		
		// option 2
//		Iterator<Entry<Integer, String>> it1 = hm.entrySet().iterator();
//		while(it1.hasNext()) {
//			Entry<Integer, String> entry = it1.next();
//			int key = entry.getKey();
//			String value = entry.getValue();
//			System.out.println("Key is "+key+" and value pointed is "+value);
//		}
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "Tom");
		ht.put(2, "Jerry");
		ht.put(3, "Henry");
		System.out.println(ht.entrySet());
//		System.out.println(ht.keySet());
		
//		ht.put(null, null); // NullPointerException -  key & value null is not allowed in HashTable
//		ht.put(null, "John"); //NullPointerException: Cannot invoke "Object.hashCode()" because "key" is null
//		ht.put(5, null); // NullPointerException - value null is not aloowed in HashTable
		System.out.println(ht.entrySet());

	}

}
