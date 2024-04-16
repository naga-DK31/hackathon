package com.kiran.hackathonAssignment;

public class Arthimetic {
	static int flipSign(int a) 
	{ 
	    int neg = 0; 
	    int tmp = a < 0 ? 1 : -1; 
	    while (a != 0) 
	    { 
	        neg += tmp; 
	        a += tmp; 
	    } 
	    return neg; 
	} 
	static boolean areDifferentSign(int a, int b) 
	{ 
	    return ((a < 0 && b > 0) || (a > 0 && b < 0)); 
	} 
	static int sub(int a, int b) 
	{ 
	    return a + flipSign(b); 
	} 
	
	static int mul(int a, int b) 
	{ 
	    if (a < b) 
	        return mul(b, a); 
	 
	    // Adding a to itself b times 
	    int sum = 0; 
	    for (int i = Math.abs(b); i > 0; i--) 
	        sum += a; 
	 
	    // Check if final sign must be -ve or + ve 
	    if (b < 0) 
	        sum = flipSign(sum); 
	 
	    return sum; 
	} 
	 
	// Function to divide a by b by counting  
	// how many times 'b' can be subtracted  
	// from 'a' before getting 0 
	static int division(int a, int b) 
	{ 
	    // Raise exception if b is 0 
	    if (b == 0) 
	        throw new ArithmeticException(); 
	 
	    int quotient = 0, dividend; 
	 
	    // Negating b to subtract from a 
	    int divisor = flipSign(Math.abs(b)); 
	 
	    // Subtracting divisor from dividend 
	    for (dividend = Math.abs(a); dividend >= Math.abs(divisor); 
	         dividend += divisor) 
	        quotient++; 
	    if (areDifferentSign(a, b)) 
	        quotient = flipSign(quotient); 
	    return quotient; 
	} 
	public static void main(String[] args) 
	{ 
	    System.out.println("Subtraction is " + sub(4, -2)); 
	    System.out.println("Product is " + mul(-9, 6)); 
	 
	    try
	    { 
	        System.out.println("Division is " + division(8, 2)); 
	    } 
	 
	    catch (ArithmeticException e) 
	    { 
	        System.out.println("Exception :- Divide by 0"); 
	    } 
	} 

}
