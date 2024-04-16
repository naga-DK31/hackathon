/**
 * 
 */
package com.kiran.hackathonAssignment;
import java.util.*;

/**
 * @author krrac
 *4. Given an array of integers 
 *check the Palindrome of the series.


 */
public class IntegerPallindrome {

public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	System.out.println("Enter pallindrome Integer : ");
	int original=sc.nextInt();
	String Originalinteger =Integer.toString(original);
	int length=Originalinteger.length();
	String reverse="";
for(int i=length-1;i>=0;i--) {
	reverse = reverse + Originalinteger.charAt(i);
	//int reverseinteger1 = Integer.parseInt(reverse);
	//System.out.println("Integer in reverse : "+reverseinteger1);
}
if(Originalinteger.equals(reverse)) {
	System.out.println("GIVEN iNTEGER IS A PALLINDROME ");
}else
{
	System.out.println("NOT A PALLINDROME");
}

	}
}
