package week3;

import java.util.Scanner;

public class Assignment3_Program4 {

	public static void main(String[] args) {
		
		System.out.print("Please enter a password: ");
		Scanner input = new Scanner(System.in);
		
		String password = input.nextLine();
		
		isValid(password);

	}
public static boolean isLength(String s1){
		
		boolean boo =  false;
		if(s1.length() >= 8){
			boo = true;
		}
		
		return boo;
	}
	
	public static boolean punctuation(String s1){
		boolean boo = true;
		int count = 0;
		
		String punct = "!@#$%";
		
		for(int i = 0; i < s1.length(); i++){
									
			int length = punct.length();
			
			for (int j = 0; j < length;  j++){
				if(s1.charAt(i) == punct.charAt(j)){
					count = count + 1;
				}
						
			}
			
		}
		if(count > 1)
			boo = false;
		
	return boo;	
	}
	
	public static boolean letters(String s1){
		boolean boo = false;
		
		int count = 0;
		
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		for(int i = 0; i < s1.length(); i++){
			
			char s2 = s1.charAt(i);
			
			for (int j = 0; j < letters.length(); j++){
				if(s2 == letters.charAt(j)){
					count = count + 1;
				}
							
			}
		}
		
		if(count >= 1){
			boo = true;
		}
			
	return boo;
	}
	
	public static boolean hasNumber(String s1){
		boolean boo = true;
		
		int count = 0;
		
		String letters = "1234567890";
		
		for(int i = 0; i < s1.length(); i++){
			
			char s2 = s1.charAt(i);
			
			for (int j = 0; j < letters.length(); j++){
				
				if(s2 == letters.charAt(j))
					count = count + 1;
			}
		}
		
		if(count < 2){
			boo = false;
		}
			
	return boo;
	}

	public static void isValid(String s1){
		
		if((hasNumber(s1) && letters(s1) && punctuation(s1) && isLength(s1)) == true)
			System.out.println("VALID Password");
		
		else
			System.out.print("INVALID Password");
		
		
	}

}
