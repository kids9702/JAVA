package Ch20;

public class C01Exception {

	public static void main(String[] args) {
		
		
		try {
		String data = null;
		System.out.println(data.toString());	//예외발생		
		}catch(NullPointerException e) {
			System.out.println("예외처리함");
			System.out.println("원인 : " + e.getCause());
			System.out.println("예외객체정보 : "+e.toString());
			System.out.println("추적하기 : "+e.getStackTrace());
			e.printStackTrace();
		}
		System.out.println("예외발생이후 처리될 코드1");
		System.out.println("예외발생이후 처리될 코드2");
	}

}
