package week2;

import java.util.Scanner;

public class Assignment2_Program5 {

	public static void main(String[] args) {
		
		int remainder;
		String s1 = "";
		
		System.out.print("Enter a number: ");
		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();
		
		while(num1 != 0){
			
			remainder = num1 % 2;
			num1 = num1 / 2;
			
			s1 = Integer.toString(remainder).concat(s1);
		}
		System.out.println(s1);

	}

}
