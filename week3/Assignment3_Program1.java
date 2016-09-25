package week3;

import java.util.Random;

public class Assignment3_Program1 {
	
	public static void main(String[] args) {
		
		randomCharacter();
		
		System.out.println("\n");
		randomNumber();
	}
	
	public static void randomCharacter(){
		
		Random rand1 = new Random();
		
		String s1 = "abcdefghijklmnopqrstuvwxyz";
		
		System.out.println("Random uppercase letters:" + "\n");
		
		for(int k = 0; k < 4; k++ ){
			for(int i = 0; i < 10; i++)			
				System.out.print(s1.toUpperCase().charAt(rand1.nextInt(s1.length()))+ " ");

			System.out.println();
		}
	}
	
	public static void randomNumber(){
		
		System.out.println("Random single digits: " + "\n");
		
		for(int k = 0; k < 4; k++){
			for(int i = 0; i < 10; i++)
				System.out.print((int)(Math.random() * 10) + " ");
			
			System.out.println();
		}
	}

}
