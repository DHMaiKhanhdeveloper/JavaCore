package practice.loop;

import java.util.Scanner;

public class DoWhileRandom {
	
	public static void random(Scanner scanner) {
		int nhap;
		int rand = (int) (Math.random()*99+1); // khác hoàn toàn (int) Math.random()*99 
		do {
			System.out.print("Moi ban nhap : ");
			nhap = Integer.parseInt(scanner.nextLine()); 
			if(nhap < rand ) {
				System.out.print(" Hãy nhap so lon hon ");
			}else {
				System.out.print(" Hãy nhap so nho hon ");
			}
		       
//		       System.out.println("Random Number:" + rand);
			}while(rand != nhap);
		
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		random(scanner);
	    
	}
	
	
}
