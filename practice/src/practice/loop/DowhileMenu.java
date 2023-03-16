package practice.loop;

import java.util.Scanner;

public class DowhileMenu {
	
	public static void inMenu() {
		System.out.println("Moi ban chon menu: ");
		System.out.println("Moi ban chon 1. Tinh tong: ");
		System.out.println("Moi ban chon 2. Tinh hieu: ");
		System.out.println("Moi ban chon 3. Tinh tich: ");
		System.out.println("Moi ban chon 4. Tinh thuong: ");
		System.out.println("Moi ban chon 0. Thoat: ");
	}
	
	public static void xuLyMenu(Scanner scanner, float a, float b) {
		Boolean flag = true;
		int chon;
	
		do {
			inMenu();
			System.out.print("Moi ban chon : ");
			chon = Integer.parseInt(scanner.nextLine());
			
			
			switch (chon) {
		     case 1:
		    	 float tong = a+b;
		    	 System.out.println("Tong: "+tong);
	             break;
	         case 2:
	        	 float hieu = a-b;
	        	 System.out.println("Tong: "+hieu);
	             break;
	         case 3:
	        	 float tich = a*b;
	        	 System.out.println("Tong: "+tich);
	             break;
	         case 4:
	        	 if(b == 0) {
	        		 System.out.println("b phải là số khác 0");
	        	 }else {
		        	 float thuong = a/b;
		        	 System.out.println("Tong: "+thuong);
	        	 }
	        	 break;
	         case 0:
	        	 flag = false;
	             break;
	         default:
	        	 System.out.println("Vui long chon lai menu tu 0 đến 4");
	         }  
			
		}while(flag);
		
	}
	
	public static void xuLyMenu2(Scanner scanner, float a, float b) {
		Boolean flag = false;
		int chon;
	
		do {
			inMenu();
			System.out.print("Moi ban chon : ");
			chon = Integer.parseInt(scanner.nextLine());
			
			
			switch (chon) {
		     case 1:
		    	 float tong = a+b;
		    	 System.out.println("Tong: "+tong);
	             break;
	         case 2:
	        	 float hieu = a-b;
	        	 System.out.println("Tong: "+hieu);
	             break;
	         case 3:
	        	 float tich = a*b;
	        	 System.out.println("Tong: "+tich);
	             break;
	         case 4:
	        	 if(b == 0) {
	        		 System.out.println("b phải là số khác 0");
	        	 }else {
		        	 float thuong = a/b;
		        	 System.out.println("Tong: "+thuong);
	        	 }
	        	 break;
	         case 0:
	        	 flag = true;
	             break;
	         default:
	        	 System.out.println("Vui long chon lai menu tu 0 đến 4");
	         }  
			
		}while(!flag);
		
	}
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 
		float a,b;
		System.out.print("Nhap a : ");
		a = Float.parseFloat(scanner.nextLine());
		
		
		
		System.out.print("Nhap b : ");
		b = Float.parseFloat(scanner.nextLine());
		
		xuLyMenu2(scanner,a,b);
	}

}
