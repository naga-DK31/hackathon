/**
 * 
 */
package com.kiran.hackathonAssignment;
import java.util.*;
public class FindDataType {
	static boolean isNumber(String st) {
		for(char c : st.toCharArray())
			 if (!Character.isDigit(c)) {
		return false;
			 }
		return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//23. WJP to differentiate input as string, int or bool
Scanner sc =new Scanner(System.in);
System.out.println("enter :");
String str = sc.nextLine();
boolean isNumber  = false;
System.out.println(str.isEmpty());
if (isNumber(str))
    System.out.println("Integer");
else
    System.out.println("String");
}
}
	

