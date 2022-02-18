package Ch09;
//생성자메서드 : 객체생성시 필요한 초기값을 전달하는 특수메서드
//생성자메서드는 반환형이 없고, 한번만 호출이 가능
class C12Simple{
	//속성
	int x;
	float y;
	boolean z;
	String str;
	
	C12Simple(){
		x=10;y=20.5f;z=true;str="Hello";
	}
	
	
}


public class C12ConstructorMain {

	public static void main(String[] args) {
		C12Simple obj = new C12Simple();
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.z);
		System.out.println(obj.str);
		

	}

}
