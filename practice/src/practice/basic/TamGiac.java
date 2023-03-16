package practice.basic;

import java.util.Scanner;

public class TamGiac {

	public static void main(String[] args) {
		
		final int khoangCach = -120;
		int edge1;
		int edge2;
		double  edge3;
		String textStringFormat;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap canh 1: ");
		edge1 =input.nextInt();
		
		System.out.print("Nhap canh 2: ");
		edge2 =input.nextInt();

		edge3 = Math.sqrt(edge1*edge1+edge2*edge2);
		
		textStringFormat = String.format("%" + khoangCach + "s", "edge3").replace(' ', '.').replace('-', ' ');
		System.out.println(textStringFormat + edge3);
	}

}
