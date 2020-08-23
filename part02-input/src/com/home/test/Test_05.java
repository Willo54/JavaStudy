package com.home.test;

import java.util.Scanner;

public class Test_05 {

	public static void main(String[] args) {

		// 국어, 영어, 수학 점수를 입력받아
		// 평균과 학점 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 >> ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 입력 >> ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 입력 >> ");
		int mat = sc.nextInt();
		
		double avg = (kor + eng + mat) / 3.0;
		char grade = avg >= 90 ? 'A' : 
					 avg >= 80 ? 'B' : 
				     avg >= 70 ? 'C' :
				     avg >= 60 ? 'D' : 'F';

		System.out.println("평균 : " + avg + "점, 학점 : " + grade + "학점이다.");
		System.out.printf("평균은 %10.2f점, 학점은 %c학점이다.", avg, grade);

	}

}
