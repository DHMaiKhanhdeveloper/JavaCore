package practice.condition;

import java.util.Scanner;

//Chương trình cho phép nhập vào số dư thẻ tín dụng, tiền thanh toán trong tháng.
//Tính toán tiền phạt thẻ tín dụng chưa thanh toán. Gỉa định lãi suất là 1.5%/tháng

public class LaiSuatTinDung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		final int khoangCach = -120;
		final float interestRate = 0.015f; // 1.5f*/100
		float creditCardBalance;
		float payment;
		float balance;
		float penalty = 0;	
		String textStringFormat;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhap credit Card Balance: ");
		creditCardBalance =input.nextFloat();
		
		System.out.print("Nhap payment: ");
		payment =input.nextFloat();
		

		
		balance = creditCardBalance - payment;
		if(balance > 0) {
			penalty = balance * interestRate;
		}
//		penalty = balance * 1.5f/100;
		textStringFormat = String.format("%" + khoangCach + "s", "penalty").replace(' ', '.').replace('-', ' ') ;
		System.out.println(textStringFormat + penalty);
	}

}
