/**
 * 
 */
package com.kiran.hackathonAssignment;

import java.util.Arrays;
import java.util.*;

/**
 * 6. WJP to perform ascending order Selection sort


 *
 */
public class SortAcsending {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number of languages available in school : ");
		int lang = sc.nextInt();
		String[] array = new String[lang];
		System.out.println("NAME THE LANGUAGES ");
		for(int i=0;i<lang;i++) {
			array[i] = sc.next();
		}
		System.out.println("LIST : "+Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("PREFERENCE(Sorted) : "+Arrays.toString(array));

	}

}
