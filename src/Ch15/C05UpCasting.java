package Ch15;

class C05Super{
	int num1;
	public void sound() { System.out.println("소리내기");}
}
class C05sub extends C05Super{
	int num2;	//확장
	public void sound() { System.out.println("sub에서 재정의한 소리내기");}
	
	public void move() {System.out.println("이동하기");}	//확장
}





public class C05UpCasting {

	public static void main(String[] args) {

		System.out.println("-------------");
		C05Super obj1 = new C05Super();
		C05Super obj2 = new C05Super();
	
		
		System.out.println("-------------");
		C05sub obj3 = new C05sub();
		C05sub obj4 = new C05sub();
		
		System.out.println("-------------");
		//UPcasting
		//상위클래스의 참조변수 = 하위객체 
		C05Super obj5 = new C05sub();
		obj5.num1=10;
		obj5.sound();	  //
		//obj5.num2=20(); //X 확장된 하위멤버 접근 불가능
		//obj5.move();	  //X 확장된 하위멤버 접근 불가능
		
		//Downcasting : 확정된 하위객체의 멤버에 접근
//		C05sub down = (C05sub)obj5;
//		down.num1=100;
//		down.num2=200;
//		down.move();
		
		//01 NoCast
		//02 Upcasting
		//->상위클래스의 참조변수 = 하위객체
		//->상속관계의 모든 하위클래스를 연결할 수 있다.
		//->확장된 멤버에는 접근 불가능
		//->재정의된 멤버에는 접근 가능★★★★★★★★★★★★★★★★★★
		
		//03Downcasting
		//->Upcasting 된 상태에서 확장된 멤버에 접근가능하도록 하기위해 사용되는 강제 형변환 문법
	
		
		
	}

}
