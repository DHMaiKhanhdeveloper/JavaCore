package practice.array;

import java.util.Scanner;

public class ThemMangVaoViTriBatKi {

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
	
	public static int[] themMang(int a[],Scanner scanner) {
		int k;
		do {
			System.out.print("Moi ban nhap vi tri them bat ki  ");
			k = Integer.parseInt(scanner.nextLine()); 
		}while(k<0 && k>a.length);
		int b[] = new int[a.length+1];
		System.out.print("Moi ban nhap gia tri bat ki  ");
		int x = Integer.parseInt(scanner.nextLine());
		for(int i=0;i<b.length;i++) {
			if(i<k) {
				b[i] = a[i];
			}else if(i==k) {
				b[i] = x;
			}else if(i>k){
				b[i] = a[i-1];
			}
		}
		a = b; // sao chép mảng gán b sang mảng chính a
		
		return a;
	}
	
	public static void main(String[] args) {
		int soLuong;
		Scanner scanner = new Scanner(System.in);
		soLuong = nhapSoLuongMang(scanner);
		int a[] = nhapMang(soLuong,scanner);
		System.out.println("\n");
		xuatMang(a);
		System.out.println("\n");
		a = themMang(a,scanner);
		System.out.println("\n" );
		xuatMang(a);

	}

}
