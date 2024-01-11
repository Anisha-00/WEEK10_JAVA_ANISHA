package com.cnts.service;

import java.util.Scanner;

public class HollowSquarePatern {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of row");
		int row = scanner.nextInt();
		
		for(int index = 0; index<row; index++) {
			for(int column = 0; column<row; column++) {
				if(index==0 || column ==0 || index==row-1 ||column==row-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		scanner.close();
	}

}
