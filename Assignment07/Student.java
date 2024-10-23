package day09;
import java.util.*;


public class Student implements Comparable <Student>{
	private int rollno;
	private String Name;
	 private String city;
	
	private double marks;

	public Student(int rollno, String name, String city, double marks) {
		this.rollno = rollno;
		Name = name;
		this.city = city;
		this.marks = marks;
	}

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return Name;
	}

	public String getCity() {
		return city;
	}

	public double getMarks() {
		return marks;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", Name=" + Name + ", city=" + city + ", marks=" + marks + "]";
	}

	public Student() {
	}

//	@Override
//	public int compareTo(Student obj) {
//		
//		return this.rollno - obj.rollno ;
//		// TODO Auto-generated method stub
//		
//	}

//	public int compareTo(Student o) {
//		// TODO Auto-generated method stub
//		return this.rollno -  o.rollno ;
//	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.rollno -  o.rollno;
	}

	
	
	
	
						
	
	
	

}
