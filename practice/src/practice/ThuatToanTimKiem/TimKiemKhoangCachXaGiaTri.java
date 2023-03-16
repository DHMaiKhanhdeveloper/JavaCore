package practice.ThuatToanTimKiem;

import java.util.Scanner;
// khoảng cách bao xa lấy phần tử - x lấy giá trị tuyệt đối ra khoảng cách xa nhất

public class TimKiemKhoangCachXaGiaTri {
	
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
	public static void lietKePTXaGiaTriX(int a[],Scanner scanner) {
		System.out.println("Vui long nhap gia tri x");
		int x = Integer.parseInt(scanner.nextLine()); 
		int  b[] = new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i] = Math.abs(a[i]-x);
		}
		
		
		//Phần Tử Max
		int indexMax =0 ;
		for(int i=0;i<b.length;i++) {
			if(b[i] > b[indexMax]) {
				indexMax =i ;
			}
		}
		
		//Liệt kê
		System.out.println("Cac phan tu cach xa phan tu "+x+ " la: ");
		
		for(int i=0;i<b.length;i++) {
			if(b[i] == b[indexMax]) {
				System.out.print("(" + i+","+a[i]+") \t");
			}
		}
	}

	public static void main(String[] args) {
		int soLuong;
		Scanner scanner = new Scanner(System.in);	
		soLuong = nhapSoLuongMang(scanner);
		int a[] = nhapMang(soLuong,scanner);
		System.out.println("\n");
		xuatMangC1(a);
		lietKePTXaGiaTriX(a,scanner);

	}

}
