/**
 * 
 */
package com.kiran.hackathonAssignment;

 //*25. Write a program for binary search. And 5 i/p has to take from user as binary elements.
 
 public class Binary5 {

			 public static void binarySearch(int arr[], int first, int last, int key){
			   int mid = (first + last)/2;
			   while( first <= last ){
			      if ( arr[mid] < key ){
			        first = mid + 1;   
			      }else if ( arr[mid] == key ){
			        System.out.println("Element is found at index: " + mid);
			        break;
			      }else{
			         last = mid - 1;
			      }
			      mid = (first + last)/2;
			   }
			   if ( first > last ){
			      System.out.println("Element is not found!");
			   }
			 }
			 public static void main(String args[]){
					int arr[] = {1,20,3,4,50};
					int key = 50;
			        int last=arr.length-1;
					binarySearch(arr,0,last,key);	
			 }
				}

