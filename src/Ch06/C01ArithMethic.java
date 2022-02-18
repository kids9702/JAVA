package Ch06;

import java.util.Scanner;

public class C01ArithMethic {

	public static void main(String[] args) {
		//산술연산자(+,-,*,/,%(★))
//		int a = 15; int b=2; int c=0;
//		System.out.println("a + b = " + (a+b));
//		System.out.println("a - b = " + (a-b));
//		System.out.println("a * b = " + (a*b));
//		System.out.println("a / b = " + (a/b));
//		System.out.println("a % b = " + (a%b));//짝&홀수 //배수구분 //자리수제한//
											   //끝에서 몇번째자리..
		
		
		//복합대입연산자
//		int a = 10; 
//		int b = 20;
//		a+=b; 	// a = a+b;
//		a-=b;	// a = a-b;
//		a*=b;	// a = a*b;
//		a/=b;	// a = a/b;
		
		//비교연산자
//		int a = 10; int b = 20;
//		System.out.println("a==b ?" + (a==b));
//		System.out.println("a> b ?" + (a>b));
//		System.out.println("a>=b ?" + (a>=b));
//		System.out.println("a< b ?" + (a<b));
//		System.out.println("a<=b ?" + (a<=b));
//		System.out.println("a!=b ?" + (a!=b));
		
		//논리연산자
		
//		int a = 10; int b = 20; int c = 30;
//		//&&연산자 : AND 연산, 두조건식 모두 참이어야지 참을 반환한다
//		System.out.println("true && true ?"+(true && true));
//		System.out.println("true && false ?"+(true && false));
//		System.out.println("false && true ?"+(false && true));
//		System.out.println("false && false ?"+(false &&false));
//		System.out.println("c>b && c>a ?"+((c>b) && (c>a)));
//		
//		//||연산자 : OR연산 , 두조건식중 하나만 만족해도 참을 반환한다
//		System.out.println("true || true ?"+(true || true));
//		System.out.println("true || false ?"+(true || false));
//		System.out.println("false || true ?"+(false || true));
//		System.out.println("false || false ?"+(false || false));
//		
//		// ! : 논리부정연산자 , 참이면 거짓을/거짓이면 참을 반환
//		boolean play = true;
//		System.out.println("play : "  +  play);
//		System.out.println("!play : "  + !play);
		

		//증감연산자
		//변수안의 값을 1증가 / 1감소 시키는데 사용되는 연산자
		// ++a, a++ , --a , a--
		//전치연산자(++a,--a) : 변수안의 값을먼저증가(감소)시킨 후 다른 연산처리
		//후치연산자(a++,a--) : 다른 연산처리가 다 끝난 이후 값을 증가(감소)

//		int a = 10; int b = 20 ; int c = 0 ; int d = 0;
//		c = (a++) + (++b);
//		d = (++a) + (b--);
//		System.out.println("a : " + a);
//		System.out.println("b : " + b);
//		System.out.println("c : " + c);
//		System.out.println("d : " + d);
		
		
		//삼항연산자 (조건식)? 참인경우실행 : 거짓인경우실행
		Scanner sc = new Scanner(System.in);
		System.out.print("값 입력 : " );
		int score = sc.nextInt();
		String isok = (score>90)? "합격":"불합격";
		System.out.println("합격 여부 : " + isok);
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		//증감연산자
		//삼항연산자
	}

}
