package Ch07;

import java.util.Scanner;

public class C01IF {

	public static void main(String[] args) {
		
		//단순 if문
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 입력 : " );
//		int age = sc.nextInt();
//		if(age>=8)
//		{
//			System.out.println("학교를 다닐 나입니다");
//		}
//		//System.out.println("첫번째 IF 벗어남");	
//		if(age<8)
//		{
//			System.out.println("미취학 아동입니다");
//		}
//		//System.out.println("두번째 IF 벗어남");	
		
		//if-else
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 입력 : " );
//		int age = sc.nextInt();
//		if(age>=8)
//		{
//			System.out.println("학교를 다닐 나입니다");
//		}
//		else
//		{
//			System.out.println("미취학 아동입니다");
//		}
		 	
		
		// 문제
		// 키보드로부터 두수를 입력받아 두수의 합이
		// 100보다 크면 '100보다 큽니다', 작으면 '100보다 작습니다'를 출력
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("두 수입력 : " );
//		int num1 =sc.nextInt();
//		int num2 =sc.nextInt();
//		int sum = num1 + num2;
//		if(sum >=100)
//		{
//			System.out.println(sum + "은 100보다 큽니다");
//		}
//		else
//		{
//			System.out.println(sum + "은 100보다 작습니다");	
//		}
		
		
		// 문제
		// 국어,영어,수학 점수를 입력받아서
		// 세수의 합과 평균을 구한 뒤
		// 평균이 60점이상이면 합격입니다를 출력하세요
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("입력(국/영/수) : " );
//		int kor = sc.nextInt();
//		int eng = sc.nextInt();
//		int mat = sc.nextInt();
//		int sum = kor + eng +mat;
//		double avr = (double)sum/3;
//		if(avr >= 60)
//		{
//			System.out.println("합격");
//		}
//		else
//		{
//			System.out.println("불합격");	
//		}
//		
		
		
		
		//if 문 중첩
		
		//짝수 홀수 구분(%)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int num = sc.nextInt();
//		if(num%2==0)
//		{
//			System.out.println(num + " 는 짝수입니다");
//		}
//		else
//		{
//			System.out.println(num + " 은 홀수입니다");
//		}
		
		//배수구분

//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int num = sc.nextInt();
//		if(num%3==0)
//		{
//			System.out.println(num + " 는 3의 배수 입니다");
//		}
//		else
//		{
//			System.out.println(num + " 은 3의 배수가 아닙니다");
//		}
		
		
		//짝수 이면서 3의배수이면 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int num = sc.nextInt();
//		
//		if(num%2==0) //짝수냐?
//		{
//			//짝수인경우
//			if(num%3==0)
//			{
//				System.out.println(num+"는 짝수이면서 3의배수");
//			}
//			else
//			{
//				System.out.println(num+"는 짝수입니다");
//			}
//		}
//		else  
//		{
//			//홀수인경우
//			System.out.println(num + "는 홀수입니다");
//		}
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int num = sc.nextInt();
//		
//		if(num%2==0 && num%3==0)
//		{
//			System.out.println("짝수이면서 3의배수다");
//		}
//		else
//		{
//			
//		}
		
		//문제 
		
		//입력한 수가 3의배수이면서 4의 배수이면 출력
		//입력한 수가 3의배수가아니면서 5의배수이면 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int num = sc.nextInt();
//		if(num%3==0)	//3의 배수냐?
//		{
//			//3의 배수인경우
//			if(num%4==0)
//			{
//				//3의배수이면서 4의배수인경우
//			}
//		}
//		else
//		{
//			//3의 배수가 아닌경우
//			if(num%5==0)
//			{
//				//3의배수가 아니면서 5의배수인경우
//			}
//		}
		
		
		
		// 문제
		//세 수를 입력받아서 가장 큰수를 출력하세요
		//예)
		//입력 : 5 10 7
		//큰수 : 10
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자 입력(3개) : ");
//		int n1 = sc.nextInt();	
//		int n2 = sc.nextInt();
//		int n3 = sc.nextInt();
//		
//		//n1이제일 큰경우
//		if(n1>=n2 && n1>=n3)
//		{
//			System.out.println("큰수 : " +n1);
//		}
//		//n2이제일 큰경우
//		if(n2>=n1 && n2>=n3)
//		{
//			System.out.println("큰수 : " +n2);
//		}
//		//n3이제일 큰경우
//		if(n3>=n1 && n3>=n2)
//		{
//			System.out.println("큰수 : " +n3);
//		}
		
		
		
		
		//else if 문제
		//국어/영어/수학 점수를 입력받아 
		//국어/영어/수학각각점수가 40점이상이고
		//평균이 60점이상이면 합격 //아니면 불합격
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자 입력(3개) : ");
//		int kor = sc.nextInt();	
//		int eng = sc.nextInt();
//		int mat = sc.nextInt();
//		double avr = (double)(kor+eng+mat)/3;
//		
//		if(kor<40)
//		{
//			System.out.println("불합격");
//		}
//		else if(eng<40)
//		{
//			System.out.println("불합격");
//		}
//		else if(mat<40)
//		{
//			System.out.println("불합격");
//		}
//		else if(avr<60)
//		{
//			System.out.println("불합격");
//		}
//		else
//		{
//			System.out.println("합격");
//		}
		
		//나이별로 요금을 부과하는 else if 문을 만드세요
		//8세미만 :  요금 = 1000원
		//14세미만 : 요금 = 2000원
		//20세미만 : 요금 = 2500원
		//20세이상 : 요금 = 3000원
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		if(age<8 )
		{
			
		}
		else if(age <14)
		{
			
		}
		else if(age <20)
		{
			
		}
		else
		{
			
		}
		
		
		
		
		
		
		

	}

}
