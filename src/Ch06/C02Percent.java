package Ch06;

import java.util.Random;

public class C02Percent {

	public static void main(String[] args) throws InterruptedException {
		
		//짝/홀수구분
//		System.out.println(3%2==0);	//홀수
//		System.out.println(4%2==0);	//짝수
//		System.out.println(5%2==0);	//홀수
//		System.out.println(6%2==0);	//짝수
//		System.out.println(7%2==0);	//홀수
//		System.out.println(8%2==0);	//짝수
//		System.out.println(9%2==0);
//		System.out.println(10%2==0);
		
		//배수구분
//		System.out.println(3%3==0);	//홀수
//		System.out.println(4%3);	//짝수
//		System.out.println(5%3);	//홀수
//		System.out.println(6%3);	//짝수
//		System.out.println(7%3);	//홀수
//		System.out.println(8%3);	//짝수
//		System.out.println(9%3);
//		System.out.println(10%3);		
		
		
		//범위 제한 
		//수%2 = 0,1
		//수%3 =0,1,2
		//수%4 =0-3
		//수%100 = 0-99
		
		
		//자리수 확인
		int num = 987654321;
		System.out.println(num%10);
		System.out.println(num%100);
		System.out.println(num%1000);
		System.out.println(num%10000);
		System.out.println();
		System.out.println(num/10);
		System.out.println(num/100);
		System.out.println(num/1000);
		System.out.println(num/10000);
		//입력받은 수를 역순으로 바꿔서 저장하세요(숫자자료형)
		//예
		//입력 : 321
		
		//출력 : 123
		
	}

}
