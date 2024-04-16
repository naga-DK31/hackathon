/**
 * 
 */
package com.kiran.hackathonAssignment;
import java.util.*;

/**
 * @author krrac
 *2.write a program to find factorial (Non Recursive)
 */
public class NRFactorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int fact=1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER YOU WISH TO FIND THE FACTORIAL : " );
		int number = sc.nextInt();
		for(int i=1;i<=number ;i++) {
			 fact =fact*i;
		}
		System.out.println("FACTORIAL OF "+number+" is "+fact);
		
		// TODO Auto-generated method stub

	}

}
