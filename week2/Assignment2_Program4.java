package week2;

public class Assignment2_Program4 {

	public static void main(String[] args) {
		int div5 = 0, div6 = 0;
		int width = 0;

		for(int num1 = 100; num1 <= 200; num1++){

			div5 = num1 % 5; 
			div6 = num1 % 6;

			if((div5 == 0 && div6 != 0) || (div5 != 0 && div6 == 0)){
				System.out.print(num1 + " ");
				width++;				
			}	
			else{

			}
			if(width == 10){
				System.out.print("\n");
				width = 0;
			}
			else {

			}

		}

	}

}
