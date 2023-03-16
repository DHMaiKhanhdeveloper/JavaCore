package practice.loop;

import java.util.Scanner;

public class DemLanThiLai {
	
	public static int DemLanThiLai(Scanner scanner) {
		int count =0;
		int diem = 0;
		while(diem <5) {
			System.out.println("Nhap lai diem ");
			diem = Integer.parseInt(scanner.nextLine());
			if(diem<5) {
			  count++;
			}else {
				System.out.println("Chuc mung thi dau ");
			}
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		int soLanThiLai;
		Scanner input = new Scanner(System.in);
		
		int soLan = DemLanThiLai(input);
		System.out.println("So lan thi lai " + soLan);
		
	}

}
