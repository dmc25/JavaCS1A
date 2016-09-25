package week2;

import java.util.Scanner;

public class Assignment2_Program2 {

	public static void main(String[] args) {

		int biggest, middle, smallest;
		System.out.print("Enter 3 integers: ");
		Scanner input = new Scanner(System.in);

		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();


		boolean boo1 = num1 > num2;
		boolean boo2 = num1 > num3;
		boolean boo3 = num2 > num1;
		boolean boo4 = num2 > num3;
		boolean boo5 = num3 > num1;
		boolean boo6 = num3 > num2;


		if(boo1 && boo2){
			biggest = num1;
			if(boo4){
				middle = num2;
				smallest = num3;
			}
			else{
				middle = num3;
				smallest = num2;
			}
		}
		else if(boo3 & boo4){
			biggest = num2;
			if(boo5){
				middle = num3;
				smallest = num1;
			}
			else{
				middle = num1;
				smallest = num3;
			}
		}
		else{
			biggest = num3;
			if(boo6 && boo1){
				middle = num1;
				smallest =num2;
			}
			else{
				middle = num2;
				smallest = num1;
			}
		}

		System.out.println(smallest + " " + middle + " " + biggest);



	}

}
