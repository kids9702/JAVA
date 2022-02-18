package Ch17;

interface Tire {
	void run();
}
class KumhoTire implements Tire{

	@Override
	public void run() {
		System.out.println("금호타이어가 굴러간다.");
		
	}
	
}
class HankookTire implements Tire{

	@Override
	public void run() {
		System.out.println("한국타이어가 굴러간다.");
		
	}
	
}
class Car{
	Tire FL = new KumhoTire();
	Tire FR = new KumhoTire();
	Tire BL = new KumhoTire();
	Tire BR = new KumhoTire();
	
	void Start() {
		FL.run();
		FR.run();
		BL.run();
		BR.run();
	}
	
}

public class C02Main {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.Start();
		System.out.println("----------------");
		car1.FL=new HankookTire();
		car1.BR=new HankookTire();
		car1.Start();

	}

}
