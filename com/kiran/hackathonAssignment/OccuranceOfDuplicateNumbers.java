/**
 * 
 */
package com.kiran.hackathonAssignment;
import java.util.*;

/**
 * @author krrac
 *
 */
public class OccuranceOfDuplicateNumbers {
	//5. Given an array prints the unique numbers 
	//and also
	//print the number of occurrences of duplicate numbers.


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("ENTER NUMBER OF ELEMENTS IN ARRAY :");
		int numberofelements = sc.nextInt();
		Scanner sc1 = new Scanner(System.in) ;
		System.out.println("ELEMENTS IN ARRAY :");
		int []array = new int[numberofelements];
		for(int i =0;i<numberofelements;i++) {
			array[i]=sc1.nextInt();
		}
			System.out.println(Arrays.toString(array));
			for(int i=0;i<numberofelements;i++) {
				for(int j=0;j<i;j++) {
					if(array[i]==array[j]) 
					//break;
					//if(i==j)
					//System.out.println("DUPLICATE ELEMENT IS :"+array[i]+"");*/
				for(int c : array) {
					if(array[i]==array[j]) {
						i++;
					}
					System.out.println(i);
				}
				}
			}
	}
}

