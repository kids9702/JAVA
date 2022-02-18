package Ch13;

import java.util.Scanner;

//array : 연결하다
public class C01BasicArray {

	public static void main(String[] args) {

		//길이가 5인 int형 배열 생성
		int[] arr1 = new int[5];
		System.out.println(arr1);
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		arr1[3]=40;
		arr1[4]=50;
		System.out.println("배열길이 : " + arr1.length);
		
		//반복문(내용확인)
		for(int i=0;i<arr1.length;i++) {
			System.out.println(i+" idx요소값 : " + arr1[i]);
		}
		//반복문(입력하기)
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr1.length;i++) {
			System.out.printf("arr[%d]= ",i);
			arr1[i]=sc.nextInt();
		}
		//반복문(내용확인)
		for(int i=0;i<arr1.length;i++) {
			System.out.println(i+" idx요소값 : " + arr1[i]);
		
	}
		double[] arr2=new double[7];
		float[] arr3;
		arr3=new float[15];
		
		//문제
		//국어, 영어, 수학, 과학 점수를 int형 배열에 각각 입력받아서
		
		int[] a = new int[4];
		a[0] = 70;	//국어
		a[1] = 50;	//영어
		a[2] = 30;	//수학
		a[3] = 60; 	//과학
		
		//해당 요소의 값을 출력, 총합과 평균도 함께 출력하세요
				System.out.println();
		
		
		
		
		
	}
}
