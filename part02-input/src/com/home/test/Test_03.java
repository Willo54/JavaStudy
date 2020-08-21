package com.home.test;

import java.util.Scanner;

public class Test_03 {
	
	

	public static void main(String[] args) {
		
		// 매출액과 등급("VIP", "일반")을 입력 받아
		// 등급이 "VIP"이면 매출액에서 20%를 할인하고,
		// 등급이 "일반"이면 매출액에서 5%를 할인해서 실제 매출액 출력하기
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("매출액 입력 >> ");
		int salesMoney = scanner.nextInt();
		
		System.out.print("등급 입력(VIP, 일반) >> ");
		String grade = scanner.next();
		
		// 100% : 1
		// 10% : 0.1
		// 1% : 0.01
		
		// equals() 메소드는 대소문자를 구분해서 비교한다.
		// double earn = grade.equals("VIP") ? salesMoney * (1 - 0.2) : salesMoney * (1 - 0.05);
				
		// equalsIgnoreCase() 메소드는 대소문자를 구분하지 않는다.
		double earn = grade.equalsIgnoreCase("VIP") ? salesMoney * (1 - 0.2) : salesMoney * (1 - 0.05);
		
		// 아래 식은 / 가 나누기가 아닌 몫을 구하는 연산자이므로 사용할 수 없다.
		// double earn = grade.equalsIgnoreCase("VIP") ? salesMoney / 100 * 80 : salesMoney / 100 * 95;
				
		System.out.println("실제 매출=" + (int)earn + "원");

	}

}
