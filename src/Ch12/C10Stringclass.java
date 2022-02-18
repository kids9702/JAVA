package Ch12;

import java.util.Scanner;

public class C10Stringclass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println("3번째문자 : " + str.charAt(2));
		System.out.println("a문자포함여부 : " + str.contains("a"));
		System.out.println("문자열변경 : " + str.replace('t', 'T'));
		str.toUpperCase();//모든 소문자를 대문자로 변환
		str.toLowerCase();//모든 대문자를 소문자로 변환
	}

}
