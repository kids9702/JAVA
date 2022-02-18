package Ch14;

import java.util.Scanner;

//디자인패턴
//제품 제작시 사전에 발견되었던 문제들을 해결하고 정형화 시켜놓은 작업패턴
//디자인 패턴은 제작자들간의 의사소통 수단의 일종이다.

//프로그래밍언어의 디자인 패턴
//프로그램 제작시 사전에 발견되었던 문제들을 해결해놓은 졍형화된 작업패턴

//싱글톤 패턴
//하나의 객체를 생성하여 다수의 클라이언트가 접속해 사용하는 형태
//ex) DB Connection 이나 서비스형 객체에 사용된다.

class Company{
	//멤버변수
	private static Company instance = new Company();
	int num1;
	int num2;
	//생성자
	private Company() {}
	//멤버메서드
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
	
}


class Calculator{
	//멤버변수
	private static Calculator instance = new Calculator();
	Scanner sc = new Scanner(System.in);	//스캐너 공유
	
	//생성자
	private Calculator() {}
	//멤버메서드
	public static Calculator getInstance() {
		if(instance == null) {
			instance = new Calculator();
		}
		return instance;
	}
	//덧셈함수
	int sum() {
		System.out.print("몇개의 수를 받겠습니까?");
		int num = sc.nextInt();
		int sum=0;
		for(int i=0;i<num;i++) {
			System.out.print((i+1) + " 번째 값 :");
			int tmp=sc.nextInt();
			sum+=tmp;
		}
		return sum;
	}
	
	
}

public class C05SingleTonMain {

	public static void main(String[] args) {

//			Company com1 = Company.getInstance();
//			Company com2 = Company.getInstance();
//			com1.num1 = 100;
//			com1.num2 = 200;
			Calculator one = Calculator.getInstance();
			Calculator two = Calculator.getInstance();
			System.out.println(one);
			System.out.println(two);
			
			System.out.println(one.sum());
		
			
			//문제
			//식당예약(Reservation) 클래스를 만듭니다.
			//식당의 잔여방(Room)의 개수는 static으로 저장합니다.
			//식당예약 메서드를 사용하면 room이 감소되도록 설정합니다
			//현재 잔여방의 개수를 출력하는 메서드도 만듭니다
			
			//속성
			//-root : static int
			
			//기능
			//+setReservation():void -> room 감소
			//+showRoom():void -> 잔여  room 확인

	}

}
