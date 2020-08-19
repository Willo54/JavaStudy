package com.home.ex;

public class Ex09_operator1 {

	public static void main(String[] args) {

		/*
		 * 1. 산술 연산자
		 * 	1) +
		 * 	2) -
		 *  3) *
		 *  4) / : 정수(몫), 실수(나누기)
		 *  5) % : 정수(나머지)
		 *  
		 * 2. 대입 연산자
		 *  1) = : 대입
		 *  2) + : 더해서 대입
		 *  3) - : 빼서 대입
		 *  4) * : 곱해서 대입
		 *  5) /= : 몫을 구해서 대입, 나눠서 대입
		 *  6) %= : 나머지를 구해서 대입
		 *  
		 * 3. 증감 연산자
		 * 	1) a++ : a를 사용하고 1 증가
		 *  2) ++a : a를 1 증가시켜서 사용
		 *  3) a-- : a를 사용하고 1 감소
		 *  4) --a : a를 1 감소시켜서 사용
		 *  
		 *   
		 * 
		 */
		
		// 임의의 2자리 정수(10 ~ 99)를 선언하고, 
		// 그 수가 카프리카수  인지 판단해서 맞으면 true, 아니면 false를 저장
		
		int n = 9;
		int square = n * n;
		int front = square / 100; // 분리된 앞자리(20)
		int back = square % 100; // 분리된 뒷 자리(25)
		boolean isKaprekar = n == front + back;
		System.out.println(isKaprekar);
			
		}
	}

