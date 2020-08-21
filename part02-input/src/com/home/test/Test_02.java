package com.home.test;

import java.util.Scanner;

public class Test_02 {

	public static void main(String[] args) {
		
		// 나이를 입력 받아 "성인" 또는 "미성년자" 출력하기
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이 입력 >> ");
		int age = scanner.nextInt();
		
		String message = (age >= 20) ? "성인" : "미성년자";
		
		System.out.println("나이 " + age + "살은 " + message + "이다.");

	}

}
