package practice.array;

import java.util.Scanner;

public class BTNangCaoRun {
	
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
	
	public static void MaxRun(int a[]) {
		// head : chiều dài tiếp tục
		// maxHead:  tính từ dây có chiều dài nhất
		// maxLen : độ dài có chiều dài nhất
		int head =0;
		int maxHead =0;
		int maxLen =0;
		do {
			int i;
			int len =1;
			for(i =head;i<a.length-1 && a[i]<a[i+1];i++) {
				len++;
			}
			
			if(len > maxLen) {
				maxLen =  len;
				maxHead = head;
			}
			head = i+1;
		}while(head < a.length);
		System.out.println("Run dai nhat la: ");
		for(int i=0;i<maxLen;i++) {
			System.out.print(a[maxHead+i]+"\t");
		}
	}
	
	public static void main(String[] args) {
		int soLuong;
		Scanner scanner = new Scanner(System.in);	
		soLuong = nhapSoLuongMang(scanner);
		int a[] = nhapMang(soLuong,scanner);
		System.out.println("\n");
		xuatMangC1(a);
		System.out.println("\n");
		MaxRun(a);
		
	}

}
