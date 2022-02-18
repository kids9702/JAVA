package Ch04;

public class C04StringTypeChange {

	public static void main(String[] args) {
//		1 문자열 + 문자열 연산
//		System.out.println("문자열1" + "문자열2");
//		System.out.println("문자열1" + 33);
//		System.out.println(33+"문자열"+ 44);
//		System.out.println(33+44+"1");
		
		//2 문자열 ->숫자형  변환
		//"123" -> 123
		
		System.out.println("10" + "20");	//문자열형태의 숫자
		System.out.println(10+20); 			//기본자료형
		
		int n1 = Integer.parseInt("10");
		int n2 = Integer.parseInt("20");
		System.out.println(n1 + n2);
		
		//문자열 -> 숫자형 변환(실수)
		double n3 = Double.parseDouble("10.3");
		double n4 = Double.parseDouble("15.6");

		
		//숫자형 -> 문자형 변환
		int n5 = 10;
		double n6 = 10.4;
		System.out.println(n5+n6);
		String str1 = String.valueOf(n5);
		String str2 = String.valueOf(n6);
		
		System.out.println(str1 + str2);
		

		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		int result =(int)var1 + (int)(var2 + var3) + (int)Double.parseDouble(var4);
		System.out.println(result);
		
//		int = Integer.parseInt(str2)
//		double = Double.parseDouble("10.2")
//		float = Float.parseFloat("10.2");
//		byte = Byte.parseByte("10");
		
		
	}

}
