package Assingmnet3;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			invoice i1=new invoice(); 
			invoice i2=new invoice();
			
			Scanner sc = new Scanner(System.in);

		
			
			int choice = 0;
			// TODO Auto-generated method stub
			double totalBill = 0;

			while(choice != 4)
			{
				System.out.println("------Menu-------");
				System.out.println("1. Add items");
				System.out.println("2. Display items");
				System.out.println("3. Generate Bill");
				System.out.println("4. Exit");
				System.out.println("-----------------");

				System.out.println("Enter your choice: ");
				choice = sc.nextInt();
				
				switch (choice) 
				{

				case 1: 
						i1.accept();
						
				break;

				case 2: 
						
						i1.display();
				break;

				case 3: 
						System.out.println("-----------------------");
						totalBill += i1.totalBill();
						System.out.println("Your Bill:" +totalBill);
				break;

				case 4: 
						System.out.println("Your Bill:" +totalBill);
						System.exit(choice);
				break;
				
				}
			}
	}

}
