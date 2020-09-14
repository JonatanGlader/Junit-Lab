package PalindromeTest;

import java.util.ArrayList;

public class Palindrome {

	public boolean isPalindrome(String word) {
		ArrayList<StringBuilder> words = new ArrayList<>();
		words.add(new StringBuilder(word));
		words.add(new StringBuilder(word).reverse());
		return words.get(0).toString().equalsIgnoreCase(words.get(1).toString());
    }
}
