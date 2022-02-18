package Ch09;

import java.util.Scanner;

class Calculator{

	//속성
	Scanner sc = new Scanner(System.in);
	
	int sum1(int x , int y) //함수의 헤더 (반환값,함수명,매개변수) - 사용방법 
	{						//함수의 본체 시작
		return x+y;
	}						//함수의 본체 끝
	void sum2(int x, int y){
		System.out.println("void sum2(x,y) : " + (x+y));
	}
	
	int sum3() {
		System.out.print("두 수 입력");
		int x=sc.nextInt();
		int y=sc.nextInt();
		return x+y;
	}
	
	void sum4() {
		System.out.print("두 수 입력");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("void sum4() : " + (x+y));
		
	}
	
	//뺄셈
	//int sub(int x , int y); //큰수에서 작은수를 뺀값을 리턴
	//int sub(); //두수를 scanner로 받아서 큰수에서 작은수를 뺀값을 리턴
	//void sub(int x , int y) //큰수에서 작은수를 뺀값을 출력
	//void sub() //Scanner로 두수 받고 큰수에서 작은수를 뺀값을 출력
	
	
	

}
public class C07FunctionMain {

	public static void main(String[] args) {
		Calculator cal  = new Calculator();
		int result = cal.sum1(10,20); //call 인자를 10, 20을 전달
		System.out.println("Sum1(10,20)의 결과 : " + result);
		
		cal.sum2(50,60);
		
		int result2 = cal.sum3();
		System.out.println("int sum3() : " + result2);
		
		cal.sum4();
		
	}

}
