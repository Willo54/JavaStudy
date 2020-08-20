package com.home.ex;

import java.util.Scanner;

public class Ex02_Scanner {

	public static void main(String[] args) {
		
		// import 하는 방법
		// 클래스명을 끝까지 쓰지 않고, 자동완성(Ctrl + SpaceBar)을 이용한다.
		
		// 1) Scanner 클래스의 scanner 객체 생성
		Scanner scanner = new Scanner(System.in);
		
		// 2) 입력
		System.out.print("이름 입력 >> ");
		String name = scanner.nextLine(); // 성명에 공백이 포함될 수 있다.
		
		System.out.print("나이 입력 >> ");
		int age = scanner.nextInt(); 
		
		System.out.print("키 입력 >> ");
		double height = scanner.nextDouble(); 
		
		System.out.print("성별 입력 >> ");
		char gender = scanner.next().charAt(0); // 입력받은 문자열의 첫 번째 글자만 사용
		
		// 3) 출력
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "살");
		System.out.println("키 : " + height + "cm");
		System.out.println("성별 : " + gender);
		
		scanner.close(); // 생략 가능 (JVM이 스스로 닫음.)

	}

}
