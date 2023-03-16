package practice.array;

import java.util.Scanner;

public class LietKeSoNgauNhien {
	
	final static int MAX = 100;
	final static int MIN = -100;
	public static int nhapSoLuongMang(Scanner scanner) {
		int n;
		do {
			System.out.print("Moi ban nhap so luong mang  n>0 va n so chan: ");
			n = Integer.parseInt(scanner.nextLine()); 
		}while(n<0 || n%2!=0);
		return n;
	}
	
	public static int[] nhapMang(int n,Scanner scanner) {

		int a[] = new int[n];
		System.out.println("Nhap mang 1 chieu");
		for(int i=0;i<n;i++) {
			System.out.print(" a["+i+"] ");
			a[i] = MIN +(int) (Math.random()*((MAX-MIN)+1));
			
		}
		return a;
	}

	
	public static void xuatMang(int a[]) {
		System.out.println("Xuat mang 1 chieu cach 2");
		for(int pt: a) {
			System.out.print(pt+ "\t");
		}
	}
	
	public static void Lietke(int a[],Scanner scanner) {
		int x,y;
		System.out.print("Moi ban nhap gioi han duoi : ");
		x = Integer.parseInt(scanner.nextLine()); 
		System.out.print("Moi ban nhap gioi han tren : ");
		y = Integer.parseInt(scanner.nextLine()); 
		System.out.println("Xuat mang trong gioi han liet ke: ");
		for(int pt: a) {
		    if(pt>=x && pt<=y) {
		    	System.out.print(pt+ "\t");
		    }
		}
		
	}
	
	public static void main(String[] args) {
		int soLuong;
		Scanner scanner = new Scanner(System.in);	
//		System.out.print("Moi ban nhap : ");
//		n = Integer.parseInt(scanner.nextLine()); 
		soLuong = nhapSoLuongMang(scanner);
		int a[] = nhapMang(soLuong,scanner);
		System.out.println("\n");
		xuatMang(a);
		System.out.println("\n");
		Lietke(a,scanner);
	}
}
