package practice.array;

import java.util.Scanner;

public class ViTriDuongNhoNhat {
	
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
	
	public static int GiaTriDuongDauTien(int a[]) {
		int index = -1; // chưa tìm thấy số dương
		for(int i=0;i<a.length;i++) {
			if(a[i] >0) {
					index = i;// tìm thấy vị trí phần tử dương 
					//index = a[i]; //tìm thấy phần tử dương
					break; // thoát khỏi vòng lặp vì đã tìm thấy phần tử dương  đầu tiên
			}
		}
		return index;
	}
	
	public static int GiaTriDuongNhoNhat(int a[]) {
		int indexDuong = GiaTriDuongDauTien(a);
		int indexMin = -1 ;
		if(indexDuong == -1) {
			System.out.println("Mang khong co so duong");
		}else {
			indexMin = indexDuong;
			for(int i=indexDuong+1;i<a.length;i++) { // duyệt các phần tử tiếp theo
				if(a[i] >0 && a[i] < a[indexMin]) {
					indexMin = i; // hỏi về trị trí
					// hỏi về giá trị a[indexMin]= a[i]; 
				}
			}
		}
		return indexMin;
		
	}

	
	public static void LietKeViTriDuongNhoNhatTiepTheo(int a[]) {
		int index = GiaTriDuongNhoNhat(a);
		if(index == -1) {
			System.out.println("Mang khong co so duong");
		}else {
			System.out.println("Gia tri duong dau tien nho nhat"+ a[index]);
			for(int i=index+1;i<a.length;i++) {
				if(a[i] == a[index]) {
					System.out.print(i+"\t");
				}
			}
		}
		
	}
	public static void LietKeTatCaViTriDuongNhoNhat(int a[]) {
		int index = GiaTriDuongNhoNhat(a);
		if(index == -1) {
			System.out.println("Mang khong co so duong");
		}else {
			System.out.println("Gia tri duong dau tien nho nhat"+ a[index]);
			for(int i=index;i<a.length;i++) {
				if(a[i] == a[index]) {
					System.out.print(i+"\t");
				}
			}
		}
		
	}
	

	public static void main(String[] args) {
		int soLuong;
		Scanner scanner = new Scanner(System.in);
		soLuong = nhapSoLuongMang(scanner);
		int mang[] = nhapMang(soLuong,scanner);
		LietKeTatCaViTriDuongNhoNhat(mang);

	}

}
