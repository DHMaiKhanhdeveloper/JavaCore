package pratice.DeQuyRecursion;

import java.util.Scanner;

public class BoiHai {
	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhap vao so n ");
			n = Integer.parseInt(scanner.nextLine()); 
		}while(n <1);
	
		System.out.println(tongGiaiThua(n));

	}
	//S(n) = 1^2+2^2+3^2+(n-1)^2+n^2
	public static long tinhTichMuHai(int n) {
		if(n ==1) {
			return 1;
		}
		return tinhTichMuHai(n-1) + n*n;
	}
	//S(n) = 1+1*2+1*2*3+1*2*3*n
	public static long giaiThua(int n) {
		if(n ==1) {
			return 1;
		}
		return giaiThua(n-1)* n;
	}
	
	public static long tongGiaiThua(int n) {
		if(n ==1) {
			return 1;
		}
		return tongGiaiThua(n-1) + giaiThua(n-1)* n;
	}

}
