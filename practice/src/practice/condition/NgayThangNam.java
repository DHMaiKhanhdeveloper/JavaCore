package practice.condition;

import java.util.Scanner;

public class NgayThangNam {

	public static void main(String[] args) {
		
		
		 int month;
		 int day = 0 ;
		 int year = 0;
		// Năm nhuận là năm chia hết cho 4 và không chia hết cho 100 hoặc năm phải chia hết cho 400
	     Scanner scanner = new Scanner(System.in);
	         
	     System.out.print("Moi ban nhap thang: ");
	     month = scanner.nextInt();
	     
         System.out.print("Moi ban nhap nam: ");
         year = scanner.nextInt();
	     
	     boolean flag  = true;    
	     switch (month) {
     
         case 1:
         case 3:
         case 5:
         case 7:
         case 8:
         case 10:
         case 12:
     
             day = 31;
             break;
         case 4:
         case 6:
         case 9:
         case 11:
             day = 30;
             break;
              
    
         case 2:

             if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            	 day = 29;
             } else {
            	 day = 28;
             }
             break;
         default:
        	 flag  = false;
             
         }  
	     
	     if (flag) {
	    	 System.out.println("Nhap thang "+ month +" hop le.");
	    	 System.out.println("Thang " + month + " nam " + year + " co " + day + " ngay.");
	
	     }else {
	    	 System.out.println("Nhap thang khong hop le.");
	    	 
	     }

	}

}
