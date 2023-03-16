package practice.loop;

import java.util.Scanner;

public class TinhTongKhongAm {
	
	public static int TinhTongKhongAm(Scanner scanner) {
		boolean flag = true;
		int tong = 0;
		int so;
		while(flag) {
			System.out.println("Nhap so ");
			 so = Integer.parseInt(scanner.nextLine());
			if(so >0) {
					tong +=so;
			}else {
				flag = false;
			}
		}
		return tong;
	}
	
	public static int TinhTongKhongAm2(Scanner scanner) {
		int nhap =1;
		int tong = 0;
		int so;
		while(nhap > 0) {
			System.out.println("Nhap so ");
			so = Integer.parseInt(scanner.nextLine());
			if(so >0) {
					tong +=so;
			}
		}
		return tong;
	}

	public static void main(String[] args) {
		
		int tong;
		Scanner input = new Scanner(System.in);
		
		tong = TinhTongKhongAm(input);
		System.out.println("Tong "+tong);

	}

}
