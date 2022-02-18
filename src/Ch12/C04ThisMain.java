package Ch12;

class C04Simple{
	int x;
	int y;
	int z;
	C04Simple(){
//		x=10;
//		y=20;
//		z=30;
		this(10,20,30);	//3개 인자를 받는 생성자 호출
		
	}
	C04Simple(int x){
//		this.x=x;
//		y=200;
//		z=300;
		this(x,200,300);
	}
	C04Simple(int x, int y){
//	this.x=x;
//	this.y=y;
//	z=3000;
		this(x,y,3000);
	}
	C04Simple(int x,int y, int z){
	this.x=x;
	this.y=y;
	this.z=z;
	}
	//메서드
	void ShowXYZ() {
		System.out.printf("X:%d Y:%d Z:%d\n",x,y,z);
	}
}


public class C04ThisMain {

	public static void main(String[] args) {
		C04Simple obj1 = new C04Simple();
		C04Simple obj2 = new C04Simple(5);
		C04Simple obj3 = new C04Simple(60,88);
		C04Simple obj4 = new C04Simple(4,55,8);
		obj1.ShowXYZ();
		obj2.ShowXYZ();
		obj3.ShowXYZ();
		obj4.ShowXYZ();
		

	}

}
