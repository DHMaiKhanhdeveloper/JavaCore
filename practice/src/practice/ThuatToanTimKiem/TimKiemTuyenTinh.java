package practice.ThuatToanTimKiem;

import java.util.Scanner;

public class TimKiemTuyenTinh {
	
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
	
	public static boolean LinearSearch(int a[], int x)
	{
			int n = a.length; int i=0;
			while( (i<n) && ( a[i] != x )) { i++;
			}
			if(i==n)
				return false; //Tìm không thấy x
			 
			else
				return true; //Tìm thấy
				
	}
	
	public static int search(int arr[], int x) 
    { 
        int n = arr.length; 
        for(int i = 0; i < n; i++) 
        { 
            if(arr[i] == x) 
                return i; 
        } 
        return -1; 
    } 
	
	public static boolean LinearSearch2(int a[], int x)
	{
     
        for(int i = 0; i <a.length; i++) 
        { 
            if(a[i] == x) 
                return true; 
        } 
        return false; 
				
	}
	

	public static void main(String[] args) {
		int soLuong;
		Scanner scanner = new Scanner(System.in);
		soLuong = nhapSoLuongMang(scanner);
		int mang[] = nhapMang(soLuong,scanner);
		xuatMangC1(mang);
		System.out.print("\n");
		System.out.print("Nhap phan tu can tim kiem x =");
		int x = Integer.parseInt(scanner.nextLine());
		
//		boolean found = LinearSearch2(mang,x);
//		
//		if(found) {
//			System.out.println("Tim thay " + x);
//		}else {
//			System.out.println("Khong Tim thay " + x);
//		}
//		
		int index = search(mang, x);

        if (index == -1) {
            System.out.println("Không tìm thấy giá trị " + x);
        } else {
            System.out.println("Tìm thấy giá trị " + x + " tại vị trí " + index);
        }
		

	}


}
