package Ch13;

import java.util.Scanner;

public class C02Prac {

	public static void main(String[] args) {

		//문제
		//국어, 영어, 수학, 과학 점수를 int형 배열에 각각 입력받아서
		//해당 요소의 값을 출력, 총합과 평균도 함께 출력하세요
		
				int[] a = new int[4];
				Scanner sc = new Scanner(System.in);
				System.out.print("국/영/수/과 점수 입력 : ");
				for(int i=0;i<a.length;i++) {
					a[i]=sc.nextInt();
				}
				//입력된 값 확인
				int sum = 0;
				double avg=0.0;
				for(int i=0;i<a.length;i++) {
					System.out.println(a[i]);
					sum+= a[i];	//sum = sum+a[i]
				}
				avg = (double)sum/a.length;
				System.out.println("총합 : " + sum);
				System.out.println("평균 : " + avg);
				
	}

}
