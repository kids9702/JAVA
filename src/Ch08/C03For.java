package Ch08;

import java.util.Scanner;

public class C03For {

	public static void main(String[] args) {
		// 탈출용 변수 / 탈출조건 / 조건을만족시키기위한 연산
//		int i=0;
//		while(i<5)
//		{
//			
//			i++;
//		}
		
//		for(int i=0;i<5;i++)
//		{
//			System.out.println("Hello World");
//		}
		
		//문제 1부터 10까지의 합
		//문제 1부터 n까지의 합
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력 :");
//		int num = sc.nextInt();
//		int sum=0;
//		for(int i=1;i<=num;i++)
//		{
//			sum+=i;//sum=sum+i;
//		}
//		System.out.println("1 부터 "+num+" 까지 합 : " + sum);
		
		//문제 n부터 m까지의 합
		//문제 2단 찍기
		//문제 n단 찍기
		//문제 2 - 9 단 찍기
		//문제 2 - 9 단 찍기(역순)
		
		//문제 별찍기
		//*
		//**
		//***
		//****
		
//		int i=0; //행증가
//		int j=0; //별찍기
//		
//		for(i=0;i<4;i++)
//		{
//			for(j=0;j<=i;j++)
//				System.out.print("*");
//			System.out.println();			
//		}
		
		//   *
		//  ***
		// *****
		//*******
		// *****
		//  ***
		//   *	
		
//		i			j			k
//		0			0-2			0-0
//		1			0-1			0-2
//		2			0-0			0-4
//		3			x			0-6
//		--------------------------------
//					j=0			k=0
//					j<(h/2)-i	k<=2*i
//
//		4			0-0			0-4
//		5			0-1			0-2
//		6			0-2			0-0
//		--------------------------------
//					j=0				k=0
//					j<=i-(h/2+1)	k<=((h-1)*2)-2*i
	
		Scanner sc = new Scanner(System.in);
		System.out.print("높이 입력 : " );
		int h = sc.nextInt();
		
		for(int i=0;i<h;i++)
		{
			if(i<=h/2) 
			{
				//공백감소 , 별증가
				//공백
				for(int j=0;j<(h/2)-i;j++)
				{
					System.out.print(" ");
				}
				//별
				for(int k=0;k<=2*i;k++)
				{
					System.out.print("*");
				}
			}
			else
			{
				//공백증가, 별감소
				//공백
				for(int j=0;j<=i-(h/2+1);j++)
				{
					System.out.print(" ");
				}
				//별
				for(int k=0;k<=((h-1)*2)-2*i;k++)
				{
					System.out.print("*");
				}
			
				
			}
			
			
			
			System.out.println();
		}
		
		
		
		

	}

}
