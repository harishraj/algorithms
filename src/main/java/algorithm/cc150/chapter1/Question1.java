package algorithm.cc150.chapter1;

import java.util.HashSet;
import java.util.Set;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 * 
 */
//      use an array to store, O(1) space and O(n) time
public class Question1 {
  public boolean allUnique(String strings) {
    boolean table[] = new boolean[256];
   
    for (int i = 0; i < strings.length(); ++i) {
      char ch = strings.charAt(i);
      if (table[ch] == true) {
        return false;
      }
      else {
        table[ch] = true;
      }
    }

    return true;
  }
  
  public boolean findUnique(String input) {
	  Set<Character> charSet = new HashSet<>();
	  char[] charInput = input.toCharArray();
	  for (char c : charInput) {
	       if (charSet.contains(c)) {
	    	   return false;
	       } else {
	    	   charSet.add(c);
	       }	   
	   }
	  return true;
  }
}

