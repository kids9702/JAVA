package Ch05;

import java.util.Scanner;

public class C03Scanner {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
//		System.out.printf("두수 입력 : ");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		System.out.println("두 수의 합  : " + (num1+num2));
		
		
		System.out.print("이름 : ");
		String name=sc.nextLine();
		System.out.print("주민등록번호 : " );
		String id = sc.nextLine();
		System.out.print("전화번호 : " );
		String phone = sc.nextLine();
		System.out.println("이름 : " + name +" ID : " + id + " 전화번호 :" + phone);
		
		
		
		
		

	}

}
