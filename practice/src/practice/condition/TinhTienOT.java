package practice.condition;

import java.util.Scanner;

//Viết chương trình tính toán tiền phải trả theo tuần cho nhân viên dựa vào số giờ làn, tiền theo giờ
//Nếu số giờ lớn hơn 40 giờ 1 tuần thì phải trà giờ T theo hệ số là 1.5

public class TinhTienOT {

	public static void main(String[] args) {
		
		final int SPACE  = -120;
		final float   INTEREST_RATE= 1.5f;
		final float  HOURS_PERMANENT = 40;
		float hours;
		float rate;
		float payment;
		String textStringFormat;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhap hours: ");
		hours =input.nextFloat();
		
		System.out.print("Nhap rate: ");
		rate =input.nextFloat();
		//ví dụ 45 giờ làm lớn hơn 40 giờ thì lấy 40*tiền 1 giờ +5*tiền 1 giờ*1.5(1.5 là thập phân đổi ra 1.5*f)
		
		if(hours > HOURS_PERMANENT) {
			payment = rate * HOURS_PERMANENT + rate * INTEREST_RATE *(hours-HOURS_PERMANENT);
		}else {
			payment = rate * hours;
		}
		
		textStringFormat = String.format("%" + SPACE + "s", "payment").replace(' ', '.').replace('-', ' ') ;
		System.out.println(textStringFormat + payment);
		
		
	}

}
