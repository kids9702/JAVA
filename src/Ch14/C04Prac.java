package Ch14;

class C04Store{
	//제품할인율(static member)
	//colasale : static douuble
	//coffeesale : static double
	//제품당가격
	//colaprice : int
	//coffeeprice : int
	//지점명
	//StoreName : String
	//생성자
	//지점명, 커피가격, 콜라가격을 인자로 받음
	//일반 메서드
	//ShowPrice():void
	//->지점명 콜라가격, 커피가격을 할인율이 적용된 값으로 출력한다.
	//예
	//====GS감삼점====
	//커피 : 1430원(할인율:0.03)
	//콜라 : 990원(할인율:0.24)
	
	//필드
	static double colasale;
	static double coffeesale;
	
	int colaprice;
	int coffeeprice;
	
	String StoreName;
	
	//생성자
	C04Store(int cola,int coffee){
		
		colaprice=cola;
		coffeeprice=coffee;
	}
	
	//메서드
	public void ShowInfo() {
		
		System.out.println("====="+StoreName+"=====");
		System.out.println("콜라 가격 : " + (colaprice+(colaprice*colasale)));
		System.out.println("커피 가격 : " + (coffeeprice-(coffeeprice*coffeesale)));
	}
	
	
	
	

public class C04Prac {

	public static void main(String[] args) {
			C04Store.coffeesale=0.03;
			C04Store.colasale=0.03;
			
			C04Store GS감삼 = new C04Store(1000,1500);
			C04Store GS반월당 = new C04Store(2000,3000);
			GS감삼.ShowInfo();
			GS반월당.ShowInfo();
		

	}

}
}