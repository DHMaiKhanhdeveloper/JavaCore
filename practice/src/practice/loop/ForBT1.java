package practice.loop;

import java.util.Scanner;

public class ForBT1 {
	public static void inChanFor() {
		for(int i=0 ;i<100;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}
	public static void inChanFor2() {
		for(int i=0 ;i<100;i+=2) {
				System.out.print(i+" ");
			
		}
	}
	
	public static void inLeFor() {
		for(int i=0 ;i<100;i++) {
			 if(i%2!=0){
				System.out.print(i+" ");
			}
		}
	}
	
	public static void inLeFor2() {
		for(int i=1 ;i<100;i+=2) {
				System.out.print(i+" ");
		}
	}
	
	public static void inChanWhile() {
		int i=0;
		while(i<100) {
			i+=2;
			//if(i%2==0)
			System.out.print(i+" ");
		}
	}
	public static void inLeWhile() {
		int i=1;
		while(i<100) {
			i+=2;
			//if(i%2==0)
			System.out.print(i+" ");
		}
	}
	
	
	public static void main(String[] args) {
		inLeFor();
		System.out.println("\n");
		inChanFor();
		System.out.println("\n");
		inLeFor2();
		System.out.println("\n");
		inChanFor2();
		System.out.println("\n");
		inLeWhile();
		System.out.println("\n");
		inChanWhile();
	}

}
