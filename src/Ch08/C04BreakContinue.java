package Ch08;

import java.util.Scanner;

public class C04BreakContinue {
	public static void main(String[] args) {
		
		//-1(종료)을 입력하기 전까지 계속 정수를 입력받아
		//입력받은 모든 값의 합을 구하세요
//		Scanner sc = new Scanner(System.in);
//		long sum = 0;	//값 누적용
//		int tmp=0;		//임시 값 저장용
		
//		for(;;)
//		{
//			System.out.print("입력(종료:-1) : " );
//			tmp=sc.nextInt();
//			if(tmp==-1)
//				break;  //가장 인접해 있는 반복문을 탈출 
//			
//			sum = sum+tmp;	//sum에 누적
//			
//		}
//		System.out.println("모든 값의 합 : " + sum);
		
		
		//모든 구구단수를 출력(2-9단 출력 for) -중첩 반복문 모두를 벗어나는 break
		// 7 x 7 = 49
		
		boolean flag=false;
		
		for(int dan=2;dan<=9;dan++)
		{
			
			for(int i=1;i<=9;i++)
			{
				System.out.println(dan + " x " + i +" = " + (dan*i));
				if(dan==7 && i==7)
				{
					flag=true;
					break;
				}
				
			}
			if(flag==true)
				break;
			System.out.println();
			
		}
		
		
		//continue  : 반복문의 조건으로 돌아감
		
		
		//1부터 20까지 수중에 3의 배수만 제외한 합을 구하라
//		int i=1;
//		int sum=0;
//		while(i<=20)
//		{
//			
//			if(i%3==0)
//			{	
//				i++;
//				continue;
//			}
//			
//			System.out.println(i);
//			
//			i++;
//		}
		
		
//		for(int i=1;i<=20;i++)
//		{
//			if(i%3==0)
//				continue;
//			
//			System.out.println(i);
//		}
		
		
		
		
		//문제 1부터 n까지의 수중에 짝수이면서 3의배수의  합만 더해보세요(continue)
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0 || i%3!=0)
				continue;
			sum = sum + i;
			System.out.print(i + " ");
		}
		
		System.out.println("\n합 : " + sum);
		
		
	
		

	}

}
