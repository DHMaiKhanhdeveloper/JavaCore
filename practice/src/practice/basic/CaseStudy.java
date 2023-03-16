package practice.basic;

import java.util.Scanner;

public class CaseStudy {

	public static void main(String[] args) {
		
		final int khoangCach = -120;
		String tenPhim;
		int giaVeNguoiLon;
		int giaVeTreEm;
		int soVeNguoiLon;
		int soVeTreEm;
		int Tong;
		int soVeDaBan;
		int phanTram;
		float trichPhanTram;
		int conLai;
		String textStringFormat;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap ten Phim: ");
		tenPhim =input.nextLine();
		
		System.out.print("Nhap gia Ve Nguoi Lon: ");
		giaVeNguoiLon =input.nextInt();
		
		System.out.print("Nhap gia Ve Tre Em: ");
		giaVeTreEm =input.nextInt();
		
		System.out.print("Nhap so Ve Nguoi Lon: ");
		soVeNguoiLon =input.nextInt();
		
		System.out.print("Nhap so Ve Tre Em: ");
		soVeTreEm =input.nextInt();
		
//		System.out.print("Nhập Phan Tram: ");
//		phanTram = input.nextFloat();
		
		System.out.print("Nhap Phan Tram: ");
		phanTram = input.nextInt();
		soVeDaBan = giaVeNguoiLon + giaVeTreEm;
		Tong = giaVeNguoiLon * soVeNguoiLon + giaVeTreEm * soVeTreEm;
		trichPhanTram =  ((1.0f)*phanTram)/100* Tong;
		
//		trichPhanTram =  ((1.0f)*phanTram/100)* Tong;// hoàn toàn sai vì  tính phần trăm thì interger/100 =0 chỉ có float/100 mới ra kết quả
		conLai =  (int) (Tong - trichPhanTram);
		
		textStringFormat= String.format("%" + khoangCach + "s", "ten-Phim").replace(' ', '.').replace('-', ' ') ;
		System.out.println(textStringFormat + tenPhim);
		
		textStringFormat = String.format("%" + khoangCach + "s", "so-Ve-Da-Ban").replace(' ', '.').replace('-', ' ') ;
		System.out.println(textStringFormat + soVeDaBan);
		
		textStringFormat = String.format("%" + khoangCach + "s", "Tong").replace(' ', '.').replace('-', ' ') ;
		System.out.println(textStringFormat + Tong);
		
		
		textStringFormat = String.format("%" + khoangCach + "s", "phan-Tram").replace(' ', '.').replace('-', ' ') ;
		System.out.println(textStringFormat + phanTram+"%");
		
		textStringFormat = String.format("%" + khoangCach + "s", "trich-Phan-Tram").replace(' ', '.').replace('-', ' ') ;
		System.out.println(textStringFormat +(int)trichPhanTram);
		
		textStringFormat = String.format("%" + khoangCach + "s", "con-Lai").replace(' ', '.').replace('-', ' ') ;
		System.out.println(textStringFormat + conLai);


		
		
	}

}
