package Ch15;

class C02Super{
	int x;
	int y;
	C02Super(){
		System.out.println("C02Super() 생성자 호출!");
	}
	C02Super(int x){
		this.x=x;
		System.out.println("C02Super(int) 생성자 호출!");
	}
	C02Super(int x,int y){
		this.x=x;
		this.y=y;
		System.out.println("C02Super(int,int) 생성자 호출!");
	}
}

class C02Sub extends C02Super{
	int z;
	
	C02Sub(){
		//super();
		System.out.println("C02Sub() 생성자 호출!");
	}
	C02Sub(int x, int y, int z){
		super(x,y);
		this.z=z;
		System.out.println("C02Sub(int,int,int) 생성자 호출!");
	}
	void ShowInfo() {
		System.out.println("X : " + x);
		System.out.println("Y : " + y);
		System.out.println("Z : " + z);
	}
	
	
}


public class C02ExtendsMain {

	public static void main(String[] args) {

		C02Sub obj = new C02Sub(10,20,30);
		obj.ShowInfo();

	}

}
