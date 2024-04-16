/**
 * 
 */
package com.kiran.hackathonAssignment;
import java.util.*;

/**
 *  Write a program to check palindrome (MalayalaM) for both numbers and string?
 *
 */
public class PallindromMalyalaM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A WORD : ");
		String word = sc.next();
		String originalword = word;
		int lengthoftheword = word.length();
		System.out.println(lengthoftheword);
		String reverseofword ="";
		for(int i=lengthoftheword-1;i>=0;i--) {
			reverseofword = reverseofword +word.charAt(i);
		}
		
		if(originalword.equals(reverseofword)) {
			System.out.println("it's a pallindrome");
		}else {
			System.out.println("it's not a pallindrome");                           
		}

	}

}
