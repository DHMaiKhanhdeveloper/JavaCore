package practice.array;

import java.util.Scanner;
// Tạo ngẫu nhiên mảng một chiều n phần tử nguyên có giá trị chứa trong đoạn [-100,100] và xuất mảng.
// a)Đếm số phần tử chia hết cho 4 và có chữ số tận cùng là 6
// b)Thay các phần tử lẻ bằng 2 lần giá trị của nó

public class DemPhanTu {
	
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
	}
	public static int demChiaHet(int a[]) {
		int dem =0;
		System.out.print("Xuat mang chia het ");
		for(int i=0;i<a.length;i++) {
			if(a[i]%4 ==0 && Math.abs(a[i])%10==6) {
				dem++;
			}
		}
		return dem;
	}
	public static int[] nhanLe(int a[]) {
		System.out.println("Xuat mang nhan le ");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				a[i] *=2;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		int soLuong;
		Scanner scanner = new Scanner(System.in);	
		soLuong = nhapSoLuongMang(scanner);
		int a[] = nhapMang(soLuong,scanner);
		System.out.println("\n");
		xuatMangC1(a);
		System.out.println("\n");
		int dem =demChiaHet(a);
		System.out.print(dem);
		a= nhanLe(a);
		System.out.println("\n");
		xuatMangC1(a);
		

	}

}
