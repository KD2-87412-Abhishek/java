package day09;

import java.util.*;
class StudNameComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
class studCityComperator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// 
		return o1.getCity().compareTo(o2.getCity());
	}
	
}
class studmarksComperator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		 
		return Double.compare(o2.getMarks(), o1.getMarks());
	}
	
}
public class Assingment07 {
	
	
	
	static Scanner sc= new Scanner(System.in);
	public static int  menu() {
		
		System.out.println("0. EXIT");
		System.out.println(" ");
		System.out.println("1. Display Student Sorted on city asc");
		System.out.println("2. Display Student Sorted on marks");
		System.out.println("3. Display Employees Sorted on name");
		System.out.println("4. Display Student Sorted on rollno");
		return  sc.nextInt();
		
	}
		
		
		
		
	
public static void main(String[] args) {
	
 
int choice;	
		Comparator<Student> comparator;
	Student[] s1 = new Student[3];
	s1[0]= new Student(1,"abhi","pat",50);
	s1[1]= new Student(2,"mak","pune",60);
	s1[2]= new Student(3,"adi","mp",70);
	
	while ((choice=menu())!=5) {
		
		
	
		switch (choice) {
		
		case 1://sorted on their city
			comparator= new studCityComperator();
			Arrays.sort(s1,comparator);
			break;
		case 2://sorted on their marks
			comparator= new studmarksComperator();
			Arrays.sort(s1,comparator);
			break;
		case 3:// sorted on their name
			comparator= new StudNameComparator();
			Arrays.sort(s1,comparator);
			break;
		case 4:Arrays.sort(s1);
			break;
		case 5://sorted on the rollno
			 System.exit(0);
			
			break;
			
		default:
			
			
			break;
		}
		for (Student i : s1) {
			System.out.println(i);
	 }
	}
	}	

}

