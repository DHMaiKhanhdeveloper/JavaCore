package practice.array;

import java.util.Scanner;

public class ViTriGiaTriAm {
	
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
	public static int GiaTriAmDauTien(int a[]) {
		int index = -1; // chưa tìm thấy
		for(int i=0;i<a.length;i++) {
			if(a[i] <0) {
				index = i;// tìm thấy vị trí phần tử âm 
				//index = a[i]; //tìm thấy phần tử âm
				break; // thoát khỏi vòng lặp vì đã tìm thấy phần tử âm đầu tiên
			}
		}
		return index;
	}
	
	public static void LietKeViTriAm(int a[]) {
		int index = GiaTriAmDauTien(a);
		if(index == -1) {
			System.out.println("Mang khong co so am");
		}else {
			System.out.println("Gia tri am dau tien"+ a[index]);
			for(int i=index;i<a.length;i++) {
				if(a[i] == a[index]) {
					System.out.print(i+1+"\t");
				}
			}
		}
		
	}
	public static void LietKeViTriAmPhiaSau(int a[]) {
		int index = GiaTriAmDauTien(a);
		if(index == -1) {
			System.out.println("Mang khong co so am");
		}else {
			System.out.println("Gia tri am dau tien"+ a[index]);
			for(int i=index+1;i<a.length;i++) { //duyệt phần tử tiếp theo
				if(a[i] == a[index]) {
					System.out.print(i+1+"\t");
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		int soLuong;
		Scanner scanner = new Scanner(System.in);
		soLuong = nhapSoLuongMang(scanner);
		int mang[] = nhapMang(soLuong,scanner);
		LietKeViTriAm(mang);
	}
	

}
