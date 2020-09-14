package PalindromeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	@Test
	void testIsPalindrome() { //checks if it's a palindrome by a boolean
		String word = "ABBA";
		Palindrome palindrome = new Palindrome ();
		assertTrue(palindrome.isPalindrome(word)); //if the word is a palindrome, its true
	}
	
	@Test
	void testIsNotPalindrome() { //test fail with boolean
		String word = "Ketchup";
		Palindrome palindrome = new Palindrome ();
		assertTrue(palindrome.isPalindrome(word));
	}
	
}
