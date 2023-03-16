package practice.basic;


import java.util.Scanner;

public class Model3Block {

	public static void main(String[] args) {
		
		int tong =0;
		int donvi, chuc, tram;
		Scanner input = new Scanner(System.in);
		
		int number1;
		// c2 int number1 = Integer.parseInt(input.nextLine());
		do {
			System.out.print("Enter an integer: ");
			number1 = input.nextInt();
		}while(number1 > 1000);
		if(number1 >=100 && number1 < 1000  ) {
				  donvi = number1%10;
				  chuc = (number1/10)%10;
				  tram = number1/100;
				  tong =   chuc + donvi+tram;
				System.out.println("Tong = " + tong);
			      
		  }


	}

}
