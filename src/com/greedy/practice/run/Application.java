package com.greedy.practice.run;

import java.util.Scanner;

import com.greedy.answer.OperationPractice;

public class Application {

	public static void main(String[] args) {
		
		OperationPractice ca1 = new OperationPractice();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문제1. 정수를 입력하세요 : " );
		int num1 = sc.nextInt();
		String an1 = ca1.practice1(num1);
		System.out.println(an1);
		
		System.out.print("문제2. 정수를 입력하세요 : " );
		int num2 = sc.nextInt();
		String an2 = ca1.practice2(num2);
		System.out.println(an2);
		
		System.out.print("문제3. 정수를 입력하세요 : " );
		int num3 = sc.nextInt();
		String an3 = ca1.practice3(num3);
		System.out.println(an3);
		
		System.out.print("문제4. 인원수를 입력하세요 : " );
		int h1 = sc.nextInt();
		System.out.print("문제4. 사탕 갯수를 입력하세요 : " );
		int c1 = sc.nextInt();
		String an4 = ca1.practice4(h1,c1);
		System.out.println(an4);
		
		sc.nextLine();
		
		System.out.print("문제 5. 이름 : ");
		String name = sc.nextLine();
	
		//확인
		System.out.print("학년 : ");
		int grade = sc.nextInt();
				
		System.out.print("반 : ");
		int part = sc.nextInt();
			
		System.out.print("번호 : ");
		int nm = sc.nextInt();
		;
		
		sc.nextLine();
				
		System.out.print("성별(M/F) : " );
		char gender = sc.nextLine().charAt(0);
		String an5 = ca1.practice5(gender);//???
		
		System.out.print("성적 : ");//?
		double rate = sc.nextDouble();
		
		System.out.println(grade + "학년 " + part + "반 " + nm + "번 " + name + " 2이름 " + an5 + "의 성적은 " + rate +"이다.");
		
				
		/* 
		 * 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
		   이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.
		   
		   ex.
		   이름 : 홍길동
		   학년(숫자만) : 3
		   반(숫자만) : 4
		   번호(숫자만) : 15
		   성별(M/F) : M
		   성적(소수점 아래 둘째자리까지) : 85.75

		   3학년 4반 15번 홍길동 남학생의 성적은 85.75이다.
	     */
		
		System.out.print("문제6. 나이를 입력하세요 : " );
		int age = sc.nextInt();
		String an6 = ca1.practice6(age);
		System.out.println(an6);
		
		sc.nextLine();
		System.out.print("문제 7. 주민번호를 입력하세요 : " );
		char pn = sc.nextLine().charAt(7);
		String an7 = ca1.practice7(pn);
		System.out.println("입력하신 문자는 " + an7 + "입니다.");
		
		/*
		 * 주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요
		 * ex.
		 * 주민번호를 입력하세요(- 포함) : 132456-2123456
		 * 여자
		*/
		
		
	}

}
