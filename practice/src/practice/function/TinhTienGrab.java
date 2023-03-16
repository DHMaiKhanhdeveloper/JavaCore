package practice.function;

import java.util.Scanner;

public class TinhTienGrab {
	
	static final int GRAB_CAR_KM_DAU = 8000;
	static final int GRAB_CAR_1_19 = 7500;
	static final int GRAB_CAR_19_TRO_LEN = 7000;
	static final int GRAB_CAR_CHO = 2000;
	
	static final int GRAB_SUV_KM_DAU = 9000;
	static final int GRAB_SUV_1_19 = 8500;
	static final int GRAB_SUV_19_TRO_LEN = 8000;
	static final int GRAB_SUV_CHO = 3000;
	
	static final int GRAB_BLACK_KM_DAU = 10000;
	static final int GRAB_BLACK_1_19 = 9500;
	static final int GRAB_BLACK_19_TRO_LEN = 9000;
	static final int GRAB_BLACK_CHO = 3500;
	
	public static int chonGrab(Scanner scanner) {
		int loaiGrab;
		
		System.out.println("Moi ban chon: ");
		System.out.println("Moi ban chon 1.GRAB CAR: ");
		System.out.println("Moi ban chon 2.GRAB SUV: ");
		System.out.println("Moi ban chon 3.GRAB BLACK: ");
		loaiGrab = Integer.parseInt(scanner.nextLine());
		return loaiGrab;
	}
	
	public static int nhapThoiGianCho(Scanner scanner) {
		int thoiGianCho;
		System.out.print("Moi ban nhap thoi gian cho: ");
		thoiGianCho = Integer.parseInt(scanner.nextLine());
		return thoiGianCho;
	}
	
	public static float nhapSoKm(Scanner scanner) {
		float soKm;
		System.out.print("Moi ban nhap so Km: ");
		soKm = Float.parseFloat(scanner.nextLine());
		return soKm;
	}
	
	public static float tinhTienkmDauTIen(int loaiGrab) {
		float tien =0;
		if(loaiGrab == 1) {
			tien = GRAB_CAR_KM_DAU;
		}else if(loaiGrab == 2) {
			tien = GRAB_SUV_KM_DAU;
		}else if(loaiGrab == 3) {
			tien = GRAB_BLACK_KM_DAU;
		}
		return tien;
	}
	
	public static float tinhTienkm1Den19(float soKm,int loaiGrab) {
		float tien =0;
		if(loaiGrab == 1) {
			tien = GRAB_CAR_KM_DAU + (soKm-1)*GRAB_CAR_1_19;
		}else if(loaiGrab == 2) {
			tien = GRAB_SUV_KM_DAU + (soKm-1)*GRAB_SUV_1_19;
		}else if(loaiGrab == 3) {
			tien = GRAB_BLACK_KM_DAU + (soKm-1)*GRAB_BLACK_1_19;
		}
		return tien;
	}
	
	public static float tinhTienkm19TroLen(float soKm,int loaiGrab) {
		float tien =0;
		if(loaiGrab == 1) {
			tien = GRAB_CAR_KM_DAU + 18*GRAB_CAR_1_19+(soKm-18)*GRAB_CAR_19_TRO_LEN;
		}else if(loaiGrab == 2) {
			tien = GRAB_SUV_KM_DAU + 18*GRAB_SUV_1_19+(soKm-18)*GRAB_SUV_19_TRO_LEN;
		}else if(loaiGrab == 3) {
			tien = GRAB_BLACK_KM_DAU + 18*GRAB_BLACK_1_19+(soKm-18)*GRAB_BLACK_19_TRO_LEN;
		}
		return tien;
	}
	
	public static float tinhTienThoiGianCho(int loaiGrab,int thoiGianCho) {
		float tien = 1;
		if(thoiGianCho >=3) {
			int tinhSoLan = (int)(thoiGianCho*1.0f)/3;
			if(loaiGrab == 1) {
				tien = tinhSoLan*GRAB_CAR_CHO;
			}else if(loaiGrab == 2) {
				tien = tinhSoLan*GRAB_SUV_CHO;
			}else if(loaiGrab == 3) {
				tien = tinhSoLan*GRAB_BLACK_CHO;
			}
		}
		return tien;
	}
	
	public static float tinhTienTong(int loaiGrab,int thoiGianCho,float soKm) {
		float tienTong =0;
		if(soKm <= 1) {
			tienTong = tinhTienkmDauTIen(loaiGrab)+ tinhTienThoiGianCho(loaiGrab,thoiGianCho)  ;
		}else if(soKm > 1 && soKm<=19 ) {
			tienTong = tinhTienkm1Den19(soKm,loaiGrab)+ tinhTienThoiGianCho(loaiGrab,thoiGianCho)  ;
		}else if(soKm < 19 ) {
			tienTong = tinhTienkm19TroLen(soKm,loaiGrab)+ tinhTienThoiGianCho(loaiGrab,thoiGianCho)  ;
		}
		return tienTong;
	}
	
	
	
	public static void main(String[] args) {
		
		float tienTong ;
		 Scanner scanner = new Scanner(System.in);
		 int chonGrab =chonGrab(scanner);
		 int thoiGianCho = nhapThoiGianCho(scanner);
		 float soKm= nhapSoKm(scanner);
		 tienTong = tinhTienTong(chonGrab,thoiGianCho,soKm);
		 System.out.println("Tien Tong "+ tienTong);
	  
		
	}
		
	
	

}
