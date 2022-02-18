package Ch14;

//자바 메모리 영역

//스택영역 : {}내에서 생성되는 변수
//힙영역 : 객체가 저장되는 공간
//클래스(메서드)영역 : 공유메모리영역, static변수,static메서드
//				   일반메서드,생성자메서드


//static 예약어로 변수를 만들면 해당변수는 
//단일클래스에서 공유목적으로 사용할 메모리 공간으로 사용된다.
//static예약어를 통해서 객체를 생성하지 않아도 사용할 수 있는
//공간을 만들수가 있으며, 해당공간은 클래스이름으로도 접근이 가능하다.

class C01Simple{
	static int num1=0;	//공유변수
	int num2;			//멤버변수(필드)
	
	void ShowNum() {
		System.out.println("num1 : " + num1 +" num2 : " + num2);
	}
}

public class C01StaticMain {

	public static void main(String[] args) {
			C01Simple obj1 = new C01Simple();
			C01Simple obj2 = new C01Simple();
			
			obj1.num1=100;	//static num1의 값 100
			obj1.num2=200;
			
			obj2.ShowNum();
			
			obj2.num1=5000;	//static num1의 값 5000
			obj2.num2=300;
			
			obj1.ShowNum();
			
			C01Simple.num1=20000;
			obj1.ShowNum();
			obj2.ShowNum();
		
		

	}

}
