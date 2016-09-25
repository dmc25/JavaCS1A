package week2;

import java.util.Formatter;
import java.util.Scanner;

public class Assignment2_Program1 {

	public static void main(String[] args) {

		System.out.print("Enter a, b, c: ");
		Scanner input = new Scanner(System.in);

		//Gets inputs and signs to variable
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		//assigns the discriminant. 
		double discriminant = Math.pow(b, 2) - (4 * a * c);

		//check is discriminant is less than 0.
		if(discriminant < 0){
			System.out.println("The equation has no real roots.");
		}
		else{
			//Check if the discriminant is greater than 0.
			if(discriminant > 0){

				//Getting the roots of the 3 user input numbers
				double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
				double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);

				//format to 6 deciminal places.
				Formatter fmtX1 = new Formatter();
				fmtX1.format("%.6f", x1);

				//format to 6 deciminal places.
				Formatter fmtX2 = new Formatter();
				fmtX2.format("%.6f", x2);


				System.out.println("The equation has two roots " + fmtX1 + " and " + fmtX2);
			}
			else{

				//Getting the roots of the 3 user input numbers
				double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);

				////format to 6 deciminal places.
				Formatter fmtX1 = new Formatter();
				fmtX1.format("%.6f", x1);

				System.out.println("The equation has one root " + fmtX1);
			}
		}

	}

}
