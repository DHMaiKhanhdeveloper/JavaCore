package practice.array;

import java.util.Scanner;

public class DemPhanTuTrungNhau {
	
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
	public static int[] demPhanTu(int a[]) {
		int b[] = new int[a.length];
		for(int i  =0 ;i<a.length;i++) {
			b[i] =0;
			for(int j=0;j<a.length;j++) {
				if(a[i] == a[j]) {
					if(j<i) {
						break;
					}else {
						b[i]++;
					}
				}
			}
		}
		return b;
	}
	
	public static void inSPTGiongNhau(int a[]) {
		int b[] = demPhanTu(a);
		for(int i  =0 ;i<b.length;i++) {
			if(b[i]!=0) {
				System.out.print(a[i]+"["+b[i]+"]"+"\t");
			}
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
		inSPTGiongNhau(a);
	}

}
