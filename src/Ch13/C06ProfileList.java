package Ch13;

import java.util.Scanner;

public class C06ProfileList {

	public static void main(String[] args) {
		//int 형 배열로 성별(0,1),나이,키,몸무게 저장
		
		int[][] profile = new int [3][4];
		String[]name = new String[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<name.length;i++) {
			System.out.print("이름 : ");
			name[i]=sc.nextLine();
			
			System.out.print("성별(0:W,1:M/키/몸무게 순 입력 : ");
			for(int j=0;j<4;j++) {
				
				
				profile[i][j]=sc.nextInt();
				
			}
			sc.nextLine();
			
		}
		//출력
		System.out.print("이름\t성별\t나이\t키\t몸무게\n");
		for(int i=0;i<3;i++) {
			System.out.println(name[i]+"\t");
			for(int j=0;j<4;j++) {
				System.out.print(profile[i][j]+"\t");
			}
			System.out.println();
		}
		//문제
		//1부터 9까지의 수를 3X3 배열에 넣어보세요
		
		//2단 구구단을 9X3 배열에 넣어보세요

		//3명의 학생의 국/영/수 점수를 배열로 입력받아 전체 총합과 평균을 구하시오
		//예                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
		//학생1 점수 입력(국/영/수) : 100,50,60
		//학생2 점수 입력(국/영/수) : 100,50,60
		//학생3 점수 입력(국/영/수) : 100,50,60
		//그리고 모든 학생의 국어점수 총점과 평균을 구하시오
		//그리고 모든 학생의 수학점수 총점과 평균을 구하시오
		//그리고 모든 학생의 영어점수 총점과 평균을 구하시오
	}

}
