package Ch15;

class C06Simple{
	int share;
	
	
	void Insertobj(C06Simple obj) {//C06Simple obj = new A();
		obj.share=100;
		if(obj instanceof A)	//A클래스로 만든 객체?
		{
			A down = (A)obj;
			down.a=200;	//확장된 멤버에 접근가능
			System.out.println("A객체가 들어옴 a값 : " + down.a);
		}
		else if(obj instanceof B)	//obj로 연결한 객체가 B클래스로 만든 객체냐?
		{
			B down = (B)obj;	//다운캐스팅
			down.b = 300;	//확장된 멤버에 접근가능
			System.out.println("B객체가 들어옴 b값 : " + down.b);
		}
	}
}

class A extends C06Simple {int a;}
class B extends C06Simple {int b;}

public class C06UpDownCasting {

	public static void main(String[] args) {
			C06Simple obj = new C06Simple();
			obj.Insertobj(new A());
			obj.Insertobj(new B());
			
	}

}
