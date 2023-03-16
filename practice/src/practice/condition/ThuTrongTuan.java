package practice.condition;

import java.util.Scanner;

//Viết chương trình nhập vào ngày, tháng, năm. Kiểm tra ngày và tháng có hợp lệ hay không. Tính thứ trong tuần của ngày đó
//Năm phải chia hết cho 4 và không chia hết cho 100 hoặc năm phải chia hết cho 400. Thứ trong tuần theo công thứ Zeller3

public class ThuTrongTuan {

	public static void main(String[] args) {
		 int month;
		 int day  ;
		 int top =0;
		 int year ;
		 int dayOfWeek;
		// Năm nhuận là năm chia hết cho 4 và không chia hết cho 100 hoặc năm phải chia hết cho 400
	     Scanner scanner = new Scanner(System.in);
	     
	     System.out.print("Moi ban nhap ngay: ");
	     day = scanner.nextInt();
	     
	         
	     System.out.print("Moi ban nhap thang: ");
	     month = scanner.nextInt();
	     
	    
         System.out.print("Moi ban nhap nam: ");
         year = scanner.nextInt();
         
         
	     
	     boolean flag  = true;  
	     
	     if(year< 1582) {
	    	 flag  = false;
	     }
	     
	     if( month<1 ||  month>12) {
	    	 flag  = false;
	     }
	     
	     switch (month) {
         case 1:
         case 3:
         case 5:
         case 7:
         case 8:
         case 10:
         case 12:
        	 top = 31;
        	 flag  = true;
             break;
             
         case 4:
         case 6:
         case 9:
         case 11:
        	 top = 30;
        	 flag  = true;
             break;
              
    
         case 2:
             if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            	 top = 29;
             } else {
            	 top = 28;
             }
             break;
         default:
        	 flag  = false;
             
         }  
	     if(day<1 || day> top) {
	    	 flag  = false;
	     }
	     
	     if (flag) {
	    	 System.out.println("Nhap thang "+ month +" hop le.");
	    	 System.out.println("Thang " + month + " nam " + year + " co " + top + " ngay.");
	    	 
	    	 int a = (14-month)/12;
	    	 year -= a;
	    	 month += 12*a-2;
	    	 dayOfWeek = (day+year+year/4-year/100+year/400+(31*month)/12)%7;
	    	 
	    	 if(dayOfWeek ==0) {
	    		 System.out.println("Chu Nhat");
	    	 }else {
	    	 int thu = dayOfWeek +1;
	    	 System.out.println("Thu "+ thu );
	    	 }
	
	     }else {
	    	 System.out.println("Nhap thang khong hop le.");
	    	 
	     }

	}

}
