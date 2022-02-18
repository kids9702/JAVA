package Ch03;

public class C05자료형 {

	public static void main(String[] args) {
		
		
		// 정수자료형(int : 4byte 정수 , 대표자료형)

//		int var1 = 0b1011;	//2진수
//		int var2 = 0206;	//8진수
//		int var3 = 365;		//10진수
//		int var4 = 0xb3;	//16진수
//		
//		System.out.println("Var1 : " + var1);
//		System.out.println("Var2 : " + var2);
//		System.out.println("Var3 : " + var3);
//		System.out.println("Var4 : " + var4);
		
		//정수 자료형 byte (1byte(8bit)공간생성,정수값만 저장)
		
//		byte var1 = -128; // 1 0 0 0 0 0 0 0 
//		byte var2 = -30;  // 0 0 0 1 1 1 1 0 -> 11100010
//		byte var3 = 30;   // 0 0 0 1 1 1 1 0
//		byte var4 = 127;  // 0 1 1 1 1 1 1 1 
//		byte var5 = 128; //컴파일에러.. 왜생길까요?힌트..byte는 음수값을 넣을수가있어요
		
		// 00000001 = 1
		// 00000010 = 2
		// 00000011 = 3
		// 01111111 = 127
		// 10000000 = -128
		// 10000001 = -128 + 1 =-127
		// 10000010 = -128 + 2 = -126
		// 11111111 = -128 + 127=-1
		//  0 - 127 , -128 - -1  = -128 ~ +127
		
		
		//정수자료형 long(8byte 정수 저장 공간)
		
		//long var1 = 10;
		//long var2 = 20L;
		//long var3 = 10000000000; //100억 ..컴파일에러.. 왜??
		//long var4 = 10000000000L; // OK
		
		
		//실수 자료형
		// float   : 4byte 실수 
		// double  : 8byte 실수(기본)
		
//		float var1 = (float)3.14;
//		float var2 = 3.14f;
//		double var3 = 3.14;
//		
//		//정밀도 테스트
//		
//		float var4 =0.222222222222222222f;
//		double var5 =0.222222222222222222;
//		
//		System.out.println("Var4 : " + var4);
//		System.out.println("Var5 : " + var5);
//		
//		//지수형 표현
//		double var6 = 3e6; //3*10^6
//		float var7 = 3e6F; 
//		double var8 = 2e-3; //2*10^-3
//		System.out.println("var6 : " + var6);
//		System.out.println("var7 : " + var7);
//		System.out.println("var8 : " + var8);
		
		//단일문자
		//char - 2byte 공간,정수저장,양수만..
		
		char c1 = 'A';	//00000000 01000001
		char c2 = '가';	//
		System.out.println((int)c1);
		System.out.println((int)c2);
		
		
		//문자열 
		//String 클래스 자료형 
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		
		//논리자료형 boolean(true/false 저장)
		//
		boolean flag = true; 	// 1(0이 아닌 모든 수)
		boolean flag2 = false; 	// 0 
		
		
		//문제
		
		//byte var = 200;  		//x		
		//char var='AB';		//x						
		//char var=65;			//o
		//long var=50000000000;	//x						
		//float var = 3.14;		//x						
		//double var = 100.0;	//o			
		
		//String var = "나의직업은 "개발자" 입니다."; //x	
		//boolean var = 0; 		//X						
		//int v2 = 1e2;			//X							
		//float =1e2f;			//X
		
		
		
		
		
		
		
		
		
		
		
		
		//문자열(참조) 
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
