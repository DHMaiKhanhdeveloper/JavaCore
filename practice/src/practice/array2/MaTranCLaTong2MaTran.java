package practice.array2;

import java.util.Scanner;

public class MaTranCLaTong2MaTran {
	
	final static int MIN = -10;
	final static int MAX = 10;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int soDong = nhapN(scan);
		int soCot = nhapN(scan);
		int a[][] = taoMang(soDong, soCot, scan);
		xuatMang(a, soDong, soCot);
		System.out.println("\t");
		int b[][] = taoMang(soDong, soCot, scan);
		xuatMang(b, soDong, soCot);
		System.out.println("\t");
		int c[][] = tongMaTran(a, b, soDong, soCot);
		xuatMang(c, soDong, soCot);
		System.out.println("\t");
		

	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập vào giá trị >1");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int[][] nhapMang(int soDong, int soCot, Scanner scan) {
		int a[][] = new int[soDong][soCot];

		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print("a[" + i + "]" + "[" + j + "] = ");
				a[i][j] = Integer.parseInt(scan.nextLine());
			}
		}

		return a;

	}

	public static int[][] taoMang(int soDong, int soCot, Scanner scan) {
		int a[][] = new int[soDong][soCot];

		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				a[i][j] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
			}
		}

		return a;

	}

	public static void xuatMang(int a[][], int soDong, int soCot) {
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("\t");
		}
	}

	public static int[][] tongMaTran(int a[][], int b[][], int soDong, int soCot) {
		int c[][] = new int[soDong][soCot];
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}

}
