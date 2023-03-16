package practice.loop;

import java.util.Scanner;

public class ForBT2 {
	
	public static void TongChanFor(Scanner scanner) {
		int tong = 0;
		int nhap;
		System.out.print("Moi ban nhap : ");
		nhap = Integer.parseInt(scanner.nextLine()); 
		for(int i=0 ;i<=nhap;i++) {
			if(i%2==0) {
				tong = tong+i;
			}
		}
		System.out.print("Tong " +tong );
	}
	
	public static int TongChanFor2(Scanner scanner) {
		int tong = 0;
		int nhap;
		System.out.print("Moi ban nhap : ");
		nhap = Integer.parseInt(scanner.nextLine()); 
		for(int i=0 ;i<=nhap;i++) {
			if(i%2==0) {
				tong = tong+i;
			}
		}
		return tong;
	}
	
	public static void TongChanWhile(Scanner scanner) {
		int tong = 0;
		int i=0;
		int nhap;
		System.out.print("Moi ban nhap : ");
		nhap = Integer.parseInt(scanner.nextLine()); 
		while(i<nhap) {
			tong = tong+i;
			i+=2;
		}
		System.out.print(tong);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		TongChanFor(scanner);
		TongChanWhile(scanner);
	}
}
