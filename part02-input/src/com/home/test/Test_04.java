package com.home.test;

import java.util.Scanner;

public class Test_04 {

	public static void main(String[] args) {
		
		// 성별을 의미하는 정수 값을 입력 받아
		// "남자", "여자" 출력하기
		// 1, 3, 5를 입력하면 "남자", 2, 4, 6을 입력하면 "여자"
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 값 입력(1~6) >> ");
		int genderNum = sc.nextInt();
		
		// String gender = genderNum == 1 || genderNum == 3 || genderNum == 5 ? "남자" : "여자";
		// genderNum 이 홀수이면  "남자"
		
		String gender = genderNum % 2 == 1 ? "남자" : "여자";
		
		System.out.println("성별은 " + gender + "이다.");
		
		sc.close();

	}

}
