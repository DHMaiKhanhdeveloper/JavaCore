package practice.ThuatToanTimKiem;

import java.util.Scanner;

public class TimThayChanCuoiCung {
	
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
		System.out.println();
	}
	
	public static int chanCuoiCung(int a[]) {
		int indexMin = -1 ; // chưa tìm thấy
		for(int i = a.length-1; i >0; i--) 
        { 
            if(a[i] %2 ==0) {
            	indexMin =i;
            	break;
            }
                
        }
		return indexMin;
	}
	

	public static void main(String[] args) {
		int soLuong;
		Scanner scanner = new Scanner(System.in);
		soLuong = nhapSoLuongMang(scanner);
		int mang[] = nhapMang(soLuong,scanner);
		xuatMangC1(mang);
		int index = chanCuoiCung(mang);
		if(index!= -1) {
			System.out.println("Tim thay so chan cuoi cung la "+ mang[index]+ " tai vi tri "+ index );
		}else {
			System.out.println("Khong Tim thay so chan cuoi cung ");
		}

	}

}
