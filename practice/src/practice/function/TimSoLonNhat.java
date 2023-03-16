package practice.function;

import java.util.Scanner;

public class TimSoLonNhat {
	
	
	public static void timSoLonNhat1(int so1, int so2, int so3) {
		int soLonNhat;
		
	     soLonNhat = so1;
	      
	     if(soLonNhat < so2) {
	    	 soLonNhat =  so2;
	     } 
	     if(soLonNhat < so3) {
	    	 soLonNhat =  so3;
	     }
	     
	     System.out.print("So Lon Nhat " + soLonNhat);
	}
	
	public static int timSoLonNhat2(int so1, int so2, int so3) {
		int soLonNhat;
		
	     soLonNhat = so1;
	      
	     if(soLonNhat < so2) {
	    	 soLonNhat =  so2;
	     } 
	     if(soLonNhat < so3) { // tìm tục xét điều kiện chứ ko phải else if
	    	 soLonNhat =  so3;
	     }
	     
	     return soLonNhat;
	}

	public static void main(String[] args) {
		
		 int so1;
		 int so2;
		 int so3;
		 int soLonNhat;
		 
		 
	     Scanner scanner = new Scanner(System.in);
         
	     System.out.print("Moi ban nhap so1: ");
	     so1 = scanner.nextInt();
	     
	     System.out.print("Moi ban nhap so2: ");
	     so2 = scanner.nextInt();
	     
	     System.out.print("Moi ban nhap so3: ");
	     so3 = scanner.nextInt();
	     
//	     timSoLonNhat1(so1,so2,so3);
	     
	     soLonNhat=  timSoLonNhat2(so1,so2,so3);
	     System.out.print("So Lon Nhat " + soLonNhat);
	     

	}

}
