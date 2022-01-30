package _00_Intro_To_ArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
    public static void main(String[] args) {
        // 1. Create an array list of Strings
        //    Don't forget to import the ArrayList class
    	ArrayList<String> list = new ArrayList<String>();
        // 2. Add five Strings to your list
    	list.add("A");
    	list.add("B");
    	list.add("C");
    	list.add("D");
    	list.add("E");
        // 3. Print all the Strings using a standard for-loop
    	for(int i=0; i<list.size(); i++) {
    		String x = list.get(i);
    		System.out.println(x);
    	}
        // 4. Print all the Strings using a for-each loop
    	for(String y : list) {   	
    			System.out.println(y);
    		}
    	
        // 5. Print only the even numbered elements in the list.
    	for(int i=0; i<list.size(); i++) {
    		if(i%2 == 0) {
    			System.out.println(i);
    		}
    	}
        // 6. Print all the Strings in reverse order.

        // 7. Print only the Strings that have the letter 'e' in them.
        
    }
}
