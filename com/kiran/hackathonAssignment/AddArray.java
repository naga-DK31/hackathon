/**
 * 
 */
package com.kiran.hackathonAssignment;
import java.util.*;
import java.io.*;

public class AddArray {

	/**
	 * 26. WJP to merge two sorted array.
	 * (Do not use third array) array1[10] = 1,2,4,6,9,10 
	 * array2[4] = 3, 5,7,8 
	 * After merge : array1[10] = 1,2,3,4,5,6,7,8,9,10


	 */
	
	public static void mergeArrays(int[] arr1, int[] arr2, int n1,
            int n2, int[] arr3)
{
int i = 0, j = 0, k = 0;

// Traverse both array
while (i<n1 && j <n2)
{
// Check if current element of first
// array is smaller than current element
// of second array. If yes, store first
// array element and increment first array
// index. Otherwise do same with second array
if (arr1[i] < arr2[j])
arr3[k++] = arr1[i++];
else
arr3[k++] = arr2[j++];
}

// Store remaining elements of first array
while (i < n1)
arr3[k++] = arr1[i++];

// Store remaining elements of second array
while (j < n2)
arr3[k++] = arr2[j++];
}

public static void main (String[] args) 
{
int[] arr1 = {1,2,4,6,9,10}; 
int n1 = arr1.length;

int[] arr2 = {3, 5,7,8}; 
int n2 = arr2.length;

int[] arr3 = new int[n1+n2];

mergeArrays(arr1, arr2, n1, n2, arr3);

System.out.println("Array after merging");
for (int i=0; i < n1+n2; i++)
System.out.print(arr3[i] + " ");
}
}