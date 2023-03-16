package practice.loop;

import java.util.Scanner;

public class BTTongHop {
	public static void XuLy(int n) {
		int soBanDau = n;
		int soThanhPhan;
		int tong =0;
		int dem =0;
		do {
			soThanhPhan = soBanDau%10;
			tong += soThanhPhan;
			dem++;
			soBanDau /=10;
		}while(soBanDau!=0);
		
		System.out.println("So "+n +" co "+dem+" chu so");
		System.out.println("So "+n +" co chu so cuoi cung la: "+ n%10);
		System.out.println("So "+n +" co chu so ban dau la: "+ soThanhPhan);
		System.out.println("So "+n +" co tong chu so la: "+ tong);
		System.out.print("So "+n +" co dao nguoc la:");
		//loại bỏ số 0
		while(n%10==0) {
			n/=10;
		}
		
		do {
			System.out.print(""+n%10);
			n/=10;
		}while(n!=0);
		
	}

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Moi ban nhap : ");
		n = Integer.parseInt(scanner.nextLine());
		XuLy(n);

	}

}
