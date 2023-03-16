package practice.array;

import java.util.Scanner;

public class LietKeChuSoDauTienLaLe {

	final static int MAX = 1000;
	final static int MIN = -1000;
	
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
//			System.out.print(" a["+i+"] ");
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
	
	public static boolean KtraSoDauTienLe(int a) {
		boolean  flag ;
		a = Math.abs(a); // tri tuyet doi
		while (a >= 10) {
			a /=10 ;
		}
		if(a %2 ==0) {
			flag = false;
		}else {
			flag = true;
		}
		return flag;
	}
	
	public static void Lietke(int a[]) {
		System.out.println("Xuat mang 1 chieu so co chu so dau tien so le:");
		for(int pt: a) {
//			System.out.print(pt+ "\t");
			if(KtraSoDauTienLe(pt)) {
				System.out.print(pt+ "\t");
			}
		}
	}
	
	public static void main(String[] args) {
		int soLuong;
		Scanner scanner = new Scanner(System.in);
		soLuong = nhapSoLuongMang(scanner);
		int mang[] = nhapMang(soLuong,scanner);
		xuatMang(mang);
		System.out.println("\n");
		Lietke(mang);

	}

}
