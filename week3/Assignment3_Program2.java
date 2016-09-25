package week3;

import java.util.Scanner;

public class Assignment3_Program2 {

	public static void main(String[] args) {
		
System.out.print("Please enter an integer:");
		
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		
		System.out.print("Its reversal is " + isNegative(num1));
		
		reverse(num1);
		

	}
	public static void reverse(int number){
		
		number = Math.abs(number);
		String s1 = Integer.toString(number);
		
		String s2 = "";
		
		for(int i = 0; i < s1.length(); i++ ){
						
			s2 = s1.charAt(i) + s2; 			
		}
		
		System.out.print(s2);
		
	}
	
	public static char isNegative(int number) { 
		
		char c1 = '\0';
		if(number < 0){
			 c1 = '-';
		}
		
		return c1;
			
	}

}
