package Assingment;

import java.util.Scanner;

public class Exception {

	

	public static void main(String[] args) throws ExceptionlineTooLong  {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the string ");
		
		
		String s=sc.next();
		if(s.length()>10) {
			 throw  new ExceptionlineTooLong(" the line is too long ");
		}
	
		
		// TODO Auto-generated method stub

	}
}

	