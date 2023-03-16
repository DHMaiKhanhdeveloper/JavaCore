package practice.loop;

import java.util.Scanner;

public class ForBT3Dem {
	public static int Dem(Scanner scanner) {
		int dem =0;
		int nhap;
		System.out.print("Moi ban nhap : ");
		nhap = Integer.parseInt(scanner.nextLine()); 
		
		for(int i=0 ;i<=nhap;i++) {
			if(i%3==0) {
				dem++;
			}
		}
		return dem;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dem = Dem(scanner);
		System.out.print("dem: "+dem);
	}
}
