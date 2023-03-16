package practice.condition;

import java.util.Scanner;

public class SoLonNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int khoangCach = -120;
		int soThuNhat;
		int soThuHai;
		int bigger;
		String textStringFormat;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhap so Thu Nhat: ");
		soThuNhat =input.nextInt();
		
		System.out.print("Nhap so Thu Hai: ");
		soThuHai =input.nextInt();
		
		if(soThuNhat >  soThuHai) {
			bigger = soThuNhat;
		}else {
			bigger = soThuHai;
		}
		
		textStringFormat= String.format("%" + khoangCach + "s", "So-lon-nhat").replace(' ', '.').replace('-', ' ') ;
		System.out.println(textStringFormat + bigger);
		

	}

}
