/**
 * 
 */
package com.kiran.hackathonAssignment;
import java.util.*;

/**
 * @author krrac
 *
 */
public class SubSequenceString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("testyour typing skills : ");
String str =sc.next();
CharSequence Substrseq =str.subSequence(3,10);
System.out.println("SubSequenceString : "+Substrseq);
	}

}
