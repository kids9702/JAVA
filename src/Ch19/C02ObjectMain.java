package Ch19;

class C02Simple{
	int x;
	int y;
	C02Simple(int x, int y){
		this.x=x; this.y=y;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "X : "+x+" Y : "+y;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof C02Simple) {
			C02Simple down = (C02Simple)obj;
			//this.x == down.x && this.y == down.y;	//????
		}
		return false;
	}
	
	
	
}







public class C02ObjectMain {

	public static void main(String[] args) {

		C02Simple obj1 = new C02Simple(10,20);
		C02Simple obj2 = new C02Simple(10,20);
		C02Simple obj3 = new C02Simple(10,20);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj1==obj2);
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));

		
		String obj4 = new String("Hello");
		String obj5 = new String("Hello");
		
		System.out.println(obj4.toString());
	}

}
