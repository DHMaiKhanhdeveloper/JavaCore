package practice.array;

import java.util.Scanner;

public class TronMang {
	
	final static int MAX = 100;
	final static int MIN = -100;
	
	public static int nhapSoLuongMang(Scanner scanner) {
		int n;
		do {
			System.out.print("Moi ban nhap so luong mang  n>2 va mang chan ");
			n = Integer.parseInt(scanner.nextLine()); 
		}while(n<=2  && n%2==0);
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
	
	public static boolean KiemTraShuffle(int a[], int b[]) {
		
		for(int i=0;i<a.length;i++) {
			if(a[i] != b[i]) { // không bằng nhau
				return false;
			}
		}
		return true;
	}
	
	public static int DemPhanTu(int a[], int b[]) {
		int count =0;
		do {
			b= TronShuffle(b); //cap nhat b
			xuatMangC1(b);
			System.out.println("\n");
			count++;
		}while(!KiemTraShuffle(a,b));
		return count;
	}
	
	public static int[] TronShuffle(int a[]) {
		int[] b = new int [a.length];
		for(int i=0;i<a.length/2;i++) {
			b[2*i] = a[i];
			b[2*i+1] = a[a.length/2+i];
		}
		a=b;
		return a;
	}
	
	public static void main(String[] args) {
		int soLuong ;
		Scanner scanner = new Scanner(System.in);	
		soLuong =  nhapSoLuongMang(scanner);
		int a[] = nhapMang(soLuong,scanner);
		int b[] = a; // gắn mảng a vào b
		System.out.println("\n");
		xuatMangC1(a);
		System.out.println("\n");
		a =TronShuffle(a);
		System.out.println("\n");
		xuatMangC1(a);
		b = TronShuffle(a);
		System.out.println("\n");
		System.out.println("Xuat b");
		
		xuatMangC1(b);
		System.out.println("\n");
		int dem = DemPhanTu(a,b);
		System.out.println("So lan hoan doi la: "+ dem);
	}

}
