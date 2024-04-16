/**
 * 
 */
package com.kiran.hackathonAssignment;
import java.io.*;
import java.util.*;
 
public class RecurrsiveFactorial {
		    static int factorial(int n)
		    {
		        if (n == 0 || n == 1)
		            return 1;
		        return n * factorial(n - 1);
		    }
		    public static void main(String[] args)
		    {
		 
		        int ans1 = factorial(0);
		        int ans2 = factorial(1);
		 		        System.out.println("Factorial of 0 is : " + ans1);
		 
		        System.out.println("Factorial of 1 is : " + ans2);
		    }
}
