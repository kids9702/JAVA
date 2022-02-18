package Ch16;

class par1{
	//일반메서드(완성형)
	void func1() {}
	
}
class son1 extends par1{
	//메서드 재정의
	//void func1() {System.out.println("SON1에서 재저의한 메서드");}
}

abstract class par2{
	//추상메서드
	abstract void func2();
}
class son2 extends par2{

	@Override
	void func2() {
		System.out.println("SON2에서 재정의한 매서드");
		
	}
	
}



public class C01AbstractMain {

	public static void main(String[] args) {
		//일반클래스
//		par1 obj1 = new par1();	//상위클래스 객체생성 가능
//		son1 obj2 = new son1();	//하위클래스 객체생성 가능
//		par1 obj3 = new son1();	//UPCasting
//		obj3.func1();	//재정의함수 사용가능
		
		//추상클래스
		//par2 obj4 = new par2();	//추상클래스로 객체 생성불가능
		son2 obj5 = new son2();	//자식클래스로 객체생성가능(메서드 재정의를 해야된다)
		par2 obj6 = new son2();	//업캐스팅
		obj6.func2();
		

	}

}
