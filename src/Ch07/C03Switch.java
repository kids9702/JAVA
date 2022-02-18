package Ch07;

import java.util.Scanner;

public class C03Switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num=0;
		int data=0;
		while(true)
		{
			System.out.println("---------- M E N U -----------");
			System.out.println("1. 데이터 입력 ");
			System.out.println("2. 데이터 조회 ");
			System.out.println("3. 데이터 삭제 ");
			System.out.println("4. 종료 ");
			System.out.println("---------- M E N U -----------");
			System.out.print("입력 : " );
			num = sc.nextInt();
			switch(num)
			{
				case 1:		//데이터입력
					System.out.print("값 입력 : ");
					data = sc.nextInt();
					break;
				case 2:		//데이터조회
					System.out.println("입력된 값 : " + data);
					break;
				case 3:		//데이터삭제
					data = -1;
					break;
				case 4:		//종료
					System.out.println("종료합니다");
					System.exit(0);
					
				default :	//잘못입력	
			}
			
			
		}
		

	}

}
