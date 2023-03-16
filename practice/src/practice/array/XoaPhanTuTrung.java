package practice.array;

import java.util.Scanner;

public class XoaPhanTuTrung {
	
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
	
	public static int demPhanTu(int a[],int x) {
		int dem =0;
		for(int i=0;i<a.length;i++) {
			if(a[i] == x) {
				dem++;
			}
		}
		return dem;
	}
	
	public static int[] xoaPhanTu(int a[],int x) {
		int dem = demPhanTu(a,x);
		if(dem >0) {
			int[] b = new int[a.length - dem];
			int  j =0;
			for(int i=0;i<a.length;i++) {
				if(a[i]!=x) {
					b[j++] = a[i];
				}
			}
			a = b;
		}else {
			System.out.print("Khong co phan tu "+ x +"trong mang");
		}
		return a;
	}
	
	public static void main(String[] args) {
		int soLuong , x;
		Scanner scanner = new Scanner(System.in);	
		soLuong =  nhapSoLuongMang(scanner);
		int a[] = nhapMang(soLuong,scanner);
		System.out.println("\n");
		xuatMangC1(a);
		System.out.println("\n");
		System.out.print("Nhap phan tu can xoa ");
		x = Integer.parseInt(scanner.nextLine());
		a = xoaPhanTu(a,x);
		System.out.println("\n");
		xuatMangC1(a);
		
	}

}
