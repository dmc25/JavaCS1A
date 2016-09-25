package week2;

import java.util.Scanner;

public class Assignment2_Program3 {

	public static void main(String[] args) {

		int positive = 0, negative = 0, num1 = 0;
		float total = 0, average = 0; int i;

		System.out.print("Enter an integer, the input ends if it is 0: ");
		Scanner input = new Scanner(System.in);
		num1 = input.nextInt();

		if(num1 != 0){
			for(i = 0; num1 != 0; i++){

				if(num1 > 0){
					int count = 1;
					positive += count;

				}
				else {
					int count = 1;
					negative += count;
				}
				total += num1;

				num1 = input.nextInt();
			}
			average = total/ i;

			System.out.println("The number of positives is " + positive);
			System.out.println("The number of negatives is " + negative);
			System.out.println("The total is " + total);
			System.out.println("The average is " + average);

		}
		else{
			System.out.print("No numbers are entered except 0");
		}

	}

}
