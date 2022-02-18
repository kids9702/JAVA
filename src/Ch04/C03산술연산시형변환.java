package Ch04;

public class C03산술연산시형변환 {
	
	public static void main(String[] args) {
	

		
		//2 산술연산시 형변환 확인(+)
		//1)정수연산(int보다 작은 자료형간의 연산)
		
//		byte x = 10;
//		byte y = 20;
//		//byte result = x + y;  //컴파일에러, int자료형의결과값이
//							  //왼쪽 byte공간의 자료형과 불일치
//		int result = x + y;
		
		
		//2)정수연산(int보다 큰 자료형간의 연산)
		
//		byte x = 100;
//		int y = 200;
//		long z = 1000L;
//		
//		int result = (int)(x + y + z); //컴파일에러,long형으로 형변환된값을
//								//int공간에 대입하는과정에서 형변환불일치
//		//long result = x + y + z;
		
		
		//3)실수연산
		//우선순위 int < float < double
		int x = 10;
		float y = 3.3f;
		double z = 5.5;
		
		double result = x + y + z;
		
		
		
		
		
		
		
		
		
		
		
	}
}
