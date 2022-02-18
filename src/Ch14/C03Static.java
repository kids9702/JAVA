package Ch14;

class C03Simple{
	
	private static int num1;	//객체생성과는 무관하게 사용가능한 멤버
	int num2;
	
	public static int getNum1() {
		//num2=5; //객체생성전에는 사용 불가능한 멤버
		return num1;
	}
	public static void setNum1(int num1) {
		C03Simple.num1 = num1;
	}
	
}

public class C03Static {

	public static void main(String[] args) {
			C03Simple.setNum1(100);
			C03Simple.getNum1();

	}

}
