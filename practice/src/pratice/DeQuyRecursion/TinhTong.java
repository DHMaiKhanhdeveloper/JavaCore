package pratice.DeQuyRecursion;

import java.util.Scanner;

public class TinhTong {
	// Bài tập : S(n) = 1+2+3+...+(n-1)+ n với n >=1

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhap vao so n ");
			n = Integer.parseInt(scanner.nextLine()); 
		}while(n <1);
	
		System.out.println(tinhTong(n));
	}
	
	public static long tinhTong(int n) {
		if(n ==1) {
			return 1;
		}
		return tinhTong(n-1) + n;
	}

}
