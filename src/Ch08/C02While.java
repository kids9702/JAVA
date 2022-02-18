package Ch08;

import java.util.Scanner;

public class C02While {

	public static void main(String[] args) {
		
		// 2 - 9단까지 정순 출력
		
//		int dan=2;
//		while(dan<=9)
//		{
//			int num=1;
//			while(num<=9)
//			{
//				System.out.println(dan + " x " + num +" = "+(dan*num));
//				num++;
//			}
//			System.out.println();
//			
//			dan++;
//		}
//		
//	}
	
	//전체 구구단을 역순출력해봅니다
	// 9 x 9 = 81
	// 9 x 8 = 72
	// 9 x 7 = 63
	// ..
	// 9 x 1 = 9
	//
	// 8 x 8 = 64
	//..
	
//		int dan=9;
//		while(dan>1)
//		{
//			int num=9;
//			while(num>0)
//			{
//				System.out.println(dan + " x " + num +" = "+(dan*num));
//				num--;
//			}
//			System.out.println();
//			
//			dan--;
//		}
	
		
		
	
	
	//*****
	//*****
	//*****
	//*****
	
//	int i=0;
//	int j=0;
//	while(i<4)
//	{
//		j=0;
//		while(j<=4)
//		{
//			System.out.print("*");
//			j++;
//		}
//		System.out.println();
//
//		i++;
//	}
	
		
		
	//*
	//**
	//***
	//****
//	int i=0;
//	int j=0;
//	while(i<4)
//	{
//		j=0;
//		while(j<=i)
//		{
//			System.out.print("*");
//			j++;
//		}
//		
//		System.out.println();
//		i++;
//	}
		
		
	//****
	//***
	//**
	//*
	
//	int i=0;int j=0;
//	while(i<4)
//	{
//		j=0;
//		while(j<=3-i) {
//			
//			System.out.print("*");
//			j++;
//		}
//		
//		
//		System.out.println();
//		i++;
//	}
	
	//입력받은 만큼 삼각형 찍기
	//입력:5
	//*
	//**
	//***
	//****
	//*****
//	Scanner sc = new Scanner(System.in);
//	System.out.print("입력 :" );
//	int h = sc.nextInt();
//	int i=0;	//행구분
//	int j=0; 	//별찍기
//	
//	while(i<h)
//	{
//		j=0;
//		while(j<=i)
//		{
//			System.out.print("*");
//			j++;
//		}
//		System.out.println();
//		i++;
//	}
	
	
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력 :" );
//		int h = sc.nextInt();
//		int i=0;	//행구분
//		int j=0; 	//별찍기
//	
//		while(i<h)
//		{
//			j=0;
//			while(j<=(h-1)-i)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
	
	
//	    *
//	   ***
//	  *****
//	 *******

//	int i=0;	//행증가	
//	int j=0;	//공백
//	int k=0;	//별
//	
//	while(i<4)
//	{
//		//공백찍기
//		j=0;
//		while(j<3-i)
//		{
//			System.out.print(" ");
//			j++;
//		}
//		//별찍기
//		k=0;
//		while(k<=2*i)
//		{
//			System.out.print("*");
//			k++;
//		}
//		
//		System.out.println();
//		i++;
//	}
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력 :" );
//		int h = sc.nextInt();
//
//		int i=0;	//행증가	
//		int j=0;	//공백
//		int k=0;	//별
//		
//		while(i<h)
//		{
//			//공백찍기
//			j=0;
//			while(j<=(h-2)-i)
//			{
//				System.out.print(" ");
//				j++;
//			}
//			//별찍기
//			k=0;
//			while(k<=2*i)
//			{
//				System.out.print("*");
//				k++;
//			}
//			
//			System.out.println();
//			i++;
//		}
		
	
		
	//*********
	// *******
	//  *****
	//   ***
	//    *

//	int i=0;
//	int j=0;
//	int k=0;
//	
//	while(i<5)
//	{
//		//공백
//		j=0;
//		while(j<=i-1)
//		{
//			System.out.print(" ");
//			j++;
//		}
//		//별
//		k=0;
//		while(k<=8-2*i)
//		{
//			System.out.print("*");
//			k++;
//		}
//		
//		
//		System.out.println();
//		i++;
//	}
	
	
	
	//    *
	//   ***
	//  *****
	// *******
	//  *****
	//   ***
	//    *

//	int i=0,j=0,k=0;
//	
//	while(i<7)
//	{
//		if(i<4)
//		{
//			//공백
//			j=0;
//			while(j<3-i)
//			{
//				System.out.print(" ");
//				j++;
//			}
//			//별
//			k=0;
//			while(k<=2*i)
//			{
//				System.out.print("*");
//				k++;
//			}
//		}
//		else
//		{
//			//공백
//			j=0;
//			while(j<=i-4)
//			{
//				System.out.print(" ");
//				j++;
//			}
//			//별
//			k=0;
//			while(k<=12-2*i)
//			{
//				System.out.print("*");
//				k++;
//			}
//		
//		}
//		System.out.println();
//		i++;
//	}

	


//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 입력 : ");
//		int h = sc.nextInt();
//		int i=0,j=0,k=0;
//		
//		while(i<h)
//		{
//			if(i<((h/2)+1))
//			{
//				//공백
//				j=0;
//				while(j<(h/2)-i)
//				{
//					System.out.print(" ");
//					j++;
//				}
//				//별
//				k=0;
//				while(k<=2*i)
//				{
//					System.out.print("*");
//					k++;
//				}
//			}
//			else
//			{
//				//공백
//				j=0;
//				while(j<=i-(h/2+1))
//				{
//					System.out.print(" ");
//					j++;
//				}
//				//별 
//				k=0;
//				while(k<=((h-1)*2)-2*i)
//				{
//					System.out.print("*");
//					k++;
//				}
//			
//			}
//			System.out.println();
//			i++;
//		}
		
	
	
//	*********	
//	 *******
//	  *****
//	   ***
//	    *	
//	    *
//	   ***
//	  *****
//	 *******
//	*********

		int i=0;
		int j=0;
		int k=0;
		
		while(i<5)
		{
			//공백
			j=0;
			while(j<=i-1)
			{
				System.out.print(" ");
				j++;
			}
			//별
			k=0;
			while(k<=8-2*i)
			{
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}
	
		i=0;
		j=0;
		k=0;	
		while(i<5)
		{
			//공백찍기
			j=0;
			while(j<4-i)
			{
				System.out.print(" ");
				j++;
			}
			//별찍기
			k=0;
			while(k<=2*i)
			{
				System.out.print("*");
				k++;
			}
			
			System.out.println();
			i++;
		}
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("두 수를 입력하세요 : ");
//		int n1=sc.nextInt();
//		int n2=sc.nextInt();
//		if(n2>n1)
//		{
//			int i=1;
//			while(i<=9)
//			{
//				 int j=n1;
//				 while(j<=n2)
//				 {
//					 System.out.print(j +" x " + i+ "=" + (j*i)+" ");
//					 j++;
//				 }
//				 System.out.println();
//				
//				i++;
//			}
//			
//		}
//		else
//		{
//			int i=1;
//			while(i<=9)
//			{
//				 
//				i++;
//			}
//			
//		}
//	
//	
//	
//	sc.close();
	
	}

}
