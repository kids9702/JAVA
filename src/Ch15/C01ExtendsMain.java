package Ch15;


class Point2D{
	int x;
	int y;
	public void ShowPoint() {
		System.out.println("X : " + x + " Y : " + y);
	}
}

class Point3D extends Point2D{
	int z;	//확장
	public void ShowPoint3D() {	//확장
		ShowPoint();
		System.out.println("Z : " + z);
	}
}

public class C01ExtendsMain {

	public static void main(String[] args) {

		Point3D obj = new Point3D();
		obj.x=10;	//상속된 속성
		obj.y=20;	//상속된 송성
		//obj.ShowPoint();
		obj.z=30;	//추가된 속성
		obj.ShowPoint3D();//추가된 기능
		
		

	}

}
