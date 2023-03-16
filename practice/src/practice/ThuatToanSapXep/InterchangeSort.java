package practice.ThuatToanSapXep;

import java.util.Scanner;
// Độ phức tạp O n^2
public class InterchangeSort {
	// Bước 1: Xét phần tử đầu tiên ( tại vị trí 1) i tại 0 và j tại 1 
	// Tiếp theo cho j chạy

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
	
	public static int[] InterchangeSortIncrease(int arr[]) {
		// vị trí i là 0 và j là 1 và j tăng lên 2,3,4,5,6,..
		// vị trí i là 1 và j là 2 và j tăng lên 3,4,5,6,..
		 
	      for (int i = 0; i < arr.length - 1; i++) {
	         for (int j = i + 1; j < arr.length; j++) {
	            if (arr[i] > arr[j]) {
	               int temp = arr[i]; // tạo biến tạm
	               arr[i] = arr[j];
	               arr[j] = temp;
	            }
	         }
	      }
	      return arr;
	}
	
	public static int[] InterchangeSortDecrease(int arr[]) {
		 
	      for (int i = 0; i < arr.length - 1; i++) {
	         for (int j = i + 1; j < arr.length; j++) {
	            if (arr[i] < arr[j]) {
	               int temp = arr[i];
	               arr[i] = arr[j];
	               arr[j] = temp;
	            }
	         }
	      }
	      return arr;
	}

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);	
		System.out.print("Moi ban nhap : ");
		n = Integer.parseInt(scanner.nextLine()); 
		int a[] = nhapMang(n,scanner);
		xuatMangC1(a);
		System.out.println("\n");
		a = InterchangeSortIncrease(a);
		xuatMangC1(a);
		System.out.println("\n");
		a = InterchangeSortDecrease(a);
		xuatMangC1(a);

	}

}
