package com.kiran.hackathonAssignment;
import java.util.*;

public class Question24 {

	public static void main(String[] args) {
// 24. Write a program which inputs a positive natural number N 
		//and prints the possible consecutive number combinations, 
		//which when added give N.   INPUT: N = 9  OUTPUT: 4 + 5     2 + 3+ 4
		Scanner sc = new Scanner(System.in);
		System.out.println("NUMBER : ");
		int n = sc.nextInt();
		for(int i=1;i<=n/2;i++) {
int sum=0,x=i;
String s="";
while(sum<n) {
	sum=sum+x;
	s=s+x+"+";
	x++;
}
if(sum==n) {
	System.out.println(s.substring(0,s.length()-1));
}
	
}
	


	}

}
