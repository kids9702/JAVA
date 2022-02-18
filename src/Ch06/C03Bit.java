package Ch06;

public class C03Bit {

	public static void main(String[] args) {
	
		int num1 = 15;		 //00000000 00000000 00000000 00001111
		int num2 = 20;		 //00000000 00000000 00000000 00010100
		
		int num3 = num1&num2;//00000000 00000000 00000000 00000000
		int num4 = num1|num2;//00000000 00000000 00000000 00000000
		int num5 = num1^num2;//00000000 00000000 00000000 00000000
		int num6 = ~num1;	 //00000000 00000000 00000000 00000000
		int num7 = num1<<2;  //00000000 00000000 00000000 00111100
		int num8 = num1>>3;  //00000000 00000000 00000000 00000001
		
		
		System.out.println("AND비트 연산 : " + num3);
		System.out.println("OR비트 연산 : "  + num4);
		System.out.println("XOR비트 연산 : " + num5);
		System.out.println("NOT비트 연산 : " + num6);
		System.out.println("num1<<2연산 : " + num7);
		System.out.println("num1>>3연산 : " + num8);
		
		
		

	}

}
