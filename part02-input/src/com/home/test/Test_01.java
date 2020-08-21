package com.home.test;

public class Test_01 {

	public static void main(String[] args) {
		
		// 임의의 두 정수를 입력 받아 a, b에 저장한 뒤
		// 두 변수의 값을 교환하여 출력하기
		
		int a = 10;
		int b = 20;
		
		int temp = a; // 임시 변수
			a = b;
			b = temp;
			
		System.out.println(a);
		System.out.println(b);

	}

}
