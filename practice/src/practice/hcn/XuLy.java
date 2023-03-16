package practice.hcn;

import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		//Cach1
		HinhChuNhat hcn = new HinhChuNhat();
		Scanner scan = new Scanner(System.in);
		hcn.nhap(scan);
		
		hcn.tinhChuVi();
		hcn.tinhDienTich();
		hcn.xuat();
		
		
		//Cach2
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Nhập chiều dài");
//		float cDai = Float.parseFloat(scan.nextLine());
//		System.out.print("Nhập chiều rộng");
//		float cRong = Float.parseFloat(scan.nextLine());
//		HinhChuNhat hcn = new HinhChuNhat(cDai, cRong);
//		hcn.tinhChuVi();
//		hcn.tinhDienTich();
//		hcn.xuat();
	}

}
