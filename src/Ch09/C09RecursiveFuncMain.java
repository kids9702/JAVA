package Ch09;


class C09Simple{
	
	void Func(int num) {
		if(num==0)
			return;
		
		Func(num-1);
		System.out.println("Func함수 호출! : "+num);
	}
	
	int Factorial(int num) {	
		if(num==1)
			return 1;
		else
		{
			return num*Factorial(num-1);
		}
	}
}
public class C09RecursiveFuncMain {
	public static void main(String[] args) {
		
		C09Simple obj = new C09Simple();
		obj.Func(3);
		System.out.println("3!결과 : " + obj.Factorial(3));
	}
	
	//깃허브 테스트!

}
