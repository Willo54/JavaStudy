package com.home.ex;

import java.util.Scanner;

public class Ex03_Scanner {

	public static void main(String[] args) {
		
		// \n: 줄바꿈
		
		Scanner scanner = new Scanner(System.in);
		
		// nextInt(), nextDouble() 숫자 뒤 \n을 통해 숫자로 인식
		
		// 2) 입력
		System.out.print("나이 입력 >> ");  // 20\n
		int age = scanner.nextInt();  // age=20, \n은 남겨둠
		
		System.out.print("키 입력 >> ");  // \n180.5\n
		double height = scanner.nextDouble();  // height=180.5, \n은 남겨둠
		
		System.out.print("이름 입력 >> ");  // \n홍 길동\n
		String name = scanner.nextLine();  // name=\n, 홍 길동\n은 남겨둠
				
		System.out.print("성별 입력 >> ");
		char gender = scanner.next().charAt(0);
		
		// 3) 출력
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("성별 : " + gender);
		
		scanner.close(); // 생략 가능(JVM이 스스로 닫음.)
		
		// nextDouble() 메소드 다음 nextLine() 메소드를 실행하려고 할 때 nextLine()가
		// 그냥 넘어가버리는 오류가 생긴다. 이 이유는 nextDouble() 메소드를 실행 할 때 180.5을 
		// 입력 후 엔터를 누를 때 180.5를 리턴 시켰지만 Enter값은 버퍼에 그대로 남아 있다. nextLine()
		// 메소드는 Enter값을 기준으로 메소드를 종료시키기 때문에 nextLine()가 실행될 때 남아 있는
		// Enter값을 그대로 읽어 바로 종료된 것이다.
		// 만약 실수를 입력하고 그 다음 문자를 입력하려고 할 떄, next() 메소드를 사용하거나
		// 아니면 위에 nextLine() 메소드를 한번 더 써줘서 enter 값을 없애줘야 한다.
	}

}
