/**
 * 
 */
package com.kiran.hackathonAssignment;

import java.util.Scanner;

/**
 * @author krrac
 *
 */
public class RevereseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A WORD :");
	String word = sc.nextLine();
	
	String reverseword="";
	int lengthofword = word.length();
	System.out.println("Size of the word " +lengthofword);
	for(int i=lengthofword-1;i>=0;i--) {
		reverseword = reverseword + word.charAt(i);
	}
		System.out.println("REVERSE OF "+ word +" is : "+ reverseword);
		
	}

	}


