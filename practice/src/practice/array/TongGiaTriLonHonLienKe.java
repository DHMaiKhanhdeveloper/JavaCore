package practice.array;

import java.util.Scanner;

public class TongGiaTriLonHonLienKe {
	
	final static int MAX = 100;
	final static int MIN = -100;
	
	public static int TongLienKe(int a[]) {
		int tong =0;
		for(int i=1;i<a.length;i++) {
			if(a[i]>a[i-1]) {
				tong+= a[i];
				
			}
	}
	return tong;
}
	public static int nhapSoLuongMang(Scanner scanner) {
		int n;
		do {
			System.out.print("Moi ban nhap so luong mang  n>0  ");
			n = Integer.parseInt(scanner.nextLine()); 
		}while(n<0);
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

	public static void main(String[] args) {
		int soLuong;
		Scanner scanner = new Scanner(System.in);
		soLuong = nhapSoLuongMang(scanner);
		int a[] = nhapMang(soLuong,scanner);
		System.out.println("\n");
		xuatMang(a);
		System.out.println("\n");
		int tong =TongLienKe(a);
		System.out.println("\n");
		System.out.println("tong lien ke "+ tong);
	}
	
		

}
