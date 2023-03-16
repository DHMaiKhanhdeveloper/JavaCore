package practice.hcn;

import java.util.Scanner;

public class HinhChuNhat {
	
	private float chieuDai;
	private float chieuRong;
	private float chuVi;
	private float dienTich;
	
	
	public HinhChuNhat(float chieuDai, float chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	public float getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(float chieuDai) {
		this.chieuDai = chieuDai;
	}
	public float getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(float chieuRong) {
		this.chieuRong = chieuRong;
	}
	public float getChuVi() {
		return chuVi;
	}

	public float getDienTich() {
		return dienTich;
	}
	
	public HinhChuNhat() {
	
	}
	public void nhap(Scanner scan) {
		System.out.print("Nhập Chiều Dài:");
		this.chieuDai = Float.parseFloat(scan.nextLine());

		System.out.print("Nhập Chiều Rộng:");
		this.chieuRong = Float.parseFloat(scan.nextLine());
	}

	public void xuat() {
		System.out.println(" HCN (" + chieuDai + ", " + chieuRong + "). Diện tích: " + dienTich + "\t Chu vi:" + chuVi);
	}

	// 5. Các phương thức xử lý nghiệp vụ liên quan lớp này
	public void tinhChuVi() {
		this.chuVi = (chieuDai + chieuRong) * 2;
	}

	public void tinhDienTich() {
		this.dienTich = chieuDai * chieuRong;
	}

	
	
}
