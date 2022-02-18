package Ch05;

import java.util.Scanner;

public class C02Scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //스캐너객체 생성
		
		//01 정수 
//		System.out.print("정수 입력 : ");
//		int num1 = sc.nextInt();
//		System.out.println("값 : " +num1);
		
		//02 실수
//		System.out.print("값 입력 : ");
//		double num2 = sc.nextDouble();
//		System.out.println("값 : " + num2);
	
	
		//03 문자열
//		System.out.print("문자열입력 : " );
//		String str1 = sc.next();
//		System.out.println("문자열 : " + str1);
		
		
		//04 문자열(띄어쓰기포함)
		
//		System.out.print("문자열입력 : " );
//		String str2 = sc.nextLine();
//		System.out.println("문자열 : " + str2);		
		
		//05 주의- 반복적으로 값을 받는경우 sc.nextLine()한번더사용한다
		System.out.print("1 문자열입력 : " );
		String str1 = sc.next();
		System.out.println("문자열 : " + str1);
		sc.nextLine();
		System.out.print("2 문자열입력 : " );
		String str2 = sc.nextLine();
		System.out.println("문자열 : " + str2);	
		
		
		
		
	}

}
