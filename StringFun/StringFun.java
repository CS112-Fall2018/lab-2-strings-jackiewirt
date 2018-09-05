/**
 * Two methods I picked:
 * s.hashCode(): Returns a hash code for the string. Saves the string as a number instead of characters. Each string is unique and cannot be decoded once it's encoded.
 * s.isEmpty(): Will return True if length of string is 0. If there is characters in the string, it will return False.
 */

public class StringFun {
	public static void main (String[] args) {
		
		if(args.length<3){
			System.out.println("Enter another string.");
			return;
		}

		String s = args[0];
		String otherString = args[1];
		String subString = args[2];
		System.out.println("String assigned to s: " + s);
		System.out.println("String assigned to otherString: " + otherString);
		System.out.println("String assigned to subString: " + subString);


		System.out.println("Results:");
		System.out.println("Lenth of String: " + s.length());
  		System.out.println("Test for matching S to otherString: " + s.equals(otherString));
    	System.out.println("Test for part of string from 0-3: " + s.substring(0, 3));
    	System.out.println("Elminate whitespaces at start and end: " + s.trim());
    	System.out.println("Search for subString in S: " + s.indexOf(subString));
    	System.out.println("Search for substring in S starting at the end: " + s.lastIndexOf(subString));
    	System.out.println("Exctract character at 4: " + s.charAt(4));
      	System.out.println("Hash Code: " + s.hashCode());
      	System.out.println("If line is empty: " + s.isEmpty());


	}
}