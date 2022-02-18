package Ch19;

class A{
	int x;
	int y;
	
	A(int x, int y){
		this.x=x;
		this.y=y;
	}

	@Override
	public String toString() {

		return "X : "+x+" Y : "+y;
	}
	
	
}


public class C01ObjectMain {

	public static void main(String[] args) {

		Object ob1 = new Object();
		A ob2 = new A(10,20);
		System.out.println(ob2.toString());
		System.out.println(ob2);
	}

}
