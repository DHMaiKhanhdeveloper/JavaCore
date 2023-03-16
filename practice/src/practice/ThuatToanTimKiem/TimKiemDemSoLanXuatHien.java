package practice.ThuatToanTimKiem;

import java.util.Scanner;

public class TimKiemDemSoLanXuatHien {
	
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
		System.out.print("\n");
	}
	
	public static int DemSoLanXuatHienPTx(int a[],Scanner scanner) {
		int dem =0;
		
		System.out.print("Nhap phan tu can tim kiem x =");
		int x = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < a.length; i++) 
        { 
            if(a[i] == x) 
                dem++;
        } 
       
		return dem;
	}
	
	public static void main(String[] args) {
		int soLuong;
		Scanner scanner = new Scanner(System.in);
		soLuong = nhapSoLuongMang(scanner);
		int mang[] = nhapMang(soLuong,scanner);
		xuatMangC1(mang);
		int dem = DemSoLanXuatHienPTx(mang,scanner);
		 System.out.println("Số lần xuất hiện giá trị x" + dem );
	}

}
