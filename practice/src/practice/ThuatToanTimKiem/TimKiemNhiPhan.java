package practice.ThuatToanTimKiem;

import java.util.Scanner;

public class TimKiemNhiPhan {
	
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
	
	public static boolean BinarySearch(int a[],int x)
	{	
		int left, right, mid;
		left = 0;
		right = a.length-1;
		do{
			mid = (left+right)/2;
			if( a[mid] == x )
				return true; 
			else if( a[mid]<x )
				left = mid+1; 
			else	right=mid-1;
		} while(left <= right); 
		return false;
	}
	
	public static int BinarySearch1(int[] arr, int x) {
	    int left = 0;
	    int right = arr.length - 1;

	    while (left <= right) {
	        int mid = (left + right) / 2;

	        if (arr[mid] == x) {
	            return mid;
	        } else if (arr[mid] < x) {
	            left = mid + 1;
	        } else {
	            right = mid - 1;
	        }
	    }
	    return -1;
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
		
//		boolean found = BinarySearch(mang,x);
//		
//		if(found) {
//			System.out.println("Tim thay " + x);
//		}else {
//			System.out.println("Khong Tim thay " + x);
//		}
		
		int index = BinarySearch1(mang, x);

        if (index == -1) {
            System.out.println("Không tìm thấy giá trị " + x);
        } else {
            System.out.println("Tìm thấy giá trị " + x + " tại vị trí " + index);
        }
	}

}
