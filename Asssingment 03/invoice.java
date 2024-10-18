package Assingmnet3;

import java.util.Scanner;

public class invoice {
	Scanner sc=new Scanner(System.in);
	
	private String Partno;
	private	int quantity;
	private	double price;
	private String Parttype;
	public String getPartno() {
		return Partno;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getPrice() {
		return price;
	}
	public String getParttype() {
		return Parttype;
	}
	public void setPartno(String partno) {
		Partno = partno;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setParttype(String parttype) {
		Parttype = parttype;
	}
	 public void accept() {
		 System.out.println(" enter the part no");
		 Partno=sc.next();
		 System.out.println(" enter the part quantity");
		 
		 quantity=sc.nextInt();
		 if(quantity<0) {
			 System.out.println("enter real quantity");
			 		quantity=0;
		 }
		 System.out.println(" enter the part price");
		 price=sc.nextDouble();
		 if(price<0) {
			 System.out.println("enter real quantity");
			  price=0;
		 }
		 System.out.println(" enter the parttype ");
		 Partno=sc.next();
	 }
	
	 public double totalBill() {
		 double amt;
		 amt= price *quantity;
		 
		 return amt;
		 
	 }
	public invoice(String partno, int quantity, double price, String parttype) {
		Partno = partno;
		this.quantity = quantity;
		this.price = price;
		Parttype = parttype;
	}
		
		public invoice() {
			Partno = "no";
			this.quantity =0;
			this.price = 0;
			Parttype = "no";
		
	}
		 public void display() {
			 
			 System.out.println(" 3your partno "+Partno+ " parttype "+Parttype);
		
		 }

}
