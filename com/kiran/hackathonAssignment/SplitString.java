/**
 * 
 */
package com.kiran.hackathonAssignment;

/**
 * @author krrac
 *
 */
public class SplitString {

	/**how do we split String in java
	 * In java Split functions works to split the string using
	 *  .split()method with arguments giving reference to where to split .
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "kiranmayi";
		String[] splt = str.split("i");
		for(String s: splt) {
			System.out.println(s);
		}
	}
	}


