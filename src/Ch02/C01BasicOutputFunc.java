package Ch02;

public class C01BasicOutputFunc {
	
	public static void main(String[] args) {
	
		//System.out 
		//System : 운영체제(OS)..
		//out : 출력장치
		
		//System.out.print()
		//Escape 문자 
		
//		System.out.print("HelloWorld\n");
//		System.out.print("HelloWorld\n");
//		System.out.print("HelloWorld\n");
//		System.out.print("Hello\tWorld\n");
		
		
//		   *
//		  ***
//		 *****
//		*******
		
		//System.out.printf() : format:형식,서식..
		
//		System.out.printf("%d+%d=%d \n",10,20,10+20); //%d :10진 정수 서식문자
//		System.out.printf("%f %f %f \n",10.2, 20.1,30.1); //%f : 10진 실수 서식문자
//		System.out.printf("%c %c %c \n",'a','b','c'); //%c : 한문자 서식
//		System.out.printf("%s %s %s \n","This is ", "StringFormat" , "Test");//%s 문자열서식
//		System.out.printf("%d.%s : %d\n", 1,"성적",100); //여러서식 함께 사용
		
		// 문제
		// 서식문자를 이용해서 다음과 같은 문장을 완성하세요
		// 나의 이름은 %s 입니다
		// 나의 나이는 %d 살입니다
		System.out.printf("나의 이름은 %s 입니다\n", "홍길동");
		System.out.printf("나의 나이는 %d 살 입니다\n", 30);
		
		// System.out.println()  : 자동 줄바꿈 출력메서드 
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		
		
		//문제 
		//다음과 같이 출력해보세요(서식문자 사용할것 , \n, \t 사용할것)
		//1
		
//		NO		이름		나이		주소
//		1		홍길동	44		대구
//		2		이태수	45		서울
//		3		이지성	34		울산
		
		System.out.printf("%s\t%s\t%s\t%s\n", "NO","이름","나이","주소");
		System.out.printf("%d\t%s\t%d\t%s\n", 1,"홍길동",44,"대구");
		
		
//		//2
//		Code		도서명		출판사		가격
//		1010		윤성우C		오렌지미디어	29000
//		2020		DOITJAVA	이지퍼블리싱	25000
//		3030		자바의정석		00미디어		30000
		System.out.printf("%s\t\t%s\t\t%s\t\t%s\n", "Code","도서명","출판사","가격");
		System.out.printf("%d\t\t%s\t\t%s\t\t%d\n", 1010,"윤성우C","99출판사",29000);
		System.out.printf("%d\t\t%s\t%s\t\t%d\n", 2020,"DOITJAVA","99출판사",25000);
		
		

	}

}
