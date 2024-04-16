/**
 * 
 */
package com.kiran.hackathonAssignment;
import java.util.*;

/**
 * @author krrac
 *
 */
public class SortArrayIntegers {

	/**
	 * 3.Given an array of integers, sort the integer values.


	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NMBER OF ELEMENTS YOU WISH TO HAVE  IN ARRAY : ");
		int n = sc.nextInt();
        System.out.println("ENTER THE ELEMENTS : ");
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("ARRAY INTEGERS");
		for(int i=0;i<n;i++) {
			System.out.print(+array[i]+",");
		}
		System.out.println("");
System.out.println("SORT THE ARRAY : ");
Arrays.sort(array);

System.out.println(Arrays.toString(array));
	}

}
