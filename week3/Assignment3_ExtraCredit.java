package week3;

import java.util.Scanner;

public class Assignment3_ExtraCredit {

	public static void main(String[] args) {
		
		System.out.print("Please enter a sentence: " );
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			String s1 = input.next();
			
			s1 = translate(s1);
			
			System.out.print(s1 + " ");
		}
	}
	
	public static String translate(String s1){
		
		constants();
		vowels();
		
		for(int i = 0; i < vowels().length(); i++){
			if(s1.charAt(0) == vowels().charAt(i)){
				
				char temp = s1.charAt(0);
					
				s1 = s1.substring(1) + temp;
				return s1;
			}
						
		}
		for(int i = 0; i < constants().length(); i++){
			
			String temp2 = s1.toLowerCase();
			if(temp2.charAt(0) == constants().charAt(i)){
				char temp = s1.charAt(0);
				
				if(temp > 65 && temp < 90){
					s1 = s1.substring(1).concat(String.valueOf(temp)).concat("AE");
				}
				else
					s1 = s1.substring(1).concat(String.valueOf(temp)).concat("ae");
				break;
			}
		}
		
		return s1;
		
	}
	
	public static String vowels(){
		String vowel = "aeiou";
		
		return vowel;
	}
	
	public static String constants(){
		String constant = "bcdfghjklmnpqrstvwxyz";
		
		return constant;
	}

}
