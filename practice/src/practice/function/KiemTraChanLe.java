package practice.function;

import java.util.Scanner;

public class KiemTraChanLe {
	
	public static void kiemTraChanLe2(int so) {

		if(so%2 ==0) {
			 System.out.print("So chan");
		}else {
			System.out.print("So le");
		}

		
	}
	
	
	public static boolean kiemTraChanLe(int so) {
		boolean flag ;
		if(so%2 ==0) {
			flag = true;
		}else {
			flag = false;
		}
		return flag;
		
	}
	
	public static void main(String[] args) {
		 int so;
		 boolean flagkt;
		 
		 Scanner scanner = new Scanner(System.in);
         
	     System.out.print("Moi ban nhap so: ");
	     so = scanner.nextInt();
	     
	     flagkt =  kiemTraChanLe(so);
	     if(flagkt) {
	    	 System.out.print("So chan");
	     }else {
	    	 System.out.print("So le");
	     }
	     
	     
	}
	

}
