package Ch07;

import java.util.Scanner;

public class C02Switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("순위 입력 : ");
		int rank = sc.nextInt();
		
		switch(rank)
		{
		case 1:		//rank안의 값이 1인경우
			System.out.println("금메달");
			break;
		case 2:		//rank안의 값이 2인경우
			System.out.println("은메달");
			break;
		case 3:		//rank안의 값이 3인경우
			System.out.println("동메달");
			break;
		case 4: case 5: case 6:
			System.out.println("그외 4,5,6 등");
			break;
		default :	//그 외
			System.out.println("수고하셨습니다");	
		}
	
		
		
		
		

	}

}
