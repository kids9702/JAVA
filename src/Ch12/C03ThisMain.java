package Ch12;

//this 매개변수와 멤버변수를 구별
class C03Simple{
	int x;	//멤버변수
	int y;	//멤버변수
	C03Simple(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	void ShowXY() {
		System.out.println("X : " + this.x);
		System.out.println("Y : " + this.y);
	}
	
	void ShowThis() {
		System.out.println("THIS : " + this);
		
		
	}
	
}

public class C03ThisMain {

	public static void main(String[] args) {

			C03Simple obj = new C03Simple(10,20);
			System.out.println("OBJ : " + obj);
			obj.ShowThis();
	}

}
