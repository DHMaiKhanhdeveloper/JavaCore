package practice.array;

import java.util.Scanner;

public class XoaViTriPhanTu {
	
	final static int MAX = 100;
	final static int MIN = -100;
	
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
	
	
	
	public static int[] xoaViTriMang(int a[],Scanner scanner) {
		int b[] = new int[a.length-1];
		int n;
		do {
			System.out.print("Moi ban nhap so luong mang  n>0  ");
			n = Integer.parseInt(scanner.nextLine()); 
		}while(n<0 && n>a.length );
		
		for(int i=0 ,j =0;i<b.length;i++,j++) {
			if(j== n) {
				j++;
			}
			b[i] = a[j];
		}
		a=b;
		return a;
	}
	
	public static void main(String[] args) {
		int soLuong ;
		Scanner scanner = new Scanner(System.in);	
		soLuong =  nhapSoLuongMang(scanner);
		int a[] = nhapMang(soLuong,scanner);
		System.out.println("\n");
		xuatMang(a);
		System.out.println("\n");
		a = xoaViTriMang(a,scanner);
		System.out.println("\n");
		xuatMang(a);
	}
}
