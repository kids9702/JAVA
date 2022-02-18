package Ch14;

class C02Point{
	
	//공유좌표
	static int x1;
	static int y1;
	//개별좌표
	int x2;
	int y2;
	
	C02Point(int x, int y){
		x2=x;y2=y;
	}
	
	public void DistanceXY() {
		System.out.println("기준점으로부터 X거리 : " + (x2-x1));
		System.out.println("기준점으로부터 Y거리 : " + (y2-y1));
	}
}

public class C02Static {

	public static void main(String[] args) {
		C02Point.x1=10;
		C02Point.y1=20;
		
		C02Point ob1=new C02Point(50,50);
		ob1.DistanceXY();
		C02Point ob2=new C02Point(30,30);
		ob1.DistanceXY();
	}

}
