package com.app.fruits;

import java.util.Scanner;

public class Fruitbasket {
	

	public static void main(String[] args) {
		int choice=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size= sc.nextInt();
		fruit[] f1 = new fruit[size];
		int counter=0;
//		if(size>counter) {
//			
//		}
		
	  
		
		
		while(choice != 9)
		{
			System.out.println("------Menu-------");
			System.out.println("1. Add MAngo ");
			System.out.println("2. Add MAngo ");
			System.out.println("3. Add MAngo ");
			System.out.println("4. Display items");
			System.out.println("5. Display proprty");
			System.out.println("6. Display stale fruit  ");
			System.out.println("7. make fruit as stale");
			
			
			System.out.println("-----------------");

			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch (choice) 
			{

			case 1: //Add  Mango()
				if(counter<size) {
				 f1[counter]=new Mango();

				 f1[counter].accept(sc);
				 counter++;
//				 System.out.println("mango");
				 break;
				}
				else {
					System.out.println("full");
					break;
				}
					
					
		

			case 2: //Add Apple()
				if(counter<size) {
				f1[counter]=new Apple();
//				 System.out.println("Apple");
				 f1[counter].accept(sc);
				 counter++;
				
				 break;
				 }
				else {
					System.out.println("full");
					break;
				}
					
			

			case 3: //Add Orange()
				if(counter<size) {
					f1[counter]=new orange();
//					 System.out.println("Apple");
					 f1[counter].accept(sc);
					 counter++;
					 break;
					 }
					else {
						System.out.println("full");
						break;}
				
				

			case 4: // display the name of all 
				for (int i=0;i<counter;i++)
				
					System.out.println(f1[i].getName());
				break;
					
					
				
				
			case 5:// display name ,color , weight , of each
				for (fruit ele : f1) 
					if(ele!=null) {
						System.out.println(ele.toString());
					}
				break;
				
			case 6:// display taste of all stale fruit 
				for (fruit ele : f1) { 
					if(ele!=null) {
							
								if(ele.isFresh==false) {
									System.out.println(ele.getName());
									break;
							
						}
					}
					}
				
				
			break;
			case 7://mark a fruit as stale 
				System.out.println("enter the no of fruit you want stale ");
					 int no=sc.nextInt();
					 f1[no-1].setFresh(false);
					 break;
				
			
			}
		}		
	}

	}


