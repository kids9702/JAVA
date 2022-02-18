package Ch05;

import java.util.Scanner;

public class C01Scanner {

	public static void main(String[] args) {
			
		//System.out : System이 가지고 있는 프로그램->출력장치로 스트림 생성
		//System.in : System이 가지고 있는 입력장치->프로그램 방향으로 스트림 생성
		
		Scanner sc = new Scanner(System.in);
		// new :  객체 생성 예약어
		// Scanner : 입력값을 받는용도로 사용되는 클래스 자료형
		// Scanner() : 스캐너 객체를 생성하는데 사용되는 메서드(생성자 메서드)
		// Scanner(System.in):표준입력스트림(키보드->APP)을 스캐너객체에 연결
		// 키보드에서 입력한 내용을 Scanner객체가 받을 수 있도록 설정
		// Scanner sc  : 스캐너 객체를 컨트롤하기위해서 그위치값이 저장된 참조변수
		
 		
		System.out.print("정수 입력 : " );
		int num = sc.nextInt();
		System.out.println("입력한값 : " + num);
		
		
		
		

	}

}
