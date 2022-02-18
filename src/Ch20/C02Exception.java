package Ch20;

public class C02Exception {

	public static void main(String[] args) {
		
		try {
		int [] arr = {10,20,30};
		
		for(int i=0;i<4;i++) {
			System.out.println(arr[i]);
		}
		

	
	}catch(Exception e) {
		System.out.println("예외처리시 실행코드");
	}finally {
		System.out.println("예외발생과 상관없이 무조건 실행되는 코드");
	}
	
	System.out.println("실행시킬 코드1");
	System.out.println("실행시킬 코드2");
	System.out.println("실행시킬 코드3");
}
}
