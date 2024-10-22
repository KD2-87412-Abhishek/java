package Assingment;

import java.util.Scanner;

public class palidrome {
	 public static void main(String[] args) {
	        
	        String reverseString = "";
	        System.out.println("Enter a new string: ");
	       boolean bool=true;

	        Scanner sc = new Scanner(System.in);
	        String s = sc.next();

	        for (int i = 0; i < s.length(); i++) {
	        	System.out.println(i);
	        	System.out.println(s.length());
	        	
	            
	            if( s.charAt(i)==s.charAt((s.length()-1)-i)) {
	            	bool=true;	
	         }
	            else 
	            	bool=false; 

	    }
	        if (bool==true)
	        	 System.out.println("paidrome");
	        else 
	        	System.out.println("not palidrome");
	}

}
