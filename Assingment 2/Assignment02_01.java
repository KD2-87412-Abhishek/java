package com.sunbeam.assingment;

import java.util.Scanner;

public class Assignment02_1 {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			int number = sc.nextInt();
			System.out.println("Enter Number: "+number);
			int n = 20;
			System.out.println("Given number: "+n);
			System.out.println("Binary Equivalent: "+Integer.toBinaryString(n));
			System.out.println("Octal Equivalent: "+Integer.toOctalString(n));
			System.out.println("Hex Equivalent: "+Integer.toHexString(n));
		}
	}


