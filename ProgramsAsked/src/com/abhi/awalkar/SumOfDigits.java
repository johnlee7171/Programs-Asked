package com.abhi.awalkar;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int number = sc.nextInt();
		
		int sum=0;
		while(number !=0) {
			int lastdigit=number % 10;
			sum=sum +lastdigit;
			
			number=number/10;
			
			
		}
		System.out.printf("sum of digits of number %d is %d ",number,sum);
	}

}
