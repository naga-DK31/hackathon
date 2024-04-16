/**
 * 
 */
package com.kiran.hackathonAssignment;
import java.util.*;

/**
 * @author krrac
 *1.Consider there is a 3 Boolean variable called a, b, c.
 * Check if at least two out of three Booleans are true


 */
public class Boolean {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("GIVE A BOOLEAN VALUE OF YOUR CHOICE 1 : ");
		boolean a = sc.nextBoolean();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("GIVE A BOOLEAN VALUE OF YOUR CHOICE 2 : ");
		boolean b = sc.nextBoolean();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("GIVE A BOOLEAN VALUE OF YOUR CHOICE 3 : ");
		boolean c = sc.nextBoolean();
		if (a==b) {
			System.out.println("VARIABLES OF A and B are same and it is  "+a);
		}else
		{
			System.out.println("one of the two variables are false");
		}if(b==c) {
			System.out.println("VARIABLE OF B and C are same and it is "+b);
		}else {
			System.out.println("both variables of B and C are different so ,"+b);
		}
	if(a==c) {
		System.out.println("VARIABLE OF A AND C ARE SAME AND IT IS ,"+c);
		
		

	}

}
}
