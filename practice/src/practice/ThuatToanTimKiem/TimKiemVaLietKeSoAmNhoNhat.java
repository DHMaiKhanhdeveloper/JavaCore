package practice.ThuatToanTimKiem;

import java.util.Scanner;

public class TimKiemVaLietKeSoAmNhoNhat {
	
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
	
	public static int TimKiemPhanTuAmDT(int arr[]) 
    { 
        int n = arr.length; 
        for(int i = 0; i < n; i++) 
        { 
            if(arr[i] <0) 
                return i; 
        } 
        return -1; 
    } 
	
	public static int TimKiemPhanTuAmNhoNhat(int arr[]) 
    { 
		int amDauTien = TimKiemPhanTuAmDT(arr);
        for(int i = amDauTien+1; i < arr.length; i++) 
        { 
            if(arr[i] < amDauTien && arr[i]<0 ) 
            	amDauTien =  arr[i];
        } 
        return amDauTien; 
    } 
	
	public static void LietKeSoAmNhoNhat(int arr[]) {
		int amNhoNhat = TimKiemPhanTuAmNhoNhat(arr);
		for(int i = 0; i < arr.length; i++) 
        { 
            if(arr[i] == amNhoNhat) {
            	System.out.print("Liet Ke So Am Nho Nhat"+arr[i] );
            }

        } 
         
	}
	
	public static void TimVaLietKeSoAmNhoNhat(int arr[]) {
		//Trường hợp mảng toàn dương
		//Tìm số âm đầu tiên trong mảng
		int indexMin = -1 ; // chưa tìm thấy
		for(int i = 0; i < arr.length; i++) 
        { 
            if(arr[i] <0) {
            	indexMin =i;
            	break;
            }
                
        }
		//Đã Tìm phần tủ âm nhỏ nhất thật sự
		if(indexMin !=-1) {
			for(int i = indexMin+1; i < arr.length; i++) 
	        { 
	            if(arr[i] <arr[indexMin] &&  arr[i]<0) {
	            	indexMin =i;
	            	}
	                
	        	} 
			//Liệt kê
			
			System.out.println("\n"+ " phan tu am nho nhat "+arr[indexMin]+" o vi tri" );
			for(int i = indexMin; i < arr.length; i++) 
	        { 
	            if(arr[i] == arr[indexMin] ) {
	            	System.out.print(i+"\t");
	            	}
	                
	        } 
		}else {
			System.out.println("\n"+"Mang khong co phan tu am" );
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		int soLuong;
		Scanner scanner = new Scanner(System.in);
		soLuong = nhapSoLuongMang(scanner);
		int mang[] = nhapMang(soLuong,scanner);
		xuatMangC1(mang);
		TimVaLietKeSoAmNhoNhat(mang);
		
	}
}
