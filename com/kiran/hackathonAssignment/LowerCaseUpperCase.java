/**
 * 
 */
package com.kiran.hackathonAssignment;
import java.util.*;

/**
 * @author krrac
 *
 */
public class LowerCaseUpperCase {
	//8. How can we make String upper case to lower case
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A sTRING : ");
		String str = sc.next();
		String str1 = str.toUpperCase();
		System.out.println(str1);
		System.out.println("we use .toUpperCase method to convert lowercase letters in a string to upperCase letters");
		String str2 = str.toLowerCase();
		System.out.println(str2);
		System.out.println("we use .toLowerCase method to convert upperrcase letters in a string to LowerCase letters");
		
		

	}

}
