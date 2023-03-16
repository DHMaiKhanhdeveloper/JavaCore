package practice.ThuatToanTimKiem;

import java.util.Scanner;

public class TimKiemDoanMaxMin {
	final static int MAX = 100;
	final static int MIN = -100;
	
	public static int nhapSoLuongMang(Scanner scanner) {
		int n;
		do {
			System.out.print("Moi ban nhap so luong mang  n>0 ");
			n = Integer.parseInt(scanner.nextLine()); 
		}while(n<0 );
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
	
	public static void xuatMangC1(int a[]) {
		System.out.println("Xuat mang 1 chieu cach 1");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ "\t");
		}
		System.out.println();
	}
	
	public static void TimDoanChuaPhanTu(int a[]) {
		int indexMax =0 ;
		int indexMin =0 ;
		for(int i=0;i<a.length;i++) {
			if(a[i] > a[indexMax]) {
				indexMax = i;
			}
			else if(a[i] < a[indexMin]) {
				indexMin = i ;
			}
		}
		System.out.println("Tim Doan Chua Phan Tu ( "+ a[indexMin] +","+a[indexMax]+" )" );
	}


	public static void main(String[] args) {
		int soLuong;
		Scanner scanner = new Scanner(System.in);	
		soLuong = nhapSoLuongMang(scanner);
		int a[] = nhapMang(soLuong,scanner);
		System.out.println("\n");
		xuatMangC1(a);
		TimDoanChuaPhanTu(a);
	}
}
