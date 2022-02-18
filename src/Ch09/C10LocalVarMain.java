package Ch09;

//지역변수 : {} 내에서 선언되는 변수
//바깥 지역에 있는 변수는 안쪽 지역에서 사용가능
//지역변수는 {}가 끝나는 지점에서 소멸된다

class C10Simple{

	int num1=10;
	void Func1() {
		num1++;
		System.out.println("num1 : " + num1);
		int num1=100; //지역변수 생성(지역변수의 이름이 중복되었을때
		num1++;		  //해당지역에 있는 변수를 따른다.
		System.out.println("num1 : " + num1);
				
		
		
		
		
	}
	void Func2() {
		num1++;
		System.out.println("num2 : " + num1);
		if(true) {
			
			int num1=200;
			System.out.println("num1 : " + num1);
		}
		System.out.println("num1 : " + num1);
	}
	void Func3() {
		num1++;
		System.out.println("num3 : " + num1);
		while(num1<15) {
			
			System.out.println("num1 : " + num1);
			int num1=1;
			num1++;
		}
	}
	void Func4() {
		num1++;
		System.out.println("num4 : " + num1);
	}
	
	
	
}

public class C10LocalVarMain {

	public static void main(String[] args) {

		C10Simple obj = new C10Simple();
		//obj.Func1();
		//obj.Func2();
		obj.Func3();
		//obj.Func4();

	}

}
