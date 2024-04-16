package com.kiran.hackathonAssignment;

	import java.util.HashSet;
	import java.util.Set;
	import java.util.*;
	public class PrintUnique {
	    static void printWords(Set<String> set) {
	        for (String st: set) {
	            System.out.println(st);
	        }
	    }
	 
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter string : ");
	        // Input string
	        String str = sc.nextLine();
	 
	        // Storing string in the form of a set of words
	        Set<String> wordSet = new HashSet<>();
	        String[] words = str.split(" ");
	        for (String word : words) {
	            wordSet.add(word);
	        }
	 
	        printWords(wordSet);
	    }
	}


