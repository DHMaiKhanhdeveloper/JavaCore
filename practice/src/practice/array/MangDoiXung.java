package practice.array;

import java.util.Scanner;

public class MangDoiXung {
	
	public static int nhapSoLuongMang(Scanner scanner) {
		int n;
		do {
			System.out.print("Moi ban nhap so luong mang  n>0 a n so chan ");
			n = Integer.parseInt(scanner.nextLine()); 
		}while(n<0 && n%2==0);
		return n;
	}
	
	public static int[] nhapMang(int n,Scanner scanner) {

		int a[] = new int[n];
		System.out.println("Nhap mang 1 chieu");
		for(int i=0;i<n;i++) {
			System.out.print(" a["+i+"] ");
			a[i] = Integer.parseInt(scanner.nextLine()); 
			
		}
		return a;
	}

	
	public static void xuatMang(int a[]) {
		System.out.println("Xuat mang 1 chieu cach 2");
		for(int pt: a) {
			System.out.print(pt+ "\t");
		}
	}
	
	public static boolean kTraMangDoiXung(int a[]) {
		
		for(int i  =0 ;i<a.length/2;i++) {
				if(a[i] == a[a.length-1-i]) {
					return true;
			}
		}
	return false;
	
	}

	public static void main(String[] args) {
		int soLuong;
		Scanner scanner = new Scanner(System.in);
		soLuong = nhapSoLuongMang(scanner);
		int a[] = nhapMang(soLuong,scanner);
		System.out.println("\n");
		xuatMang(a);
		System.out.println("\n");
		boolean mang =kTraMangDoiXung(a);
		if(mang) {
			System.out.print("Mang doi xung");
		}else {
			System.out.print("Mang khong doi xung");
		}

	}

}
