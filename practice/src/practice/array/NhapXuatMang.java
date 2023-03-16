package practice.array;

import java.util.Scanner;

public class NhapXuatMang {
	
	public static int[] nhapMang(int n,Scanner scanner) {
		int a[] = new int[n];
		System.out.println("Nhap mang 1 chieu");
		for(int i=0;i<n;i++) {
			System.out.print(" a["+i+"] =");
			a[i] = Integer.parseInt(scanner.nextLine()); 
			
		}
		return a;
	}
	
	public static void xuatMangC1(int a[]) {
		System.out.println("Xuat mang 1 chieu cach 1");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ "\t");
		}
	}
	
	public static void xuatMangC2(int a[]) {
		System.out.println("Xuat mang 1 chieu cach 2");
		for(int pt: a) {
			System.out.print(pt+ "\t");
		}
	}
	
	public static int tongC1(int a[]) {
		System.out.println("Xuat tong mang 1 chieu cach 1");
		int tong =0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				tong+= a[i];
				
			}
			
		}
		return tong;
	}
	public static int tongC2(int a[]) {
		System.out.println("Xuat tong mang 1 chieu cach 2");
		int tong =0;
		for(int pt: a) {
			if(pt%2==0) {
				tong+= pt;
				
			}
		}
		return tong;
	}
	

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);	
		System.out.print("Moi ban nhap : ");
		n = Integer.parseInt(scanner.nextLine()); 
		int a[] = nhapMang(n,scanner);
		xuatMangC1(a);
		System.out.println("\n");
		xuatMangC2(a);
		System.out.println("\n");
		int tong1 = tongC1(a);
		System.out.print(tong1);
		System.out.println("\n");
		int tong2 =tongC2(a);
		System.out.print(tong2);
		System.out.println("\n");
	}

}
