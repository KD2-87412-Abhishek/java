package Assingment;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        
        String reverseString = "";
        System.out.println("Enter a new string: ");

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            
            reverseString =  s.charAt(i)+ reverseString;
        }

        System.out.println("Reverse String: " + reverseString);
    }
}
