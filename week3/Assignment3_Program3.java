package week3;

import java.util.Scanner;

public class Assignment3_Program3 {

	public static void main(String[] args) {

		System.out.print("Please enter a sentence: ");
		Scanner input = new Scanner(System.in);
		
		String s1 = input.nextLine();
		
		if(isPalindrome(s1)  == true)
			System.out.println(reverse(s1) + " is a palindrome.");
		
		else
			System.out.println(reverse(s1) + " is not a palindrome.");

	}
	
	public static boolean isPalindrome(String sentence){
		
		sentence = sentence.toLowerCase().replaceAll("\\W", "");
		String s2 = reverse(sentence).replaceAll("\\W", "").toLowerCase();
		boolean boo1;
		
		if(s2.equals(sentence)){
			boo1 = true;
		}
		else{
			boo1 = false;
		}
		return boo1;	
	}
	
	public static String reverse(String s1){
		String s2 = "";
		
		for(int i = 0; i < s1.length(); i++){
			s2 = s1.charAt(i) + s2;
		}
		
		return s2;
		
	}

}
