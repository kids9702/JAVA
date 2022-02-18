package Ch03;

public class C02진수서식문자 {
	
	public static void main(String[] args) {
	
		//10진 정수 서식문자 %d
		System.out.printf("10진수로 확인 : %d\n", 173);
		System.out.printf("10진수로 확인 : %d\n", 0255); 
		System.out.printf("10진수로 확인 : %d\n", 0xAD);
		
		//8진 정수 서식문자 %o
		
		System.out.printf("8진수로 확인 : %o\n", 173);
		System.out.printf("8진수로 확인 : %o\n", 0255); 
		System.out.printf("8진수로 확인 : %o\n", 0xAD);
		
		//16진 정수 서식문자 %x
		System.out.printf("16진수로 확인 : %x\n", 173);
		System.out.printf("16진수로 확인 : %x\n", 0255); 
		System.out.printf("16진수로 확인 : %x\n", 0xAD);
		
	}
	
}
